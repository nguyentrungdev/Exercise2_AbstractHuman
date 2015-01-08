package com.github.nguyentrungdev.excersise.pojo;

import java.text.Collator;
import java.util.Comparator;

public class Student extends Human {
	public static final Comparator<Student> GradeComparator = new GradeComparator();
	private Integer grade;
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public Student(String firstName, String lastName) {
		super(firstName, lastName);
		// TODO Auto-generated constructor stub
	}
	public Student(String firstName, String lastName, Integer grade) {
		super(firstName, lastName);
		this.grade = grade;
	}
	
	public Student() {
		super();
	}
	
	@Override
	public String toString() {
		return "Student [" + this.getFirstName() + "--" + this.getLastName() + "grade=" + grade + "]";
	}

	private static class GradeComparator implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			if (o1.getGrade() != null && o2.getGrade() != null)
				return o1.getGrade().compareTo(o2.getGrade());
			else if (o1.getGrade() != null)
				return -1;
			else if (o2.getGrade() != null)
				return 1;
			return 0;
		}
	}

	
}
