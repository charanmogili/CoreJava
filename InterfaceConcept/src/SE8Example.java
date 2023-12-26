interface Greeting{
    default void hello() {
	System.out.println(" hello from A");
    }
}

interface GreetingExtn extends Greeting{
    default void hello() {
	System.out.println(" hello from Greeting");
     }
}

// class Greet {   //comment and uncomment this class to try more possibilities
//     public void hello()  {
//         System.out.println("hello from Greet");
//     }
// }

class SE8Example implements Greeting, GreetingExtn{
   public static void main(String[] args) {
	    new SE8Example().hello();
   }
}