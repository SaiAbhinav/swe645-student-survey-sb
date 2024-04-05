package com.survey.SurveyApplication.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.survey.SurveyApplication.Model.SurveyForm;
import com.survey.SurveyApplication.Repository.SurveyRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class SurveyController {
	
	@Autowired
	private SurveyRepository surveyRepo;
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World";
	}

	@GetMapping("/surveys")
	public ResponseEntity<List<SurveyForm>> getAllSurvey(){
		List<SurveyForm> surveyForms = surveyRepo.findAll();
		return ResponseEntity.ok(surveyForms);
	}

	@GetMapping("/surveys/{id}")
	public ResponseEntity<Optional<SurveyForm>> getSurveyById(@PathVariable String id){
		Optional<SurveyForm> surveyForm = surveyRepo.findById(id);
		if(surveyForm.isPresent()) {
			return ResponseEntity.ok(surveyForm);
		}
		return ResponseEntity.notFound().build();
	}

	@PostMapping("/surveys")
	public ResponseEntity<SurveyForm> saveSurveyForm(@RequestBody SurveyForm form) {
		SurveyForm surveyForm = surveyRepo.save(form);
		return ResponseEntity.ok(surveyForm);
	}

	@PutMapping("/surveys/{id}")
	public ResponseEntity<SurveyForm> updateSurveyForm(@PathVariable String id, @RequestBody SurveyForm form) {
		return surveyRepo.findById(id)
				.map(existingForm -> {
					// Assuming SurveyForm's id is settable. If not, consider adding logic to copy properties.
					form.setId(existingForm.getId()); // Ensure the id is not changed.
					SurveyForm updatedForm = surveyRepo.save(form);
					return ResponseEntity.ok(updatedForm);
				})
				.orElseGet(() -> {
					form.setId(Integer.parseInt(id));
					SurveyForm newForm = surveyRepo.save(form);
					return ResponseEntity.ok(newForm);
				});
	}

	@DeleteMapping("/surveys/{id}")
	public ResponseEntity<?> deleteSurveyById(@PathVariable String id) {
		if(surveyRepo.existsById(id)) {
			surveyRepo.deleteById(id);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
	}

}
