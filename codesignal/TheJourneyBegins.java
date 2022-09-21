package codesignal;

import java.util.Scanner;

public class TheJourneyBegins {

	public int add(int param1, int param2) {
		return param1+param2;
	}
	 Scanner sc = new Scanner(System.in);
	int solution(int year) {
		while(year%100!=0) {
            year+=1;
		}
		year= year/100;
		return year;
			
			
		
	}

	
}
