public class Executer {

	public static void main(String[] args) {
		//Insert Employee
		Statements.insertEmployee(101,"Swara","Senior Developer",60000);
		Statements.insertEmployee(102,"Rgini","Fronted Developer",24000);
		
		//Update Designation and Salary
		Statements.updateEmployee(103,"Backend Developer",28000);
		
		//Display Employee Details
		Statement.showDetails();
		
		
		Statements.insertEmployee(104,"Anu","HR",30000);
		Statements.insertEmployee(105,"Varun","Business Executive",23000);
		
		//Delete Employee
		Statements.deleteEmployee(105);
		
		Statements.showDetails();
		
		Statements.closeconnection();
		
	}

}