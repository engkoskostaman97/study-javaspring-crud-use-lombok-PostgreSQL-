package com.developer.belajarcrudjava.repository;

import com.developer.belajarcrudjava.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository  extends JpaRepository<EmployeeEntity, Long> {
}
