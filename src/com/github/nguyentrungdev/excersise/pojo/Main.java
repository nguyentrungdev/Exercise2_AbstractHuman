package com.github.nguyentrungdev.excersise.pojo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("a", "b", 2);
		Student s2 = new Student("c", "d", 1);
		Student s3 = new Student("nguyen", "trung", 5);
		Student s4 = new Student("sf", "sdf", 7);
		Student s5 = new Student();
		Student s6 = new Student();
		Student s7 = new Student();
		Student s8 = new Student();
		Student s9 = new Student();
		Student s10 = new Student();
		List<Student> listStudent = new ArrayList<Student>(10);
		listStudent.add(s1);
		listStudent.add(s2);
		listStudent.add(s3);
		listStudent.add(s4);
		listStudent.add(s5);
		listStudent.add(s6);
		listStudent.add(s7);
		listStudent.add(s8);
		listStudent.add(s9);
		listStudent.add(s10);
		
		Worker w1 = new Worker("nguyen", "trung", 5215, 2);
		Worker w2 = new Worker("flfd", "sang", 1500, 8);
		Worker w3 = new Worker();
		Worker w4 = new Worker();
		Worker w5 = new Worker();
		Worker w6 = new Worker();
		Worker w7 = new Worker();
		List<Worker> listWorker = new ArrayList(7);
		listWorker.add(w1);
		listWorker.add(w2);
		listWorker.add(w3);
		listWorker.add(w4);
		listWorker.add(w5);
		listWorker.add(w6);
		listWorker.add(w7);
		
		List<Human> listHuman = new ArrayList(listWorker.size() + listStudent.size()); 
		listHuman.addAll(listStudent);
		listHuman.addAll(listWorker);
		
		Collections.sort(listStudent, Student.GradeComparator);
		for (Student student : listStudent) {
			System.out.println(student);
		}
		
		Collections.sort(listWorker, Worker.SalaryPerDayComparator);
		for (Worker worker : listWorker) {
			System.out.println(worker);
		}
		
		Collections.sort(listHuman);
		for (Human human : listHuman) {
			System.out.println(human);
		}
		
	}
}
