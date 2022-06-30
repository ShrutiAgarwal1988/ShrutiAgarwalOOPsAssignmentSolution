package package1.com.Four.driver;
import package1.com.Four.driver.models.AdminDepartment;
import package1.com.Four.driver.models.HrDepartment;
import package1.com.Four.driver.models.TechDepartment;

import java.io.*;

public class Main{
	public static void main(String args[])
	{
AdminDepartment obj1=new AdminDepartment();
HrDepartment obj2=new HrDepartment();
TechDepartment obj3=new TechDepartment();
System.out.println("Welcome to "+obj1.departmentName());
System.out.println(obj1.getTodaysWork());
System.out.println(obj1.getWorkDeadline());
System.out.println(obj1.isTodayAHoliday());
System.out.println();
System.out.println();
System.out.println("Welcome to "+obj2.departmentName());
System.out.println(obj2.doActivity());
System.out.println(obj2.getTodaysWork());
System.out.println(obj2.getWorkDeadline());
System.out.println(obj2.isTodayAHoliday());
System.out.println();
System.out.println();
System.out.println("Welcome to "+obj3.departmentName());
System.out.println(obj3.getTodaysWork());
System.out.println(obj3.getWorkDeadline1);
System.out.println(obj3.getTechStackInformation());
System.out.println(obj3.isTodayAHoliday());
}

}
