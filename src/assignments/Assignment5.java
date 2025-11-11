package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Inside this Excel There are 3 TestCases with each Testcase having 3 rows of data.
//		Now, CreateMap<String, List<Map<String, String>>> to store all the data 
//		and Print the data from Product details > Supplier Name > Office Depot  from the  Map<String, List<Map<String, String>>>
  
		
		Map<String,String>student1=new HashMap<String,String>();
		student1.put("Name", "John Doe");
		student1.put("Age", "Twenty");
		student1.put("Gender", "Male");
		student1.put("Roll no", "SBA12345");
		student1.put("Grade", "A++");
		student1.put("Major", "Computer Science");
		student1.put("GPA", "A3.8");
		student1.put("Email", "john@example.com");
		student1.put("PAN number", "SDF6543210");
		student1.put("Address", "123 Elm St");
		//System.out.println(student1);
		
		//student2 details stored
		Map<String, String> student2 = new HashMap<String, String>();
		student2.put("Name", "Jane Smith");
		student2.put("Age", "21");
		student2.put("Gender", "Female");
		student2.put("Roll Number", "S12346");
		student2.put("Grade", "B");
		student2.put("Major", "Mathematics");
		student2.put("GPA", "3.5");
		student2.put("Email", "jane@example.com");
		student2.put("Contact Number", "9876665666");
		student2.put("Address", "456 Oak St");
		//System.out.println("Student 2 details :" + student2);

		// Below Student3 details are stored using Map(HashMap)

		Map<String, String> student3 = new HashMap<String, String>();
		student3.put("Name", "Mike Brown");
		student3.put("Age", "22");
		student3.put("Gender", "Male");
		student3.put("Roll Number", "S12347");
		student3.put("Grade", "A");
		student3.put("Major", "Physics");
		student3.put("GPA", "3.9");
		student3.put("Email", "mike@example.com");
		student3.put("Contact Number", "8787876546");
		student3.put("Address", "789 Pine St");
		//System.out.println("Student 3 details :" + student3);
		
		//Step 2: Create List<Map<String, String>> for entire table		
		
		List<Map<String,String>>StudentList=new ArrayList<Map<String,String>>();
		StudentList.add(student1);
		StudentList.add(student2);
		StudentList.add(student3);
		
		//System.out.println("Student details :"+ StudentList);
		
		//for employeeDetail1 details store the data
		
		Map<String,String>employeeDetail1=new HashMap<String,String>();
		employeeDetail1.put("employeeDetail1 ID", "E001");
		employeeDetail1.put("Name", "Alice Green");
		employeeDetail1.put("Age", "Thirty");
		employeeDetail1.put("Gender", "Female");
		employeeDetail1.put("Department", "Engineering");
		employeeDetail1.put("Position", "Software Engineer");
		employeeDetail1.put("Salary", "75K Pounds");
		employeeDetail1.put("Email", "alice@example.com");
		employeeDetail1.put("PAN Number", "SDF6543210");
		System.out.println("Employee1 Details: "+employeeDetail1);
		
		//for employeeDetail2
		Map<String, String> employeeDetail2 = new HashMap<String, String>();
		employeeDetail2.put("Employee ID", "E002");
		employeeDetail2.put("Name", "Bob Johnson");
		employeeDetail2.put("Age", "35");
		employeeDetail2.put("Gender", "Male");
		employeeDetail2.put("Department", "Marketing");
		employeeDetail2.put("Position", "Marketing Manager");
		employeeDetail2.put("Salary", "85,000");
		employeeDetail2.put("Email", "bob@example.com");
		employeeDetail2.put("Contact Number", "9876543214");
		System.out.println("Employee 2 details :" + employeeDetail2);

		// Below employeeDetail3 details are stored using Map(HashMap)

		Map<String, String> employeeDetail3 = new HashMap<String, String>();
		employeeDetail3.put("Employee ID", "E003");
		employeeDetail3.put("Name", "Carol White");
		employeeDetail3.put("Age", "28");
		employeeDetail3.put("Gender", "Female");
		employeeDetail3.put("Department", "Sales");
		employeeDetail3.put("Position", "Sales Executive");
		employeeDetail3.put("Salary", "65,000");
		employeeDetail3.put("Email", "carol@example.com");
		employeeDetail3.put("Contact Number", "9876543215");
		System.out.println("Employee 3 details :" + employeeDetail3);
		
		List<Map<String,String>>employeeDetailList=new ArrayList<Map<String,String>>();
		employeeDetailList.add(employeeDetail1);
		employeeDetailList.add(employeeDetail2);
		employeeDetailList.add(employeeDetail3);
		
		System.out.println("Employee Details: "+employeeDetailList);
		
		
		//For product details
		Map<String,String>productDetails1=new HashMap<String,String>();
		productDetails1.put("Product ID", "P001");
		productDetails1.put("Name", "Laptop");
		productDetails1.put("Category", "Electronics");
		productDetails1.put("Price", "$1,200");
		productDetails1.put("Stock Quantity", "50");
		productDetails1.put("Supplier", "Tech Supplies");
		productDetails1.put("Warranty", "2 years");
		productDetails1.put("Rating", "4.5");
		productDetails1.put("Manufacturing Date", "15-01-2023");
		productDetails1.put("Expiry Date", "15-01-2025");
		System.out.println("Product 1 details :" + productDetails1);

		// Below productDetails2 details are stored using Map(HashMap)

		Map<String, String> productDetails2 = new HashMap<String, String>();
		productDetails2.put("Product ID", "P002");
		productDetails2.put("Name", "Desk Chair");
		productDetails2.put("Category", "Furniture");
		productDetails2.put("Price", "$150");
		productDetails2.put("Stock Quantity", "200");
		productDetails2.put("Supplier", "Office Depot");
		productDetails2.put("Warranty", "1 year");
		productDetails2.put("Rating", "4");
		productDetails2.put("Manufacturing Date", "10-02-2023");
		productDetails2.put("Expiry Date", "N/A");
		System.out.println("Product 2 details :" + productDetails2);

		// Below productDetails3 details are stored using Map(HashMap)

		Map<String, String> productDetails3 = new HashMap<String, String>();
		productDetails3.put("Product ID", "P003");
		productDetails3.put("Name", "Coffee Maker");
		productDetails3.put("Category", "Kitchen");
		productDetails3.put("Price", "$75");
		productDetails3.put("Stock Quantity", "100");
		productDetails3.put("Supplier", "KitchenWorld");
		productDetails3.put("Warranty", "6 months");
		productDetails3.put("Rating", "4.2");
		productDetails3.put("Manufacturing Date", "20-03-2023");
		productDetails3.put("Expiry Date", "20-03-2024");
		System.out.println("Product 3 details :" + productDetails3);
		
		
		List<Map<String,String>>productDetailList=new ArrayList<Map<String,String>>();
		productDetailList.add(productDetails1);
		productDetailList.add(productDetails2);
		productDetailList.add(productDetails3);
		
		System.out.println(productDetailList);
		
		//to access all data in single frame
		
		Map<String,List<Map<String,String>>>data=new HashMap<String,List<Map<String,String>>>();
		data.put("student data", StudentList);
		data.put("employeeData", employeeDetailList);
		data.put("productData", productDetailList);
		
		System.out.println("all data :"+data);
		System.out.println(data.get("productData").get(1).get("Supplier"));
		
		
		

		
		
	}

}
