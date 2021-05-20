package com.jpaprg.jpademo.repository;

import com.jpaprg.jpademo.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department,Integer> {
}
