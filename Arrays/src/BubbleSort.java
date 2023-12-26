
public class BubbleSort {

	public static void main(String[] args) {
		int[] a= {7,3,5,2,6,1,4};
		
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length;j++)
			{
				if(a[j]<a[j-1])
				{
				temp=a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
				}
			}
		}
		for(int elem:a)
		{
			System.out.print(elem+" ");
		}

	}

}
