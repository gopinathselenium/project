
public class Test9 
{
	//data members
	public int x,y,z;
	
	
	
	
	//constructor method
	public Test9()
	{
		x=10;
		y=20;
	}
	
	
	
	
	//operational methods
	public int add() //own constructor without argument
	{
		z=x+y;
		return(z);
				
	}
	  
	
	
   public int add(int a)//own constructor name as add with single argument
   {
	   x=a;
	   z=x+y;
	   return(z);
   }
   
   
   
   public int add(int a,int b)//own constructor name as add with two arguments
   {
	   x=a;
	   y=b;
	   z=x+y;
	   return(z);
   }
   
   
   
   
}//class closing
