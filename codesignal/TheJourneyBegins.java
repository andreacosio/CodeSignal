package codesignal;

import java.util.Scanner;

public class TheJourneyBegins {

	public int add(int param1, int param2) {
		return param1+param2;
	}
	 Scanner sc = new Scanner(System.in);
	int solution(int year) {
		int y=sc.nextInt();
		
		//if (y>0){
			int o= y/100+1;
			y=(int) Math.ceil(o);
			
			System.out.println(y);
		
	}

	
}
