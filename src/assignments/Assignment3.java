package assignments;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees emp= new Employees();
		EmpGroups group= new EmpGroups();
		
		group.empNames[0]=emp.employee1;
		group.empNames[1]=emp.employee2;
		group.empNames[2]=emp.employee3;
		
		group.empIds[0]=emp.ID1;
		group.empIds[1]=emp.ID2;
		group.empIds[2]=emp.ID3;
		
 
		
		// Printing employee name and ID from array
        for (int i = 0; i < group.empNames.length; i++) 
        {
            System.out.println("Employee Name: " + group.empNames[i] +", Employee ID: " + group.empIds[i]);
        }
		
	}
}
