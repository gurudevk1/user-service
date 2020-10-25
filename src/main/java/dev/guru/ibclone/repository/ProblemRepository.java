package dev.guru.ibclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.guru.ibclone.model.Problem;

public interface ProblemRepository extends JpaRepository<Problem, Long>{
	
	Problem findByProblemId(Long id);

}
