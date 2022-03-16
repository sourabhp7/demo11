package StudentDeatils;

public class StaticExample {
      
	int a,b;   //non static variable 
	static int c; //static variable 
	
	void get() // can access static as well as non static variable 
	{
		a=10;
		b=20;
		c=30;
	}
	//static methods can access only static variables of class
	//to access non static we need to make class object 
	static void put() 
	                   
	{   StaticExample r= new StaticExample();
		r.a=22;
		r.b=33;
		c=44;
	}
	public static void main(String[] args) 
	{
		StaticExample r2= new StaticExample();
        r2.get();
		put();
	}

}
