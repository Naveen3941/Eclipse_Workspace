package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEmpty {

	public static void main(String[] args) {
		Stream<String> st1=Stream.empty();
        st1.forEach(System.out::println);
      //Array to Stream
        String[] arr1= {"W","E","L","C","O","M","E"};
        Stream<String> st2=Arrays.stream(arr1);
        st2.forEach(System.out::println);
        
      //var-args to stream
        Stream<String> st3=Stream.of("T","O","A","L","L");
        st3.forEach(System.out::println);
        
        
      //List/Arrays.asList to Stream
        List<String> al1=Arrays.asList("N","I","T");
        Stream<String> st4=al1.stream();
        st4.forEach(System.out::println);
//        List<String> al2=List.of("R","A","G","H","U");
//        Stream<String> st5=al2.stream();
//        st5.forEach(System.out::println);
	}

}
