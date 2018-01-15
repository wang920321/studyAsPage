/**
 * 
 */
package com.study.asPage.entry;

/**
 * @author Administrator
 *
 */
public class Student {
	private Integer sId;
    private String studentName;
    private Integer age;
    
	/**
	 * @return the sId
	 */
	public Integer getsId() {
		return sId;
	}
	/**
	 * @param sId the sId to set
	 */
	public void setsId(Integer sId) {
		this.sId = sId;
	}
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
}
