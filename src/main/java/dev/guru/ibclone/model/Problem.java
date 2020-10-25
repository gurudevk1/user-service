package dev.guru.ibclone.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "problems")
@Getter
@Setter
public class Problem {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long problemId;
    
    String problemName;
    String problemURL;
    String createdBy;
    Integer numberOfSuccessfulSubmissions;
    Integer score;
    Date createdDate;
    
    List<Company> listOfCompany;
    TestCase testcase;
}
