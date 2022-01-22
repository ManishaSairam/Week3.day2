package assignmentweek3.day2;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElementInAnArray {
	public static void main(String[] args) 
	{
		List<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3,4,7,6,8));
		Collections.sort(arr);
		for(int i=1; i<=arr.size()+1; i++)
		{
			if(!arr.contains(i))
			{
				System.out.println("Missing element is " +i);
			}
		}
	}

}
