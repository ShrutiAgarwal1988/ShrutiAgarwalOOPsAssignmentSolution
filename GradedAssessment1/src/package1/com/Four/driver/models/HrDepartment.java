package package1.com.Four.driver.models;

import package1.com.Four.driver.service.SuperDepartment;

public class HrDepartment extends SuperDepartment {
	private String deptName="HR Department";
public String departmentName()
{
	return deptName;
}
public String getTodaysWork()
{
	return "Fill today’s worksheet and mark your attendance";
}
public String doActivity()
{
	return "team Lunch";
}
public String getWorkDeadline()
{
	return getWorkDeadline1;
}
}
