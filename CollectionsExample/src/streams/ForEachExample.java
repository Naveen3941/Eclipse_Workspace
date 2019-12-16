package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.omg.Messaging.SyncScopeHelper;

public class ForEachExample {

	public static void main(String[] args) {
		String a = "javatpoint";
		String res = a.substring(0, 4);
		List<String> l1 = new ArrayList<>();
		l1.add("aaa");
		l1.add("zzz");
		l1.add("xzz");
		l1.add("bzz");
		l1.add("mzz");
		List<String> l2 = l1.stream().map(x -> x.substring(0, 2)).collect(Collectors.toList());
		List<String> l3 = l1.stream().sorted().collect(Collectors.toList());
		List<String> l4 = l1.stream().filter(s -> s.endsWith("z")).collect(Collectors.toList());
		List<Integer> number = Arrays.asList(2, 3, 4, 5, 9);
		int a123[]= {2, 3, 4, 5, 9};
		String a124[]= {"aaa","ccc","bbb","zzz"};
		int even = number.stream().filter(x -> x % 2 == 0).reduce(0, (a1, a2) -> a1 + a2);
		number.stream().forEach(y -> System.out.println(y));
		int min=IntStream.of(a123).min().getAsInt();
				System.out.println(IntStream.of(a123).min());
				IntSummaryStatistics statistics=IntStream.of(a123).summaryStatistics();
				System.out.println(statistics+"??????????????");
				System.out.println("***********");
				IntStream.of(a123).distinct().sorted().limit(3).forEach(System.out::print);
				System.out.println("***********");
				IntStream.range(1,3).forEach(System.out::print);
		System.out.println(even);
		System.out.println(l2);
		System.out.println(l3);
		System.out.println(l4);

	}

}
