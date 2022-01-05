package com.map.HibernateOnetoOneMapping;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToMany;


@Entity
public class Question {
	@Id
	@Column(name="question_id")
	private int questionId;
	private String questionName;
	
		
	//Create a list which consists of multiple data.
	@OneToMany(mappedBy="question")
	private List<Answer> answers;

	//Getter and setter methods for quetionID and questionName
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestionName() {
		return questionName;
	}
	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}
	//Getter and Setter methods for Answer List
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}	
	public Question(int questionId, String questionName, List<Answer> answers) {
		super();
		this.questionId = questionId;
		this.questionName = questionName;
		this.answers = answers;
	}
	public Question() {
		super();
	}
}