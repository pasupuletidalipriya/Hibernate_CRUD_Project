package anudip.com;

import javax.persistence.Column;

//importing required packages

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")//table name
public class Student 
{
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) //primary key
    private int sid;
	@Column(name="sname")
	private String sname;
	@Column(name="age")
	private int age;
	@Column(name="Course")
	private String course;
	
	//No arg constructor
	public Student()
	{
		super();
		// TODO Auto-generated constructor stub
	}
    
	//Setters and getters
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	
}
