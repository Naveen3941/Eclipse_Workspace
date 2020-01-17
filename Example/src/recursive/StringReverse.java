package recursive;

public class StringReverse {
	
	public static  String reverse(String res)
	{
		if(res.length()<=1)
{
	return res;
}
		return reverse(res.substring(1))+res.charAt(0);
	}

	public static void main(String[] args) {
	
        String a="abcdefghijklmn";
        System.out.println(reverse(a));
        
        
	}

}
