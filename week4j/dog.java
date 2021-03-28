package week4;

import java.util.Scanner;

public class dog {
	private String name;
	private String colour;
	private String age;

	public dog(){	
		this.name = "null";
		this.colour = "white";
		this.age = "0";
	}

	public dog(String name,String colour,String age){
		this.name = name;
		this.colour = colour;
		this.age = age;
	}


	public void getMessage(String name,String colour,String age){
		this.name = name;
		this.colour = colour;
		this.age = age;
	}


	public void display(){
		String info = "";
		info = "¹·ĞÕÃû£º"+this.name+"    ÑÕÉ«£º"+this.colour+"    ÄêÁä£º"+this.age;
		System.out.println(info);
	}
}