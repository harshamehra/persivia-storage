package com.harsha.project.percivia;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class KeywordResource {
	
//	@Autowired
	private KeywordRepository repository;
	
	@Inject
	public KeywordResource(KeywordRepository repository){
		this.repository = repository;
	}
	
	@GetMapping("/keywords")
	public  List<KeyWord> getAllKeywords() {
		return repository.findAll();
	}
	
	@PostMapping("/keywords")
	public void saveKeyWord(@RequestBody KeyWord keyword) {
		repository.save(keyword);
	}
	
	@DeleteMapping("/keywords")
	public void delete() {
		repository.deleteAll();
	}

}
