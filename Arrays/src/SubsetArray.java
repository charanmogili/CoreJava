
public class SubsetArray {

	public static void main(String[] args) {
		int[] ar1 = {10,20,30,40,50,60};
		int[] ar2 = {30,50,10,};
		int flag=0;
		
		for(int elem1:ar2)
		{
			for(int elem2:ar1)
			{
				if(elem2==elem1 & ar2.length<ar1.length)
				{
					flag++;
				}
			}
		}
		if(flag!=ar2.length) 
		{
			System.out.println("ar2 is not a subset of ar1");
		}
		else
		{
			System.out.println("ar2 is a subset of ar1");
		}
	}
}
