package assignmentweek3.day2;

public class PalindromeString {
public static void main(String[] args) {
		
	String str = "madam";
	String rev = "";
	
	int length = str.length();
	
	for(int i=length-1;i>=0;i--)
	{
		rev = rev+str.charAt(i);
	}

	if(str.equals(rev))
		System.out.println("palindrome");
	else
		System.out.println("not a palindrome");

	}



}
