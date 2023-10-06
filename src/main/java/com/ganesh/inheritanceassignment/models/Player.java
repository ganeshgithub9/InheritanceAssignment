package com.ganesh.inheritanceassignment.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Player {
    @Id
    private UUID uuid;
    private int age;
    private String name;
}
