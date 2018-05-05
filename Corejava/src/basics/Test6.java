package basics;

public class Test6 {

	
	public static void main(String[] args) 
	
	{

		{//data members opening
		     Test5 obj=new Test5();
		//jvm run default and given constructor for obj
				System.out.println(obj.x);
				System.out.println(obj.y);
				System.out.println(obj.z);
				System.out.println(obj.w);
				System.out.println(obj.s);

	} //data member closing
		
		//when data members block is closedfor both  then output will come for both 
		
		{//data members opening
		     Test5 obj=new Test5((float)67.8,"steve jobs");
		//jvm run default and given constructor for obj
				System.out.println(obj.x);
				System.out.println(obj.y);
				System.out.println(obj.z);
				System.out.println(obj.w);
				System.out.println(obj.s);

	} //data member closing


	}

}
