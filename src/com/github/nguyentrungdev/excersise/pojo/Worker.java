package com.github.nguyentrungdev.excersise.pojo;

import java.util.Comparator;

public class Worker extends Human {
	private double weekSalary;
	private float workHourPerDay;
	public static final Comparator<Worker> SalaryPerDayComparator = new salaryComparator();
	public double getWeekSalary() {
		return weekSalary;
	}
	public void setWeekSalary(double weekSalary) {
		this.weekSalary = weekSalary;
	}
	public float getWorkHourPerDay() {
		return workHourPerDay;
	}
	public void setWorkHourPerDay(float workHourPerDay) {
		this.workHourPerDay = workHourPerDay;
	}
	
	public Worker(String firstName, String lastName, double weekSalary,
			float workHourPerDay) {
		super(firstName, lastName);
		this.weekSalary = weekSalary;
		this.workHourPerDay = workHourPerDay;
	}
	
	public Worker() {};
	public Double calculateMoneyPerHour() {
		double moneyPerDay = weekSalary / 5;
		return moneyPerDay / 8;
	}
	public static final class salaryComparator implements Comparator<Worker> {
		@Override
		public int compare(Worker o1, Worker o2) {
			if (o1.calculateMoneyPerHour() != null && o2.calculateMoneyPerHour() != null)
				return o1.calculateMoneyPerHour().compareTo(o1.calculateMoneyPerHour());
			else if (o1.calculateMoneyPerHour() != null)
				return -1;
			return 1;
		}
	}
	@Override
	public String toString() {
		return "Worker [firstName: " + this.getFirstName() + " lastName: " + this.getLastName() + " weekSalary=" + weekSalary + ", workHourPerDay="
				+ workHourPerDay + ", calculateMoneyPerHour()="
				+ calculateMoneyPerHour() + "]";
	}
	
}
