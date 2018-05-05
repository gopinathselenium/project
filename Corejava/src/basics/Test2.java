package basics;

public class Test2 

{                //class opening

	public static void main(String[] args)
	{               // data member opening 
		Test1 obj=new Test1();
//jvm run default constructor for obj
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.z);
		System.out.println(obj.w);
	} //data member closing

}    //class closing
//Test2 is runner class or Executable class from Test2 class we are connecting Test1
