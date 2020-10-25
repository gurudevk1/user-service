package dev.guru.ibclone.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;



@Entity
@Table (name="companies")
@Getter 
@Setter
public class Company {
	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long companyId;
   
}
