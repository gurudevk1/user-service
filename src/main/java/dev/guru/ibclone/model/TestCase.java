package dev.guru.ibclone.model;

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
public class TestCase{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int testId;
	
    String inputFileLoc;
    String outputFileLoc;
    int maxTime;
    
}
