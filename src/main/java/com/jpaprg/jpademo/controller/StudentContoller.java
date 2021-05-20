package com.jpaprg.jpademo.controller;

import com.jpaprg.jpademo.model.Student;
import com.jpaprg.jpademo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentContoller {

    @Autowired
    private StudentRepo studentRepo;

    @PostMapping("/saveStudent")
    public String saveStudent(@RequestBody Student student){
        studentRepo.save(student);
        return "student saved";
    }
    }




