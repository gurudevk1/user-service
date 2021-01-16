package dev.guru.ibclone.service;

import java.util.List;

import dev.guru.ibclone.model.Problem;

public interface ProblemService {
	public boolean addProblem(Problem problem);
	
	public boolean updateProblem(Problem problem);
	
	public Problem getProblem(Long Id) throws Exception;
	
	public List<Problem> getAllProblem();
	
	public Problem submitSolution();
	
	
}
