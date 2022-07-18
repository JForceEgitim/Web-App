package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Izin;
import com.example.demo.model.Zimmet;
import com.example.demo.repository.IzinRepository;
@Service
public class IzinServiceImpl implements IzinService {

	@Autowired
	private IzinRepository izinRepository;

	@Override
	public List<Izin> getAllIzin() {
		return izinRepository.findAll();
	}

	@Override
	public void saveIzin(Izin izin) {
		izinRepository.save(izin);
	}
	@Override
    public Izin findById(String id) {
       return izinRepository.findById(Long.parseLong(id));
    }
	

	@Override
	public void deleteIzinById(long id) {
		this.izinRepository.deleteById(id);
	}

	@Override
	public Page<Izin> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
		Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending()
				: Sort.by(sortField).descending();

		Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
		return this.izinRepository.findAll(pageable);
		
	}

	@Override
	public Izin getIzinById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}