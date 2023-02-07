package com.project.searchservice.service;

import java.util.List;

import com.project.searchservice.model.Search;
import com.project.searchservice.model.TransactionRequest;

public interface SearchService {
	public Search dosearch(TransactionRequest search);
	List<Search> getallsearch();
}
