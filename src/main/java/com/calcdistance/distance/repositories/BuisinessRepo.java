package com.calcdistance.distance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.calcdistance.distance.models.Buisiness;
@Repository
public interface BuisinessRepo extends JpaRepository<Buisiness, Long>{
	
}
