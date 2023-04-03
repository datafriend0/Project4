package com.proj3.bookCab.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proj3.bookCab.Entity.Cabs;
import com.proj3.bookCab.Repository.CabsRepository;

@Service
public class CabsService {

	@Autowired
	CabsRepository cabsRepository;
	
	public String storeCab(Cabs cab) {
		cabsRepository.save(cab); // Insert query (Create)RUD
		return "Cab details stored successfully";
	}
	
	public List<Cabs> findAllCabs() {
		return cabsRepository.findAll(); // Select query C(Read)UD
	}
	
	public Cabs findCabById(int cabnumber) { // C(Read)UD
		Optional <Cabs> result = cabsRepository.findById(cabnumber);
		if(result.isPresent()) {
			Cabs cc = result.get();
			return cc;
		}else {
			return null;
		}
	}
	
	public String updateCabDetails(Cabs cab) {
		Optional<Cabs> result = cabsRepository.findById(cab.getCabnumber()); // Using Primary Key
		if (result.isPresent()) {
			Cabs cc = result.get();
			cc.setCabinuse(cab.isCabinuse()); // CR(Update)D
			cc.setCabcapacity(cab.getCabcapacity());
			cc.setCabnextpickuplocation(cab.getCabnextpickuplocation());

			// Add other editable parameters here!
			
			cabsRepository.saveAndFlush(cc);
			return "Cab details updated successfully";
			
		}else {
			return "Cab not found";
		}
	}
	
	public String deleteCabById(int cabnumber) { // Delete query CRU(Delete)
		Optional <Cabs> result = cabsRepository.findById(cabnumber);
		if(result.isPresent()) {
			Cabs cc = result.get();
			cabsRepository.deleteById(cc.getCabnumber());
			return "Cab deleted successfully";
		}else {
			return "Cab not found";
		}
	}
	
	public String deleteAllCabs() { // Delete all query CRU(Delete)
		cabsRepository.deleteAll();
		return "Cabs deleted successfully";
	}
	
	public List<Cabs> findCabsByCapacity(int cabcapacity) {
		return cabsRepository.searchCabsByCapacity(cabcapacity);
	} // CabsByCapacity was defined in CabsRepository and then called here.
}
