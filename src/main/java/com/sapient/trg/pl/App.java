package com.sapient.trg.pl;

public class App {

	public int square(int n){
		return n*n;
	}
	public static int cube(int n) {
		return n*n*n;
	}

	public static void main(String []args) {
		System.out.println("Cube of 5 is "+ App.cube(5));
		App app= new App();
		System.out.println("Square of  5 is " + app.square(5));

	}

}
