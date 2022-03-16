package StudentDeatils;

public class Student {
 //default
	int a;
	float b;
	char c;
	boolean d;
	String s;
    static boolean j;
	public static void main(String[] args) {
		int k;//local variable 
		float e=12.323f;//all decimal values are double 
		Student st= new Student();
		System.out.println(st.a);
		System.out.println(st.b);
		System.out.println(st.c);
		System.out.println(st.d);
		System.out.println(st.s);
		//System.out.println(k);
		System.out.println(st.j+ "  "+ Student.j +" "+ j);
		// static variables should be used with classname 
		
}
}
