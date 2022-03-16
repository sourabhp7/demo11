package pack;

import java.util.Scanner;

public class inventory {
	
	
	String pname;
	int price,quantity;
	Scanner s;
	
	void input() 
	{
		s= new Scanner (System.in);
		System.out.println("enter pname");
		pname=s.next();
		System.out.println("enter the price");
		price=s.nextInt();
		System.out.println("enter your quantity");
		quantity=s.nextInt();
		
	}
	
	void show() 
	{
		System.out.println("Name= " +pname);
		System.out.println("Name= " +price);
		System.out.println("Name= " +quantity);
		
	}
	
	void calculate() {
		
		if(price > 3000)
		   System.out.println("discount=10%");
		else
			System.out.println("discount=9%");	
		
	}
	
	

	public static void main(String[] args) 
	{
		inventory i=new inventory();
		i.input();
		i.show();
		i.calculate();

	}

}
