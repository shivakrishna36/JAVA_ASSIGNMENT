import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class EmployeeTest //EmployeeTest class
{
	private Employee employee = new Employee();//employee instance
	
	@Before
	public void setUp()//executes before every test method
	{
		
		employee.setId(111);
		employee.setName("Jhon");
		employee.setMonthlyBasic(9000);
		employee.setPfRate(10);
	}
	
	//testing for annual basic salary
	@Test
	public void testToGetAnnualBasic() 
	{
		
		int result = employee.getAnnualBasic();
		assertEquals(108000,result);
	}
	
	//testing for monthly gross salary
	@Test
	public void testToGetMonthlyGrossSalary()
	{
		double result = employee.getMonthlyGrossSalary();
		assertEquals(15550,result,10);
	}
	
	//testing for annual gross salary
	@Test
	public void testToGetAnnualGrossSalary()
	{
		double result = employee.getAnnualGrossSalary();
		assertEquals(186600,result,1);
	}
	
	//testing for monthly deductions
	@Test
	public void testMonthlyDeductions()
	{
		double result = employee.getMonthlyDeductions();
		assertEquals(1000,result,1);
	}
	
	//testing for monthly takehome
	@Test
	public void testMonthlyTakehome()
	{
		double result = employee.getMonthlyTakeHome();
		assertEquals(14550,result,1);
	}
	
	//testing for annual take home
	@Test
	public void testAnnualTakehome()
	{
		double result = employee.getAnnualTakeHome();
		assertEquals(174600,result,1);
	}
	
	//testing to get pfrate
	@Test
	public void testgetpfRate()
	{
		int result = Employee.getPfRate();
		assertEquals(10,result);
	}
}
