package Keypad;
	import java.lang.*;
import java.util.Scanner;
public class Test01 {
	public static void main(String[] args) {
	
	String pwSave = "00123456"; //basic PW
	String pwAdmin = pwSave+"#";
	System.out.println("Press Pw");
	System.out.println("If you want change pw Press'#' after pw");
	
	Scanner s = new Scanner(System.in);		
	String pwInput = s.nextLine();
	
	if (pwInput.equals(pwSave)) {
		System.out.println("Door is opened");
	}
	
	else if (pwAdmin.equals(pwInput)) {
		System.out.println("Press new Pw");
		pwSave = s.nextLine();
	System.out.println("Pw is changed");	
	}
	
	else
		System.out.println("Wrong");

	{
	}
	
	
	//char a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15;//
	/*
	for(int i=0; i<16;) {
		a0 = s.next().charAt(0);
		System.out.println(a0);
		
		String pwInput;
	*/
	
}
}
