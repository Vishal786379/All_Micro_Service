package com.project.searchservice.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.searchservice.model.Search;
import com.project.searchservice.model.TransactionRequest;
import com.project.searchservice.service.SearchServiceImpl;

@RestController
@RequestMapping("/search")
public class SearchServiceController {
	
	@Autowired
	private SearchServiceImpl searchserviceimpl;

	@PostMapping("/dosearch" )
	public Search dosearch(@RequestBody TransactionRequest request) {
		return searchserviceimpl.dosearch(request);
	}
	
	@GetMapping("/getallsearch")
	public List<Search> getallsearch() {
		return searchserviceimpl.getallsearch();
	}
}
