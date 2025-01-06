package management;

import java.util.Date;

class Recepit {

	private int recepitId;
	private int studentId;
	private double amount;
	private Date date;
	public Recepit(int recepitId, int studentId, double amount, Date date) {
		this.recepitId = recepitId;
		this.studentId = studentId;
		this.amount = amount;
		this.date = date;
	}
	public final int getRecepitId() {
		return recepitId;
	}
	public final int getStudentId() {
		return studentId;
	}
	public final double getAmount() {
		return amount;
	}
	public final Date getDate() {
		return date;
	}
	
}
