package com.example.crud.repository;

import com.example.crud.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


///JPA is a specification which specifies how to access, manage and persist information
//data between java objects and relational databases


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
