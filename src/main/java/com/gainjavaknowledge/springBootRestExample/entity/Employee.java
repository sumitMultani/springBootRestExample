package com.gainjavaknowledge.springBootRestExample.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "employee")
@Data
public class Employee {

    @Id
    @Column(name = "emp_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "emp_name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "salary")
    private Integer salary;

    @Column(name = "address")
    private String address;


}
