package Employee;

public class Main {
	public static void main(String[] args) {
		Employee p1=new Employee("Kaustubha mg",NNM24IS105,50000);
		Employee p2=new Employee("Karthik ng",NNM24IS100,60000);
	    System.out.println("intial employee detail are");
	    p1.display();
	    p2.display();
	    p1.increase_salary(10);
	    p2.increase_salary(20);
	    System.out.println("upgrade employee details are");
	    p1.display();
	    p2.display();
	    
	}

}
