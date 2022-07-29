package a26_7;

public class CompareEx 
{
public static void main(String[] args) {
		
		String s1="sachin";
		String s2=new String("sachin");
		String s3="SACHIN";
		
		//equals,equalsignorecase
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		//==
		
		System.out.println(s1==s2);
		
		//compareTo
		
		String s4="sachin";
		String s5="sachin";
		String s6="abcd";
		
		System.out.println(s4.compareTo(s5));
		System.out.println(s4.compareTo(s6));
		
		
	}

}
