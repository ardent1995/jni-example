class Child extends Parent{
	static{
		System.loadLibrary("myjni");
	}

	public void m1(){
		System.out.println("Child Implementation");
	}

	public native void m2();

	public static void main(String[] args){
		Child obj = new Child();
		obj.m2();
	}
}
