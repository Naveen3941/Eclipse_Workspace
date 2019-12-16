package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Gst {
	
	public static void main(String[] args) {
		
	
	
    ArrayList<String> arrayList = new ArrayList<>();
    
    arrayList.add("wrangler");
    arrayList.add("wrangler");
    arrayList.add("pepe");
    arrayList.add("pepe");
    arrayList.add("armani");
    arrayList.add("armani");
    arrayList.add("armani");
    arrayList.add("armani");
    arrayList.add("wrangler");
    arrayList.add("pepe");
    arrayList.add("pepe");
    arrayList.add("pepe");
    arrayList.add("wrangler");
    arrayList.add("wrangler");
    arrayList.add("wrangler");
   
    HashSet<String> hashset = new HashSet<>();
    int count=0;
    for(String str:arrayList) {
        int frequency = Collections.frequency(arrayList, str);
        if(frequency>count) {
            count=frequency;
        }
    }
    for(String str:arrayList) {
        int frequency = Collections.frequency(arrayList, str);
        if(count==frequency) {
            hashset.add(str);
        }
    }
   
    //System.out.println(hashset);
    List<String> list = new ArrayList<String>(hashset);
    Collections.sort(list);
    System.out.println("sorted order:"+list);
   
}

}
