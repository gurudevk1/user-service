package dev.guru.ibclone.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import dev.guru.ibclone.model.Problem;
import dev.guru.ibclone.repository.ProblemRepository;

public class ProblemServiceImpl implements ProblemService {

	@Autowired
	ProblemRepository problemRepository;
	
	@Override
	public boolean addProblem(Problem problem) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProblem(Problem problem) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Problem getProblem(Long Id) throws Exception{
		Optional<Problem> prob =problemRepository.findById(Id);
		return prob.orElse(null);
	}

	@Override
	public Problem submitSolution() {
		return null;
	}
	
	@Override
	public List<Problem> getAllProblem(){
		
		return problemRepository.findAll();
	}
	

}
