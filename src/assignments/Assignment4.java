package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Assignment4 {

	public static void main(String[] args){
		
//		1. Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th
//		cities combined.
		
		List<Double>cities =new ArrayList<Double>();
		cities.add(1050.20);
		cities.add(2050.90);
		cities.add(3050.50);
		cities.add(350.70);
		cities.add(160.00);
		
		Double totalArea=cities.get(2)+cities.get(3);
		
		System.out.println("total area of 3rd and fourth cities: "+ totalArea+ " sq.km");
	
		
//		2.Create a set of the top 10 most visited tourist attractions in the world and print out all
//		of them and its size.
		
		Set<String>mostVisitedPlace= new HashSet<String>();
		mostVisitedPlace.add("TajMahal");
		mostVisitedPlace.add("Eyfil tower");
		mostVisitedPlace.add("Bibi ka Makbara");
		mostVisitedPlace.add("Italy");
		mostVisitedPlace.add("Brazil");
		mostVisitedPlace.add("Ajintha Leni");
		mostVisitedPlace.add("Konark temple");
		mostVisitedPlace.add("USA");
		mostVisitedPlace.add("Japan");
		mostVisitedPlace.add("Finaland");
		
		System.out.println("Most visited touriest attraction places: "+mostVisitedPlace); //[USA, Eyfil tower, Ajintha Leni, Japan, Brazil, Konark temple, TajMahal, Italy, Finaland, Bibi ka Makbara]
        System.out.println("total visited site: "+mostVisitedPlace.size());		//total visited site: 10
        
        
//        3. Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and
//        6th Value.
        
        int []number= new int[10];
        number[0]= 10;
        number[1]= 20;
        number[2]= 30;
        number[3]= 40;
        number[4]= 50;
        number[5]= 60;
        number[6]= 70;
        number[7]= 80;
        number[8]= 90;
        number[9]= 100;
        
         int Average= (number[4]+number[5])/2;
        System.out.println("Average of 5th and 6th Value: "+Average); //Average of 5th and 6th Value: 55
        
        
//        4. Create a list of the top 5 highest-grossing movies of all time and print out the third
//        movie on the list.
        
          List<String>movies=new ArrayList<String>();
          movies.add("Bahubali");
          movies.add("Krish3");
          movies.add("RRR");
          movies.add("Dangal");
          movies.add("Dangal");
          
          System.out.println("Highest grossing 3rd moivie is: "+movies.get(2)); //Highest grossing 3rd moivie is: RRR
}
}
