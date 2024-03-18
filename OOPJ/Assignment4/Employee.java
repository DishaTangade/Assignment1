package conecpt.oops;

class Demo3{
	 private String emp_name;
	  private int emp_id;
	  private String emp_designation;  
	  private float salary;
	  
	  public void display()
		{
		  this.emp_name="Gaurav";
	      this.emp_id=101;
	      this.emp_designation="Manager"; 
	      this.salary=60000;
	      
		  System.out.println("Emplyee Name: "+emp_name);
		  System.out.println("ID : "+emp_id);
		  System.out.println("Designation is: "+emp_designation);
		  System.out.println("salary is: "+salary);
		}
	  
	    
	  public void display( String emp_name,int emp_id ,String emp_designation,float salary )
		{
		  System.out.println("Emplyee Name: "+emp_name);
		  System.out.println("ID : "+emp_id);
		  System.out.println("Designation is: "+emp_designation);
		  System.out.println("salary is: "+salary);
		 }
	  public void display( String emp_name,int emp_id ,String emp_designation )
		{
		  System.out.println("Emplyee Name: "+emp_name);
		  System.out.println("ID : "+emp_id);
		  System.out.println("Designation is: "+emp_designation);
		  System.out.println("salary is: "+salary);
		 }
	  
}
public class Employee {
   public static void main(String[] args) {
	   Demo3 demo=new Demo3();
	   demo.display();
	   System.out.println("----------------------------");
	   demo.display("Saurav",102,"Employee",70000);
	   System.out.println("----------------------------");
	   demo.display("Harshad",103,"HR");
}

}














