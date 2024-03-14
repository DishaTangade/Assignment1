package SecondProgram;

public class Problem4 {
    public static void main(String[] args) {
    //int to double
	int num1=10;
	double num2=num1;
	System.out.println(num1+" "+num2);
	//output 10 10.0
	
	//int to float
	float num4=num1;
	System.out.println(num1+" "+num4);
	//output 10 10.0
	
	//int to boolean
	boolean num6=num1!=0;
	System.out.println(num1+" "+num6);
	//output: 10 true
	
	//int to string
	String num8=Integer.toString(num1);
	System.out.println(num1+" "+num8);
	// output: 10 10
}
}
