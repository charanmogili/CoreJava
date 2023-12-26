import com.sun.net.httpserver.Authenticator.Result;

enum Compass{
	EAST,WEST,NORTH,SOUTH;   //static final
	//public static final Compass EAST=new Compass();
	Compass(){
		System.out.println("Constructor in Compass");
	}
}
class MyEnum{
    enum GENDER{
       	MALE,FEMALE,OTHERS;
       	
    }
}
public class LaunchEnum {

	public static void main(String[] args) {
		Compass east = Compass.EAST;
		System.out.println(east);
		
		int ordinal = Compass.EAST.ordinal();
		System.out.println(ordinal);
	}

}
