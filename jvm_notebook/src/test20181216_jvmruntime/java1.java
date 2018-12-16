package test20181216_jvmruntime;

class SuperClass{
	SuperClass(){
		System.out.println("init_SuperClass2");
	}
	static {
		System.out.println("init_SuperClass");
	}
}

public class java1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SuperClass s1 = new SuperClass();
		
		//덜쯤헌데7-4
		//System.out.println(Sub.A);
	}

}

//덜쯤헌데7-4
class FieldResolution{
	interface Interface0{
		int A = 0;
	}
	
	interface Interface1 extends Interface0{
		int A = 3;
	}
	
	interface Interface2{
		int A = 2;
	}
	
	static class Parent implements Interface1{
		public static int A = 3;
	}
	
	static class Sub extends Parent implements Interface2{
		public static int A = 4;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SuperClass s1 = new SuperClass();
		
		//덜쯤헌데7-4
		System.out.println(Sub.A);
	}
}

//덜쯤헌데7-6 test
class DeadLoopClass{
	static {
		if(true) {
			System.out.println("init_SuperClass");
			while(true) {
				
			}
		}
	}
}
