package Chord_changer;
	import java.lang.*;
	import java.util.Scanner;
public class First_letter_changer_04 {
	public static void main(String[] args) {
		//Guitar chord transposition. only first letter(Uppercase) - is enough 

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
	chordNoNew = (chordNo + transposition);	
	
	//result
	System.out.println(chordInput + " Change to " + chordList[chordNoNew+12]);
	}
}
		