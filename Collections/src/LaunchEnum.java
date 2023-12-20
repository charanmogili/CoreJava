
//NORTH SOUTH EAST WEST
//MALE FEMALE OTHERS

enum Directions{
	NORTH, SOUTH, EAST, WEST;  //static final
}

enum Gender{
	MALE,FEMALE,OTHERS;
	//MALE -->public static final Result PASS=new Result();
	Gender(){ //constructor inside enum should not be public
		System.out.println("Inside Gender Constructor");
	}
}
//enum Result{
//	PASS,FAIL,NR;
//}



public class LaunchEnum {

	enum Result{
		PASS,FAIL,NR;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gender g=Gender.MALE;
		System.out.println(g);
		
	}

}
