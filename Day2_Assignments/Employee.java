public class Employee //Employee class
{
	private int id;
	private String name;
	private int monthlyBasic;
	private static int pfRate;
	final int medical_allowance = 1250;
	final int conveyance_allowance = 800;

	public Employee()
	{
		
	}
	public static int getPfRate() {
		return pfRate;
	}

	public static void setPfRate(int pfRate) {
		Employee.pfRate = pfRate;
	}

	public void setId(int id) 	//sets id value
	{	
		this.id = id;
	}
	
	public int getId(int id)	//gets the id value
	{	
		return id;
	}
	
	public void setName(String name) 	//sets the name
	{
		this.name = name;
		
	}
	
	public String getName(String name) 	//gets the name
	{
		return name;
	}
	
	public void setMonthlyBasic(int monthlyBasic) //sets monthlybasic value
	{
		this.monthlyBasic = monthlyBasic;
	}
	
	public double getHRA()	//gets HRA value
	{
		double hra = 0.5*monthlyBasic;
		return hra;
	}
	
	public double getPf()	//gets pf value
	{	
		double pf = (Employee.getPfRate() * monthlyBasic)/100;
		if(monthlyBasic<=6500)
			pf = 0;
		else
			pf = 0.1 * monthlyBasic;
		return pf;
	}
	
	public double getESIC()	//gets ESIC value
	{
		double ESIC=0;
		if(monthlyBasic<=5000)
			 ESIC = 4.75/100*monthlyBasic;
		return ESIC;
	}
	
	public double getTax()	//gets Tax value
	{
		double tax;
		if(getMonthlyGrossSalary()<=10000)
		tax = 50;
		else
			tax=100;
		
		return tax;
	}
	
	public int getAnnualBasic()		//returns Annual basic salary
	{
		return 12 * monthlyBasic;
	}
	
	public int getMonthlyBasic(int monthlyBasic) {	//returns Monthly salary

		return monthlyBasic;
	}

	public double getMonthlyGrossSalary() {	//returns monthly gross salary
	double monthlygross = (monthlyBasic + getHRA() + medical_allowance + conveyance_allowance);
		return monthlygross;
	}

	public double getAnnualGrossSalary() {	//returns Annual gross salary
	
		return 12 * getMonthlyGrossSalary();
	}

	public double getMonthlyDeductions() {	//returns Monthly Deductions
	
		return getPf()+getESIC()+getTax();
	}

	public double getMonthlyTakeHome() {	//returns monthly takehome 
		
		return getMonthlyGrossSalary()-getMonthlyDeductions();
	}

	public double getAnnualTakeHome() {	//returns annual takehome
	
		return 12 * getMonthlyTakeHome();
	}
	
}
