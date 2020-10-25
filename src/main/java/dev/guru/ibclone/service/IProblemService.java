package dev.guru.ibclone.service;

import dev.guru.ibclone.model.Problem;

public interface IProblemService {
	public boolean addProblem(Problem problem);
	
	public boolean updateProblem(Problem problem);
	
	public Problem getProblem(int Id);
	
	public Problem submitSolution();
	
}
