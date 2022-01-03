package com.example.demo.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.Outil;
import com.example.demo.service.IToolsService;

@RestController
@CrossOrigin(origins = "http://localhost:4200",methods = 
{RequestMethod.POST,RequestMethod.GET,RequestMethod.DELETE,RequestMethod.PUT},allowedHeaders = "*")
public class OutilRestController {
	@Autowired
	IToolsService toolsService;
	
	@RequestMapping(value = "/outils", method = RequestMethod.GET)
	public List<Outil> findTools() {
		return toolsService.findAll();
	}
	@GetMapping(value = "/outil/{id}")
	public Outil findOneToolById(@PathVariable Long id) {
		return toolsService.findOutil(id);
	}
	
	@GetMapping(value = "/outil/search/date")
	public List<Outil> findOneToolByDate(@RequestParam Date date) {
		return toolsService.findByDate(date);
	}

	@GetMapping(value = "/outil/search/source")
	public List<Outil> findOneToolBySource(@RequestParam String source) {
		return toolsService.findBySource(source);
	}
	
	
}
