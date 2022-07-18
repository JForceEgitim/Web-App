package com.example.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.demo.model.Izin;

public interface IzinService {
	List<Izin> getAllIzin();

	void saveIzin(Izin izin);

	Izin getIzinById(long id);

	void deleteIzinById(long id);

	Page<Izin> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);

	Izin findById(String id);
}