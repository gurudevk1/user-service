package dev.guru.ibclone.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.guru.ibclone.model.Problem;

public interface ProblemRepository extends JpaRepository<Problem, Long>{
	

	Optional<Problem> findById(Long problemId);
	
	List<Problem> findAll();

}
