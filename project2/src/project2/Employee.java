;

public class Employee {
String name;
int b_salary;
int id;
static int ctr;


public Employee() {
	ctr++;
	name="sana";
	b_salary=1;
	id=1;
	System.out.println("constructor called");
	}

public Employee(String n,int s,int i) {
	ctr++;
	name=n;
	b_salary=s;
	id=i;
	System.out.println("parameterised constructor called");
}
public void showCtr() {
	System.out.println("No. of objects of employee type:"+ctr);
	
}
public void setData(String n,int s,int i) {
	name=n;
	b_salary=s;
	id=i;
	
}
public String getn() {
	return name;
}
public int gets() {
	return b_salary;
}
public int geti() {
	return id;
}
public void displayData() {
	System.out.println("details are:"+name+","+b_salary+","+id);
}
}
