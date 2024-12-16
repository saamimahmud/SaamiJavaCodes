package saamiJavaCodes;
/*Create a class employee with following properties and methods :
- Salary (property)
-getSalary(method returning int)
-name (Property)
-getName(method returning String)
-setName(method changing name)


*/
 class Employee_Details {
		int salary;
		String name;
	public int getSalary() {
			return salary;
		}
	public  String getName() {
		return name;	
	}
	public void changeName(String n) {
		name=n;
}
}	
public class Employee1{
	public static void main(String args[]) {
		Employee_Details Saami=new Employee_Details();
		Employee_Details Sualeh=new Employee_Details();
		Saami.salary=80000;
		Sualeh.salary=70000;
		Saami.name="Saami Mahmud";
		Sualeh.name="Sualeh Rauf";
		
	System.out.println(	Saami.getName()+ "\n"+Saami.getSalary());
	System.out.println(Sualeh.getName()+"\n"+Sualeh.getSalary());
		Sualeh.changeName("monu");
		Saami.changeName("Sexy");
		System.out.println(	Saami.getName()+ "\n"+Saami.getSalary());
		System.out.println(Sualeh.getName()+"\n"+Sualeh.getSalary());
	}}

