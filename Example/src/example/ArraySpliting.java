package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraySpliting {

	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 7, 2, 3, 8, 9, 3, 11, 12, 11 };
		List<Integer> l1 = new ArrayList<>();
		Integer[] res = new Integer[5];
		int con = 0;
		int c = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			 c=0;

			for (int j = con; j < i; j++) {

				if (a[i] == a[j]) {
					for (int k = con; k < i; k++) {
						res[c] = a[k];
						c++;
					}
					for(int n:res)
					{
					System.out.println(n);
					}
					Collections.addAll(l1, res);
                    System.out.println(l1);
					System.out.println(a[i] + " " + a[j]);
				}

			}
			 con=i;
		}
		System.out.println(l1);

	}

}
