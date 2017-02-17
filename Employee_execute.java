

abstract class Employee
{
	//data members
	int empId;
	String empName;
	int total_leaves;
	double total_salary;

	Employee()
	{
		int total_leaves = 47;
	}
	//methods
	abstract void calculate_balance_leaves();
	abstract boolean avail_leave(int no_of_leaves, char type_of_leave);
	abstract void calculate_salary();

}


class PermanentEmp extends Employee
	{
	
	
	int paid_leave, sick_leave, casual_leave;
	double basic,hra,pfa,total_sal;
    
	PermanentEmp()
	{
		super();
		paid_leave   = 20;
		sick_leave   = 12;
		casual_leave = 15;
	}

	void print_leave_details() 
	{
		
		System.out.println("Total leaves you have ");
		System.out.println("Paid leave="+paid_leave+"/nSick leave"+sick_leave+"\nCasual leave="+casual_leave);
	
	}
	
	@Override
	void calculate_balance_leaves() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	void calculate_salary() {
		// TODO Auto-generated method stub
		pfa = 0.12 * basic;
		hra = 0.50 * basic;
		hra = hra - pfa;
		total_sal = basic + hra;
	}
	
	}


class TemporaryEmp extends Employee 
	{

	
	TemporaryEmp()
	{
		super();
	}
	
	
	void calculate_balance_leaves() {
		// TODO Auto-generated method stub
		
	}

	@Override
	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	void calculate_salary() {
		// TODO Auto-generated method stub
		
	}
	
	}

public class Employee_execute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
