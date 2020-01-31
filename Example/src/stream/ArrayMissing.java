package stream;

public class ArrayMissing {

	public static void main(String[] args) {
		int count1 = 1;
		int count2 = 0;
		int count3 = 1;
		for (int i = 1; i <= 50; i++) {

			if (count1 > 3) {
				count2++;
				if (count2 == count3) {
					count1 = 0;
					count3++;
					count2 = 0;
				}

			} else {
				System.out.println(i);
			}
			count1++;
		}

	}

}
