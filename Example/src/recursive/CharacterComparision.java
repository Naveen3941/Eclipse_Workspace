package recursive;

public class CharacterComparision {

	public static void main(String[] args) {
		String s="javaProgramming";
		for(int i=0;i<s.length();i++)
		{
			
			if(s.substring(i,i+1).equals(s.substring(i,i+1).toUpperCase()))
			{
				System.out.println(s.substring(i,i+1));
			}
			
		}

	}

}
