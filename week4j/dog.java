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
		info = "��������"+this.name+"    ��ɫ��"+this.colour+"    ���䣺"+this.age;
		System.out.println(info);
	}
}