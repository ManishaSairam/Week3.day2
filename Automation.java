package assignmentweek3.day2;

public class Automation extends MultipleLanguage 
{	
	public void Selenium() 
	{
		System.out.println("Selenium is an Automation tool");
		
	}

	public void Java() 
	{
		System.out.println("Java is a programming language");
		
	}
	
	public void Ruby() 
	{
		System.out.println("Ruby is also one of language ");
	}

	public static void main(String[] args) 
	{
		Automation dd = new Automation();
		dd.Java();
		dd.Selenium();
		dd.Python();
		dd.Ruby();
	}

}