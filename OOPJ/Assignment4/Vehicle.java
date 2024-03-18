package conecpt.oops;

class Demo{
	  private String model_name;
	  private int vehicle_no;
	  private int avrage;  
	  private String color;
	  
	  public void display()
		{
		  this.model_name="Scoda";
	      this.vehicle_no=404;
	      this.avrage=50;
			System.out.println("Model Name: "+model_name);
			System.out.println("Vehicle NO: "+vehicle_no);
			System.out.println("Avarge is: "+avrage);
		}
	  
	    
	  public void display( String model_name,int vehicle_no,int avrage)
		{
		      
		      System.out.println("Model Name: "+model_name);
			  System.out.println("Vehicle NO: "+vehicle_no);
			  System.out.println("Avarge is: "+avrage);
		}
	  public void display( String color)
		{
		  System.out.println("Model Color: "+this.color);
		}
}
public class Vehicle {
    public static void main(String[] args) {
	   Demo demo=new Demo();
	   demo.display();
	   System.out.println("----------------------------");
	   demo.display("Dukati",101,40);
	   System.out.println("----------------------------");
	   demo.display("Red");
    }

}
