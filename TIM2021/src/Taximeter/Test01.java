package Taximeter;
	import java.lang.*;
public class Test01 {
	public static void main(String[] args) {
		//TIM2021 project.
		//I loved that game, The Incredible Machines.
		
		//Taximeter in Seoul Taxi.
		//Taximeter calculate fee by using 2 standards (distance, time)
		//It is easy to understand this to think 2 of hourglasses.
		
		int dist, time; 
		dist = 1000;
		time = 180;
		int basicFee;
		basicFee = 3800;
		
		//distFee part
		//"Distance" doesn't link GPS. (maybe)It is link to their car's engine of tire.
		//"Distance" is "tire's diameter *π * No of rolling"?? (nevermind...)
		//"distFee" of Seoul taxi is 100won/132m
		//and in under 10Km. 3,800 won.		
		
		int distBasic = 10000;
		double distFee = (dist-distBasic) / 132;
			
		//timeFee part
		//"Time" donesn't always active. they active "under 15km/h"
		//"timeFee" of Seoul taxi is 100won/31s
	
		int timeOv15KmpH = 180; 
		double timeFee = (time-timeOv15KmpH) / 60;

		
		//And (As i think) Taximeter use one variable. You can see some number decreasing on screen of Taximeter.
		//that's what I mention right above. Yes, I have to mix to "Hourglasses" 

		
		//result	
		if(distFee<0) {
			distFee=0;
		} //Basic distFee
		double result = basicFee + distFee*100 + timeFee*100;
		
		System.out.println("Fee : " + (int)result + " won");		
		

	}

}
