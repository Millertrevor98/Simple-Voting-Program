package com.program;

import java.util.Scanner;

public class Main {
	//Method
	static void mTrevor(){

System.out.println("Greetings");
	}
	public static void main(String[] args) {
		//second class import
		mTrevor();
second s=new second();
s.name="Trevor";
s.age=24;
s.number=98;
System.out.println("your name is "+s.name+" and you are "+s.age+ " and your number is "+s.number);
System.out.println("what is your age? ");

//Scanner
Scanner object= new Scanner(System.in);
int votingage=object.nextInt();

if(votingage<18){
	System.out.println("Not old enough");
}
else if(votingage>=18){
	System.out.println("You are old enough");
}

	}
}
