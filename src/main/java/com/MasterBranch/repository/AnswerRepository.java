package com.MasterBranch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MasterBranch.model.Answer;

public interface AnswerRepository  extends JpaRepository<Answer, Integer>{
	public List<Answer> findByquestion_id(int question_id);
}