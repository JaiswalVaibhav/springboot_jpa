package com.jpaprg.jpademo.controller;

import com.jpaprg.jpademo.model.Department;
import com.jpaprg.jpademo.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentContoller {

    @Autowired
    private DepartmentRepo departmentRepo;


    @PostMapping("/saveDept")
    public String saveDepartment(@RequestBody Department department){
        departmentRepo.save(department);
        return "department save";
    }
}
