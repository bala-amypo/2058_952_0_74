package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Idcard {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long card_id;
    private String dept;
    private String regnum;
    private char section;
    @OneToOne
    @JoinColumn(name="student_id")
    private StudentsData std;
}