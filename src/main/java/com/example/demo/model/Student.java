package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.example.demo.model.StudentHistory;

@Entity
@Table(name = "student")
public class Student {

	@Id
	private int idStudent;
	@Column
	private String names;
	@Column
	private String lastname;
	@Column
	private int age;
	@Column
	private String genre;
	@Column
	private long dni;
	@Column
	private long numberOfLibrety;
	@Column
	private String residenceCity;
	@ManyToMany(mappedBy = "career")
	private List<StudentHistory> careers;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int idStudent,String names, String lastname, int age, String genre, long dni,long numberOfLibrety, String residenceCity) {
		super();
		this.idStudent = idStudent;
		this.names = names;
		this.lastname = lastname;
		this.age = age;
		this.genre = genre;
		this.dni = dni;
		this.numberOfLibrety = numberOfLibrety;
		this.residenceCity = residenceCity;
		this.careers = new ArrayList<>();
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public String getResidenceCity() {
		return residenceCity;
	}

	public void setResidenceCity(String residenceCity) {
		this.residenceCity = residenceCity;
	}

	public int getIdStudent() {
		return idStudent;
	}

	
	
	@Override
	public String toString() {
		return "Name: "+this.names+
				" Lastname: "+this.lastname+
				" Age: "+this.age+
				" Dni: "+this.dni+
				" Genre: "+this.genre+
				" Librety of student: "+this.numberOfLibrety+
				" Residence city: "+this.residenceCity;
	}
	
}
