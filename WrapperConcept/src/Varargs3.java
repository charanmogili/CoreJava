
public class Varargs3 {

	public static void main(String[] args) {
		 Test4 t= new Test4();
		    int[] a= {10,20,30};
                 int[] b= {30,40};

                 t.methodOne(a,b);
     }
}

class Test4
{
       public void methodOne(int[]... x){
          for(int[] OneD: x){
		      for(int element:OneD)
		      {
		             System.out.print(element+" ");
              }
		System.out.println();
          }
        }
}