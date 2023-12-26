
public class MergeSort {
	
	
	static void conquer(int ar[],int beg,int end,int mid)
	{
		int merged[]=new int[end-beg+1];
		
		int idx1=beg;
		int idx2=mid+1;
		int x=0;
		
		while(idx1<=mid && idx2<=end)
		{
			if(ar[idx1]<=ar[idx2])
			{
				merged[x++]=ar[idx1++];
			}
			else
			{
				merged[x++]=ar[idx2++];
			}
		}
		while(idx1<=mid)
		{
			merged[x++]=ar[idx1++];
		}
		while(idx2<=end)
		{
			merged[x++]=ar[idx2++];
		}
		for(int i=0,j=beg;i<merged.length;i++,j++)
		{
			ar[j]=merged[i];
		}
	}
	static void divide(int ar[],int beg,int end)
	{
		if(beg>=end) 
		{
			return;
		}
		  int mid=beg+(end-beg)/2;
		  divide(ar,end,mid);
		  divide(ar,mid+1,beg);
		  conquer(ar,beg,mid,end);
	}
	
	public static void main(String[] args) {
		
		int[] ar= {12,31,25,8,32,17,40,42};
		int n=ar.length;
		
		divide(ar,0,n-1);
		for(int i=0;i<n;i++)
		{
			System.out.println(ar[i]+" ");
		}
	}
}
