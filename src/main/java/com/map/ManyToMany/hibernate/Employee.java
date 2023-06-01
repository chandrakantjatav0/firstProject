package com.map.ManyToMany.hibernate;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {

	@Id
	@Column(name = "emp_id")
	private int EmpId;

	@Column(name = "emp_name")
	private String EmpName;

	@ManyToMany
	@JoinTable(name = "emp_leran", joinColumns = { @JoinColumn(name = "EmpId") }, inverseJoinColumns = {
			@JoinColumn(name = ("pid")) })
	private List<Project> project;

}