package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.model.Zimmet;
import com.example.demo.repository.ZimmetRepository;

@Service
public class ZimmetServiceImpl implements ZimmetService {

	@Autowired
	private ZimmetRepository zimmetRepository;

	@Override
	public List<Zimmet> getAllZimmet() {
		return zimmetRepository.findAll();
	}

	@Override
	public void saveZimmet(Zimmet zimmet) {
		zimmetRepository.save(zimmet);
	}
	@Override
    public Zimmet findById(String id) {
       return zimmetRepository.findById(Long.parseLong(id));
    }
	

	@Override
	public void deleteZimemtById(long id) {
		this.zimmetRepository.deleteById(id);
	}

	@Override
	public Page<Zimmet> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
		Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending()
				: Sort.by(sortField).descending();

		Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
		return this.zimmetRepository.findAll(pageable);
	}

	@Override
	public Zimmet getZimmetById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}