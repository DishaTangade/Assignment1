package conecpt.oops;
import java.util.Scanner;

class Info{
	private String name;
	private int rollno;
	private int contact;
	
	public void readRecord() {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter name: ");
			name=sc.nextLine();
			System.out.println("Enter rollno: ");
			rollno=sc.nextInt();
			System.out.println("Enter contact: ");
			contact=sc.nextInt();
		}
	}
	public void printRecord() {
		System.out.println("Name: "+name);
		System.out.println("RollNo: "+rollno);
		System.out.println("Enter name: "+contact);
	}
		
}
class Student {
 public static void main(String[] args) {
	Info info=new Info();
	info.readRecord();
	info.printRecord();
}
}
