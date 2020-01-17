package recursive;

public class Anagram {

	public static void main(String[] args) {
boolean flag1=true;
boolean flag2=true;

String s1="School MASTER";
String s2="The ClassROOM";
String s3=" ";
for(int i=0;i<s1.length();i++)
{
	
		
		if(s2.toLowerCase().contains(s1.substring(i,i+1).toLowerCase())&& !s1.substring(i,i+1).equals(s3))
		{
			
			System.out.println(s1.substring(i,i+1));
		}
		else if(!s1.substring(i,i+1).equals(s3))
		{
				flag1=false;
			}
		
}
for(int i=0;i<s2.length();i++)
{
	
		
		if(s1.toLowerCase().contains(s2.substring(i,i+1).toLowerCase())&& !s2.substring(i,i+1).equals(s3))
		{
			
			System.out.println(s2.substring(i,i+1));
		}
		else if(!s2.substring(i,i+1).equals(s3))
		{
				flag2=false;
			}
		
}

if(flag1==flag2)
{
	System.out.println("Anagram");
}
else
{
	System.out.println("Not Anagram");
}



	}

}
