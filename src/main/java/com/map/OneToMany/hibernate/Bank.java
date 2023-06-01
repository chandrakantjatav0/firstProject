package com.map.OneToMany.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
public class Bank {
	@Id
	@Column(name="acc_id")
	private int id;
	
	@Column(name = "bank_acc")
	private String BankAccounts;
	
	@ManyToOne
	private Person person;

	
}
