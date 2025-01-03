package Staff;

import management.Student_Management;

public class FeesManagemant {

	public static void main(String[] args) {
		Student_Management sm=new Student_Management();
		sm.addStudent(101, "Praveen", 15000.0);
		sm.addStudent(102, "Akash", 2000.0);
		
		sm.updateStudent(10, 15000.0);
		sm.feesRecepit(102, 100.0);
		sm.delete(101);
		

	}

}
