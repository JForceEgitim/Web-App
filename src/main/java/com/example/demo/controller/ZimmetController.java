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

import com.example.demo.model.Employee;
import com.example.demo.model.Zimmet;
import com.example.demo.service.ZimmetService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ZimmetController {

	@Autowired
	private ZimmetService zimmetService;

	@GetMapping("/Zim")
	public String viewHomePage(Model model) {
		return findPaginated(1, "firstName", "asc", model);
	}

	@GetMapping("/getZimmet")
	public List<Zimmet> getEmployee() {
		return zimmetService.getAllZimmet();
	}
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/getZimmetById/{id}")
	public Zimmet findbyId(@PathVariable (value = "id") String id) {

		return this.zimmetService.findById(id);
	}

	@GetMapping("/showNewZimmetForm")
	public String showNewZimmetForm(Model model) {
		Zimmet zimmet = new Zimmet();
		model.addAttribute("zimemt", zimmet);
		return "new_zimmet";
	}

	@PostMapping("/saveZimmet")
	public String saveZimmet(@RequestBody Zimmet zimmet) {
		zimmetService.saveZimmet(zimmet);
		return "EKLENDI";
	}

	@GetMapping("/showZimmetFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

		Zimmet zimmet = zimmetService.getZimmetById(id);

		model.addAttribute("zimmet", zimmet);
		return "update_zimmet";
	}

	@GetMapping("/deleteZimemt/{id}")
	public String deleteZimmet(@PathVariable(value = "id") long id) {

		this.zimmetService.deleteZimemtById(id);
		return "redirect:/";
	}

	@GetMapping("/page1/{pageNo}")
	public String findPaginated(@PathVariable(value = "pageNo") int pageNo, @RequestParam("sortField") String sortField,
			@RequestParam("sortDir") String sortDir, Model model) {
		int pageSize = 5;

		Page<Zimmet> page = zimmetService.findPaginated(pageNo, pageSize, sortField, sortDir);
		List<Zimmet> listZimmets = page.getContent();

		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());

		model.addAttribute("sortField", sortField);
		model.addAttribute("sortDir", sortDir);
		model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");

		model.addAttribute("listZimmets", listZimmets);
		return "index";
	}

}