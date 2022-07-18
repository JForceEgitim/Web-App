package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Izin;
import com.example.demo.model.Zimmet;
import com.example.demo.service.IzinService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class IzinController {

	@Autowired
	private IzinService izinService;

	@GetMapping("/Izin")
	public String viewHomePage(Model model) {
		return findPaginated(1, "firstName", "asc", model);
	}

	@GetMapping("/getIzin")
	public List<Izin> getIzin() {
		return izinService.getAllIzin();
	}
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/getIzinById/{id}")
	public Izin findbyId(@PathVariable (value = "id") String id) {

		return this.izinService.findById(id);
	}

	@GetMapping("/showNewIzintForm")
	public String showNewIzinForm(Model model) {
		Izin izin = new Izin();
		model.addAttribute("Izin", izin);
		return "new_izin";
	}

	@PostMapping("/saveIzin")
	public String saveIzin(@RequestBody Izin izin) {
		izinService.saveIzin(izin);
		return "EKLENDI";
	}

	@GetMapping("/showIzinFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

		Izin izin = izinService.getIzinById(id);

		model.addAttribute("izin", izin);
		return "update_izin";
	}

	@GetMapping("/deleteIzin/{id}")
	public String deleteIzin(@PathVariable(value = "id") long id) {

		this.izinService.deleteIzinById(id);
		return "redirect:/";
	}

	@GetMapping("/page2/{pageNo}")
	public String findPaginated(@PathVariable(value = "pageNo") int pageNo, @RequestParam("sortField") String sortField,
			@RequestParam("sortDir") String sortDir, Model model) {
		int pageSize = 5;

		Page<Izin> page = izinService.findPaginated(pageNo, pageSize, sortField, sortDir);
		List<Izin> listIzins = page.getContent();

		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());

		model.addAttribute("sortField", sortField);
		model.addAttribute("sortDir", sortDir);
		model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");

		model.addAttribute("listIzins", listIzins);
		return "index";
	}

}