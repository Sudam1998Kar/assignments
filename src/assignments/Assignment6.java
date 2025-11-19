package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1. Create two arrays to store student names ["Suresh","Mahesh","Naresh"] and
		 * marks [75, 80, 82] Add 10 marks to each students using assignment operators
		 * and store it into another array, after adding 10 marks identify the average
		 * marks of all students
		 */
		
		String []studentNames = {"Suresh","Mahesh","Naresh"};
		
		
		int marks[] = {75, 80, 82};
		
		//updated marks empty array
		int updtaedMarks[]=new int[3];
		
		//Add 10 marks and assign in new array
		updtaedMarks[0]=marks[0]+10;//85
		updtaedMarks[1]=marks[1]+10;//90
		updtaedMarks[2]=marks[2]+10;//92
		
		//print updated marks for each student
		System.out.println(studentNames[0]+" : "+updtaedMarks[0]);
		System.out.println(studentNames[1]+" : "+updtaedMarks[1]);
		System.out.println(studentNames[2]+" : "+updtaedMarks[2]);
		
		//average marks
		
		int average= (updtaedMarks[0]+updtaedMarks[1]+updtaedMarks[2])/updtaedMarks.length;
		System.out.println("Average :"+average);//89
		
		
		
		
		
		
	
		
		
		

	}

}
