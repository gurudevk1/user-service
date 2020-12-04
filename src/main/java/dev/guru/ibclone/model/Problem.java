package dev.guru.ibclone.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;


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
    
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "test_id", referencedColumnName = "testId")

    TestCase testcase;
}
