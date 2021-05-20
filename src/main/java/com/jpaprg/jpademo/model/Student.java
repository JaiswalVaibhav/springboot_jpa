package com.jpaprg.jpademo.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;


@Getter
@Setter
@Entity
public class Student {

    @Id
    private Integer id;
    private String name;
    private String city;


    //@ManyToOne
    //@JoinColumn(name = "dept_id")
    //private Department department1;

    @ManyToMany
    private List<Department> department;


}
