package com.proj.school.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity(name = "STUDENT")
@Table
@Getter
@Setter
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id") 
	private int id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "middle_name")
	private String middleName;
	
	@Column(name = "level")
	private String level;
	
	@Column(name = "sub1")
	private String sub1;
	
	@Column(name = "sub2")
	private String sub2;
	
	@Column(name = "sub3")
	private String sub3;
	
	@Column(name = "sub4")
	private String sub4;
	
	@Column(name = "mark_sub1")
	private double markSub1;
	
	@Column(name = "mark_sub2")
	private double markSub2;
	
	@Column(name = "mark_sub3")
	private double markSub3;
	
	@Column(name = "mark_sub4")
	private double markSub4;
}
