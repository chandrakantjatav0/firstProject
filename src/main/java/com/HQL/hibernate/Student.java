package com.HQL.hibernate;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.map.ManyToMany.hibernate.Project;

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
public class Student {
	@Id
	@Column(name = "student_id")
	private int id;
	@Column(name = "student_name")
	private String name;
	private String City;
	private String Certificate;
}