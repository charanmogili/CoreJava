
public class Duplicate 
{
	public static void main(String[] args) 
	{
		int[] ar= {10,20,30,10,20,40,50,20};
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j] & i!=j)
				{
					count++;
					//System.out.println("Duplicate element "+ar[j]);
					ar[j]='0';
				}
			}
			if(count>1 && ar[i]!='0')
			{
			System.out.println(ar[i]);
			}
		}
	}
}
