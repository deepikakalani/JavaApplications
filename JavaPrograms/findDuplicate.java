import java.util.ArrayList;
import java.util.List;

public class findDuplicate{
	public static void main(String[] args)
	{
		List<Integer> numbers = new ArrayList<Integer>();
		for(int i=0; i<10; i++)
		{
			numbers.add(i);
		}
		numbers.add(5);
		int HighestNumber = numbers.size() - 1;
		int sum=0;
		for(int num:numbers)
		{
			sum += num;
		}
		int duplicate = sum - (HighestNumber *(HighestNumber + 1))/2;
		if (duplicate == '0')
		{
			System.out.println("No duplicate found");
		}
		System.out.println("Duplicate is:" + duplicate);
		
	}

}



