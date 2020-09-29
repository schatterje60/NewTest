package project2;

public class User {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.showCtr();
		e1.displayData();
		Employee e2=new Employee("sananda",30000,101);
		e2.showCtr();
		
		//e1.setData("sananda", 30000, 101);
		e2.displayData();

	}

}