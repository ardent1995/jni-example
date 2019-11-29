public class HelloJNI {
   static {
      System.loadLibrary("hello"); // Load native library hello.dll (Windows) or libhello.so (Unixes)
                                   //  at runtime
                                   // This library contains a native method called sayHello()
   }

   private native void sayHello();
 
   public static void main(String[] args) {
      new HelloJNI().sayHello();
   }
}
