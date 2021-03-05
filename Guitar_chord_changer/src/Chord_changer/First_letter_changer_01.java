package Chord_changer;
	import java.lang.*;
	import java.util.Arrays;
	import java.util.Scanner;
public class First_letter_changer_01 {
	public static void main(String[] args) {
		//My first challenge
		//Guitar chord transposition. 
		//(just first letter) - is enough 
			
		//There are too many Guitar chords. but first letters are just 12. (C, C#, D ... A, A#, B) and all Uppercase.

		//to check code of letters.
		
			//char chord = 'A';
			//int code = (int)chord;
			//System.out.println(code);
		
		/*Of course I can search that on google. but I have to practice more and more.
		 *codes of chords (We say both words as a same sound. ([kɔʣ ɔb kɔʣ]) it's funny) 
		 *C : 67
		 *D : 68
		 *E : 69
		 *F : 70
		 *G : 71
		 *A : 65
		 *B : 66
		 *
		 *but there are more letters. ex)C# ,D# ... and I can't give code to those (there is no code 67.5)
		 */
		 
		 /*maybe, It is better to give 'new code' to all of them. 
		 *
		 *C		:	0
		 *C#	:	1
		 *D		: 	2
		 *D#	:	3
		 *E		: 	4
		 *F		:	5
		 *F#	:	6
		 *G		: 	7
		 *G#	:	8
		 *A		: 	9
		 *A#	:	10
		 *B		:	11
		 *Yeah these are better. at least till now.
		 */
		
		//I made lists. but I don't know use them.
		//int [] chordsCodes = {1,2,3,4,5,6,7,8,9,10,11,12};
		//String[] chordsList = {"C", "C#", "D", "D#", "E" , "F" ,"F#", "G" , "G#", "A", "A#", "B"}; 
		// Maybe I can learn array next week.	

		
		//new solution is this...

		
		//var's
		int chordNo = 0;
		int transposition;
		String chordTyped = "";
		int chordNoNew;
		String result = "";
	
		Scanner s = new Scanner(System.in);		
	while(true) {
		System.out.println("Type First Letter (if it has '#' type with it. ex: 'C' or 'D#')");
		chordTyped = s.nextLine();
	
		if(chordTyped.equals("C")) {
			chordNo = 0;
			break;
		}
		else if(chordTyped.equals("C#")) {
			chordNo = 1;
			break;
		}
		else if(chordTyped.equals("D")) {
			chordNo = 2;
			break;
		}
		else if(chordTyped.equals("D#")) {
			chordNo = 3;
			break;
		}
		else if(chordTyped.equals("E")) {
			chordNo = 4;
			break;
		}
		else if(chordTyped.equals("F")) {
			chordNo = 5;
			break;
		}
		else if(chordTyped.equals("F#")) {
			chordNo = 6;
			break;
		}
		else if(chordTyped.equals("G")) {
			chordNo = 7;
			break;
		}
		else if(chordTyped.equals("G#")) {
			chordNo = 8;
			break;
		}
		else if(chordTyped.equals("A")) {
			chordNo = 9;
			break;
		}
		else if(chordTyped.equals("A#")) {
			chordNo = 10;
			break;
		}
		else if(chordTyped.equals("B")) {
			chordNo = 11;
			break;
		}
		else {
			System.out.println("That's not first letter of chords");
		}	
	}
	
	System.out.println("1st chord is '" + chordTyped+"'");

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
	/*result
	*C		:	0 or 12
	*C#		:	1 or 13
	*D		: 	2 or 14
	*D#		:	3 or 15
	*E		: 	4 or 16
	*F		:	5 or 17
	*F#		:	6 or -6
	*G		: 	7 or -5
	*G#		:	8 or -4
	*A		: 	9 or -3
	*A#		:	10or -2
	*B		:	11or -1
	*/
	
	chordNoNew = (chordNo + transposition);
	if(chordNoNew==0 || chordNoNew==12) {
		result = "C";}
	
	if(chordNoNew==1 || chordNoNew==13) {
		result = "C#";}
	
	if(chordNoNew==2 || chordNoNew==14) {
		result = "D";}
	
	if(chordNoNew==3 || chordNoNew==15) {
		result = "D#";}
	
	if(chordNoNew==4 || chordNoNew==16) {
		result = "E";}
	
	if(chordNoNew==5 || chordNoNew==17) {
		result = "F";}
	
	if(chordNoNew==6 || chordNoNew==-6) {
		result = "F";}
	
	if(chordNoNew==7 || chordNoNew==-5) {
		result = "F#";}
	
	if(chordNoNew==8 || chordNoNew==-4) {
		result = "G";}
	
	if(chordNoNew==9 || chordNoNew==-3) {
		result = "A";}
	
	if(chordNoNew==10 || chordNoNew==-2) {
		result = "A#";}
	
	if(chordNoNew==11 || chordNoNew==-1) {
		result = "B";}
		
	//result
	System.out.println(chordTyped + " Change to " + result);
	}
}
	
		