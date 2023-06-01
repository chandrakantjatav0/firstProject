package com.map.OneToMany.hibernate;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
@Builder
public class Person {
	@Id
	@Column(name = "person_id")
	private int personId;

	@Column(name = "person_name")
	private String PersonName;

	@OneToMany(mappedBy = "person")
	private List<Bank> bank;

}