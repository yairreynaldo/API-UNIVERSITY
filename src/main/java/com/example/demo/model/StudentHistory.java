package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.demo.model.Career;
import com.example.demo.model.Student;

@Entity
@Table(name = "studentHistory")
public class StudentHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idHistory;
	@ManyToOne
	@JoinColumn(name="idStudent")
	private Student student;
	@ManyToOne
	@JoinColumn(name="idCareer")
	private Career career;
	@Column
	private Date inscription;
	@Column
	private boolean graduate;
	
	public StudentHistory() {
		// TODO Auto-generated constructor stub
	}

	public StudentHistory(Student student, Career career, Date inscription, boolean graduate) {
		super();
		this.student = student;
		this.career = career;
		this.inscription = inscription;
		this.graduate = graduate;
	}



	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Career getCareer() {
		return career;
	}

	public void setCareer(Career career) {
		this.career = career;
	}

	public Date getInscription() {
		return inscription;
	}

	public void setInscription(Date inscription) {
		this.inscription = inscription;
	}

	public boolean isGraduate() {
		return graduate;
	}

	public void setGraduate(boolean graduate) {
		this.graduate = graduate;
	}

	public int getIdHistory() {
		return idHistory;
	}
	
}
