package Chord_changer;
	import java.lang.*;
	import java.util.Scanner;
public class First_letter_changer_03 {
	public static void main(String[] args) {
		//My first challenge
		//Guitar chord transposition. only first letter - is enough 
		//There are too many Guitar chords. but first letters are just 12. (C, C#, D ... A, A#, B) and all Uppercase.

		//input
		String chordInput = ""; // C, C# ... B
		String [] chordList = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"}; //How can i Loop this array?
		int chordNo = 0; 
		int chordNoNew;
		int transposition=0;
	
	Scanner s = new Scanner(System.in);		
	for(int i=0; i<13;){
		
		System.out.println("Type First Letter (if it has '#' type if it with. ex: 'C' or 'D#')");
		chordInput = s.nextLine();
		
		if(chordList[i].equals(chordInput)){
			System.out.println("That's not first letter of chords");
			i++;
		}
		else{
			System.out.println("Chord you typed is '" + chordInput +"'");
			chordNo = i;
			break;
		}
	}
	
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
	
	//process
	
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
	
	//result
	chordNoNew = (chordNo + transposition);	
	System.out.println(chordInput + " Change to " + chordList[chordNoNew+12]);
	}
}
		