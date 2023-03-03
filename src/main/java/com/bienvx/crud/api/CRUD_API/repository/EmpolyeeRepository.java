package com.bienvx.crud.api.CRUD_API.repository;

import com.bienvx.crud.api.CRUD_API.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpolyeeRepository extends JpaRepository<Employee, Long> {
}
