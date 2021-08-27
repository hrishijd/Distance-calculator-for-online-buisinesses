package com.calcdistance.distance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.calcdistance.distance.models.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
