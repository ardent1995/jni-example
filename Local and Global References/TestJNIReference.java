public class TestJNIReference {
   static {
      System.loadLibrary("myjni"); // myjni.dll (Windows) or libmyjni.so (Unixes)
   }
 
   // A native method that returns a java.lang.Integer with the given int.
   private native Integer getIntegerObject(int number);
 
   // Another native method that also returns a java.lang.Integer with the given int.
   private native Integer anotherGetIntegerObject(int number);
 
   public static void main(String args[]) {
      TestJNIReference test = new TestJNIReference();
      System.out.println("In Java, "+test.getIntegerObject(1));
      System.out.println("In Java, "+test.getIntegerObject(2));
      System.out.println("In Java, "+test.anotherGetIntegerObject(11));
      System.out.println("In Java, "+test.anotherGetIntegerObject(12));
      System.out.println("In Java, "+test.getIntegerObject(3));
      System.out.println("In Java, "+test.anotherGetIntegerObject(13));
   }
}
