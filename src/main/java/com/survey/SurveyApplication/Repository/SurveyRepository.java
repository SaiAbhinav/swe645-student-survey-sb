package com.survey.SurveyApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.survey.SurveyApplication.Model.SurveyForm;

public interface SurveyRepository extends JpaRepository<SurveyForm, String>{

}
