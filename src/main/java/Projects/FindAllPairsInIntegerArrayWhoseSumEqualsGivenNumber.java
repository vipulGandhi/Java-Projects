// Find all pairs on integer array whose sum is equal to given number


package Projects;

import java.util.Arrays;
import java.util.List;

public class FindAllPairsInIntegerArrayWhoseSumEqualsGivenNumber
{
	public static void main(String[] args)
	{
		List<Integer> sampleIntegerArray = Arrays.asList(1, 2, 3, 4, 5, 6, 7, -1);
		
		int sum = 6;
		
		for (int i = 0; i < sampleIntegerArray.size(); i++)
		{
			for (int j = i + 1; j < sampleIntegerArray.size(); j++)
			{
				if(sampleIntegerArray.get(i) + sampleIntegerArray.get(j) == sum)
				{
					System.out.println(sampleIntegerArray.get(i) +" "+ sampleIntegerArray.get(j));
				}
			}
		}
	}
}
