package org.prashil.core.demo.beans;

public class ClassRoom {
	private Student[] students;
	private String grade;
	private int totalStudents;
	/**
	 * @return the totalStudents
	 */
	public int getTotalStudents() {
		return totalStudents;
	}
	/**
	 * @param totalStudents the totalStudents to set
	 */
	public void setTotalStudents(int totalStudents) {
		this.totalStudents = totalStudents;
	}
	/**
	 * @return the students
	 */
	public Student[] getStudents() {
		return students;
	}
	/**
	 * @param students the students to set
	 */
	public void setStudents(Student[] students) {
		this.students = students;
		this.totalStudents = students.length;
	}
	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}
}
