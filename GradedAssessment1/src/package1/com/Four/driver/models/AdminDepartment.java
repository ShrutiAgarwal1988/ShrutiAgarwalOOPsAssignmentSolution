package package1.com.Four.driver.models;

import package1.com.Four.driver.service.SuperDepartment;

public class AdminDepartment extends SuperDepartment {
	private String deptName="Admin Department";
	private String gettodayswork1="complete your documents submission";
     
public String departmentName()
{
return deptName;	
}
public String getTodaysWork()
{
return 	gettodayswork1;
}
public String getWorkDeadline()
{
	return getWorkDeadline1;
}
}
