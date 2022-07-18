package com.example.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;


import com.example.demo.model.Zimmet;

public interface ZimmetService {
	List<Zimmet> getAllZimmet();

	void saveZimmet(Zimmet zimmet);

	Zimmet getZimmetById(long id);

	void deleteZimemtById(long id);

	Page<Zimmet> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);


	Zimmet findById(String id);
}