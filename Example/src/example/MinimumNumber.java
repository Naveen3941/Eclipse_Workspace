package example;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class MinimumNumber {

	public static void main(String[] args) {
		int a[]= {4,2,8,1,20,9,23,11,1};
	    int min=IntStream.of(a).min().getAsInt();
		System.out.println(min);
		IntSummaryStatistics i1=IntStream.of(a).summaryStatistics();
		System.out.println(i1.getCount());
		System.out.println(i1.getMin());
		System.out.println(i1.getCount());
		System.out.println(i1.getSum());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
           IntStream.of(a).distinct().sorted().limit(3).forEach(System.out::print);
	}

}
