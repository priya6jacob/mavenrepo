package practice;

public class ChildClass extends ParentClass {
	public void sub()
	{
		int a=20;
		int b=10;
		int c=a-b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		ChildClass cc=new ChildClass();
		cc.add();
		cc.sub();
		
		

	}

}
