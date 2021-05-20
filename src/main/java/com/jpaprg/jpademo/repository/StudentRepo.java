package com.jpaprg.jpademo.repository;

import com.jpaprg.jpademo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository< Student, Integer> {
}
