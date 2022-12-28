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
@Table(name = "career")
public class Career {

	@Id
	private int idCareer;
	@Column
	private String name;
	@ManyToMany(mappedBy = "student")
	private List<StudentHistory> students;
	
	public Career() {
		// TODO Auto-generated constructor stub
	}

	public Career(int idCareer,String name) {
		super();
		this.idCareer = idCareer;
		this.name = name;
		this.students = new ArrayList<>();
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdCareer() {
		return idCareer;
	}

	public List<StudentHistory> getStudents() {
		return students;
	}

	@Override
	public String toString() {
		return "Career [idCareer=" + idCareer + ", name=" + name +  "]";
	}
}
