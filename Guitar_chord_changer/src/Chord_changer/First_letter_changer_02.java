package Chord_changer;
	import java.lang.*;
	import java.util.Arrays;
	import java.util.Scanner;
public class First_letter_changer_02 {

	public static void main(String[] args) {
		//My first challenge
		//Guitar chord transposition. only first letter - is enough 
		//There are too many Guitar chords. but first letters are just 12. (C, C#, D ... A, A#, B) and all Uppercase.

		//var s
		String [] chordList = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
		// Ok I'll learn array loop till next time
		int chordNo;
		int transposition;
		String input = "";
		int chordNoNew;
	
		Scanner s = new Scanner(System.in);		
	while(true) {
		System.out.println("Type First Letter (if it has '#' type with it. ex: 'C' or 'D#')");
		input = s.nextLine();
	
		if(input.equals("C")) {
			chordNo = 0;
			break;
		}
		else if(input.equals("C#")) {
			chordNo = 1;
			break;
		}
		else if(input.equals("D")) {
			chordNo = 2;
			break;
		}
		else if(input.equals("D#")) {
			chordNo = 3;
			break;
		}
		else if(input.equals("E")) {
			chordNo = 4;
			break;
		}
		else if(input.equals("F")) {
			chordNo = 5;
			break;
		}
		else if(input.equals("F#")) {
			chordNo = 6;
			break;
		}
		else if(input.equals("G")) {
			chordNo = 7;
			break;
		}
		else if(input.equals("G#")) {
			chordNo = 8;
			break;
		}
		else if(input.equals("A")) {
			chordNo = 9;
			break;
		}
		else if(input.equals("A#")) {
			chordNo = 10;
			break;
		}
		else if(input.equals("B")) {
			chordNo = 11;
			break;
		}
		else {
			System.out.println("That's not first letter of chords");
		}	
	}
	
	System.out.println("1st chord is '" + input+"'");

	//process
	while(true){
		System.out.println("How many key you want to raise a chord you chosen? (You can type negative number) -6 to 6");
		transposition = s.nextInt();
		if(transposition>=-6 && transposition<=6) {

			break;
		}
		else {
			System.out.println("that's not correct number");
		}
		System.out.println("You want to raise '" + transposition+"'key(s)");
	}
	/*chordList
	*C		:	0 or 12
	*C#		:	1 or 13
	*D		: 	2 or 14
	*D#		:	3 or 15
	*E		: 	4 or 16
	*F		:	5 or 17
	*F#		:	6 or 18
	*G		: 	7 or 19
	*G#		:	8 or 20
	*A		: 	9 or 21
	*A#		:	10or 22
	*B		:	11or 23
	*/
	
	chordNoNew = (chordNo + transposition);

	for(int i = -6; i<18; i++) {
		if(chordNoNew == i) {
		}
	}
	System.out.println(input + " Change to " + chordList[chordNoNew+12]);
}
}
		