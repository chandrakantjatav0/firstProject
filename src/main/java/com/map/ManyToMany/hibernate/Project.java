package com.map.ManyToMany.hibernate;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Project {
	@Id
	@Column(name = "project_id")
	private int ProjectId;

	@Column(name = "project_name")
	private String ProjectName;

	@ManyToMany(mappedBy= "project")
	private List<Employee> employee;
}
