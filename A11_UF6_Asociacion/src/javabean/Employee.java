package javabean;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
	
	private int emplyeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private LocalDate hireDate;
	private Job job;
	private double salary;
	private double comissionPct;
	private Employee myBoss;
	private Department department;
	public Employee(int emplyeeId, String firstName, String lastName, String email, String phoneNumber,
			LocalDate hireDate, Job job, double salary, double comissionPct, Employee myBoss, Department department) {
		super();
		this.emplyeeId = emplyeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.hireDate = hireDate;
		this.job = job;
		this.salary = salary;
		this.comissionPct = comissionPct;
		this.myBoss = myBoss;
		this.department = department;
	}
	public Employee() {
		super();
	}
	public int getEmplyeeId() {
		return emplyeeId;
	}
	public void setEmplyeeId(int emplyeeId) {
		this.emplyeeId = emplyeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getComissionPct() {
		return comissionPct;
	}
	public void setComissionPct(double comissionPct) {
		this.comissionPct = comissionPct;
	}
	public Employee getMyBoss() {
		return myBoss;
	}
	public void setMyBoss(Employee myBoss) {
		this.myBoss = myBoss;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [emplyeeId=" + emplyeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", phoneNumber=" + phoneNumber + ", job=" + job + ", salary=" + salary + ", comissionPct="
				+ comissionPct + ", myBoss=" + myBoss + ", department=" + department + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(emplyeeId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		return emplyeeId == other.emplyeeId;
	}
	
	
	
	

}
