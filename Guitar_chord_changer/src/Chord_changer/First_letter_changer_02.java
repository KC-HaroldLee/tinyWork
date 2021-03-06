package Chord_changer;
	import java.lang.*;
	import java.util.Arrays;
	import java.util.Scanner;
public class First_letter_changer_02 {

	public static void main(String[] args) {
		//My first challenge
		//Guitar chord transposition. only first letter - is enough 
		//There are too many Guitar chords. but first letters are just 12. (C, C#, D ... A, A#, B) and all Uppercase.

		//var
		String [] chordList = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
		// Ok I'll learn array loop till next time
		int chordNo = 0;
		int transposition;
		String input = "";
		int chordNoNew;
		
		//input

		Scanner s = new Scanner(System.in);		
	for(int i=0; i<12; i++){
		System.out.println("Type First Letter (if it has '#' type with it. ex: 'C' or 'D#')");

		input = s.nextLine();
		if(input == chordList[i]) {
			
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

	for(int j = -6; j<18; j++) {
		if(chordNoNew == j) {
		}
	}
	System.out.println(input + " Change to " + chordList[chordNoNew+12]);
}
}
		