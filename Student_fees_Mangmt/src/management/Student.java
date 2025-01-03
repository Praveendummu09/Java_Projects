package management;

class Student {
	private int studentId;
	private String name;
	private double feesBalance;
	public Student(int studentId, String name, double feesBalance) {
		this.studentId = studentId;
		this.name = name;
		this.feesBalance = feesBalance;
	}
	public final int getStudentId() {
		return studentId;
	}

	public final String getName() {
		return name;
	}
	public final double getFeesBalance() {
		return feesBalance;
	}
	public synchronized void setFeesBalance(double feesBalance) {
		this.feesBalance=feesBalance;
	}
	
	
	
}
