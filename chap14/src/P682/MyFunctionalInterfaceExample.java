package P682;

public class MyFunctionalInterfaceExample {

	   public static void main(String[] args) {
	      MyFunctionalInterface fi;
	      
	      fi = () -> {
	         String str = "method call1";
	         System.out.println(str);
	      }; // 익명 객체 
	      
	      fi.method();
	   
	      
	      fi = () -> { 
	         System.out.println("method call2"); };
	      fi.method();
	      
	      fi = () ->  System.out.println("method call3");
	      fi.method();
	      
	   }
	}