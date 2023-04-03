package com.proj3.bookCab.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.proj3.bookCab.Entity.Cabs;

@Repository
public interface CabsRepository extends JpaRepository<Cabs, Integer> {
	
	@Query ("select c from Cabs c where c.cabcapacity > :cabcapacity")
	public List<Cabs> searchCabsByCapacity(@Param("cabcapacity") int cabcapacity);

}
