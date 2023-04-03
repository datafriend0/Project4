package com.proj3.bookCab.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proj3.bookCab.Entity.Cabs;
import com.proj3.bookCab.Service.CabsService;

@RestController
@RequestMapping("cabs") //http:localhost:8080/cabs
public class CabsController {

	@Autowired
	CabsService cabsService;

	// http://localhost:9090/cabs/storeCab
	// Pass data in JSON format
	@PostMapping(value = "storeCab", consumes = MediaType.APPLICATION_JSON_VALUE )
	public String storeCab (@RequestBody Cabs cab) {
		return cabsService.storeCab(cab);
	}
	
	// http://localhost:9090/bookings/findAllCabs
	@GetMapping(value = "findAllCabs", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Cabs> findAllCabs() {
		return cabsService.findAllCabs();
	}
	
	// http://localhost:9090/cabs/findCabById/1
	@GetMapping(value = "findCabById/{cabnumber}")
	public Cabs findCabById(@PathVariable("cabnumber") int cabnumber) {
		return cabsService.findCabById(cabnumber);
	}
	
	// http://localhost:9090/cabs/updateCab
	@PutMapping(value = "updateCab", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateCab(@RequestBody Cabs cab) {
		return cabsService.updateCabDetails(cab);
	}
	
	// http://localhost:9090/cabs/deleteCabById/1
	@DeleteMapping(value = "deleteCabById/{cabnumber}")
	public String deleteCabById(@PathVariable("cabnumber") int cabnumber) {
		return cabsService.deleteCabById(cabnumber);
	}
}
