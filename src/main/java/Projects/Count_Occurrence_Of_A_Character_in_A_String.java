package Projects;

public class Count_Occurrence_Of_A_Character_in_A_String {

	public static void main(String[] args)
	{
		String sampleString = "VipulGandhi";
		
		for (int i = 0; i < sampleString.length(); i++)
		{
			for (int j = i+ 1; j < sampleString.length(); j++)
			{
				if(sampleString.charAt(i) == sampleString.charAt(j))
				{
					System.out.println(sampleString.charAt(i));
				}
			}
		}
	}
}
