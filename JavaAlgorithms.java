import java.util.ArrayList;
import java.util.HashMap;

public class JavaAlgorithms 
{
	/*
	 * INPUT: Accepts an ArrayList of positive integers.
	 * OUTPUT: Returns the value that is duplicated in the input list.
	 *         Returns -1 if no duplicate is found.
	 * NOTE: Performance is better than O(n^2). I think this is O(nLogn)?
	 */
	public static int ReturnDuplicate(ArrayList<Integer> list)
	{
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for(int memberOfList : list)
		{
			if(hm.get(memberOfList)==null)
				hm.put(memberOfList, memberOfList);
			
			else // first sign of a duplicate value.
				return hm.get(memberOfList);
		}
		return -1;
	}
}
