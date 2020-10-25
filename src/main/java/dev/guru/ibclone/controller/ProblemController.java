package dev.guru.ibclone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.guru.ibclone.dto.ProblemDto;
import dev.guru.ibclone.dto.ResponseDto;

@RestController
public class ProblemController {
	
	@PostMapping("/problem/addProblem")
	public ResponseDto<ProblemDto> addProblem(){
		return null;
		
	}
	
	@GetMapping("/problem/")
	public ResponseDto<ProblemDto> getProblem() {
		return null;
		
	}
	
	@PostMapping("/problem/submitSolution")
	public ResponseDto<ProblemDto>  submitSolution(){
		return null;
		
	}
}
