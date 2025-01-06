package management;

import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

public class Student_Management {

	private ConcurrentHashMap<Integer,Student> students=new ConcurrentHashMap();
	private int recepitId=0;
	
	public synchronized void addStudent(int studentId,String name, Double fees)
	{
		if(!students.containsKey(studentId))
		{
			Student student=new Student(studentId, name, fees);
			students.put(studentId, student);
			System.out.println("Student is sucessfully added :"+ student.getName());
		}
		else
		{
			System.out.println("Student is existed : "+students.get(studentId).getName());
		}
	}
	public synchronized void updateStudent(int studentId, double amount)
	{
		Student student=students.get(studentId);
		if(student != null)
		{
			student.setFeesBalance(amount);
			System.out.println("fees Sucessfully updated :"+student.getFeesBalance());
		}
		else
		{
			System.out.println("Student is not found");
		}
	}
	public synchronized Recepit feesRecepit(int studentId,double amount)
	{
		Student student=students.get(studentId);
		if(student != null)
		{
			
			double updateBalance=student.getFeesBalance()-amount;
			if(updateBalance>=0)
			{
				student.setFeesBalance(updateBalance);
				recepitId++;
				System.out.println(" Recepit Id is :"+recepitId+"\t balance :"+student.getFeesBalance());
				return new Recepit(studentId, studentId, updateBalance, new Date());
			}
			else
			{
				System.out.println("amount is exceeds");
				return null;
				
			}
		
		}
		else
		{
			System.out.println("Student not found");
			return null;
		}
		
	}
	public synchronized void delete(int studentId)
	{
		if(students.containsKey(studentId))
		{
			students.remove(studentId);
			System.out.println("Student is removed :"+studentId);
		}
		else 
		{
			System.out.println("Not Found");
		}
	}
}
