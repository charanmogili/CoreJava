
@FunctionalInterface
interface AdditionOperations{
	int add(int i,int b);
}

@FunctionalInterface
interface SubractionOperations{
	int sub(int i,int b);
}

public class LamdiPractice01 {

	public static void main(String[] args) {

		AdditionOperations addOperation=(i,j)->i+j;
		System.out.println(addOperation.add(2, 4));
		
		SubractionOperations subOperation=(a,b)->a-b;
		System.out.println(subOperation.sub(9, 2));
	}

}
