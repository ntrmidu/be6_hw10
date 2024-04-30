package be6_hw10;

public class Sort {

	public static void main(String[] args) {

		int[] array = {1,2,1,2,2,2,1,2,1,0,0,2,1,2,0,0};
		Sorting(array);

	}

	public static void Sorting(int[] array) {
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				count0++;
			} else if (array[i] == 1) {
				count1++;
			} else {
				count2++;
			}
		}

		int j = 0;
		do {
			array[j++] = 0;
			count0--;
		} while (count0 > 0);
		do {
			array[j++] = 1;
			count1--;
		} while (count1 > 0);
		do {
			array[j++] = 2;
			count2--;
		} while (count2 > 0);

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}

	}

}
