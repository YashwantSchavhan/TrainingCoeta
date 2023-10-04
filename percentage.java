package Percentage;

import java.util.Scanner;

public class percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       float percentage ;
       float total_marks;
       float scored;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Your percent::");
       scored = sc.nextFloat();
       System.out.println("Enter Total Value::");
       total_marks = sc.nextFloat();
       percentage = (Float)((scored / total_marks)*100);
       System.out.println("percentage ::" + percentage);
	}

}
