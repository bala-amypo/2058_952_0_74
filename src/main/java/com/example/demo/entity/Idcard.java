package com.example.demo.entity;

import jakarta.persistence.Entity;

@Entity
public class Idcard {
    @Id
    @GeneratedValue(strategy=GenerationType)
}