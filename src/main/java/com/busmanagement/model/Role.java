package com.busmanagement.model;

import javax.persistence.*;

/**
 * Entity representing a user role in the system
 */
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole name;

    /**
     * Default constructor
     */
    public Role() {
    }

    /**
     * Constructor with role name
     * 
     * @param name Role name
     */
    public Role(ERole name) {
        this.name = name;
    }

    // Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ERole getName() {
        return name;
    }

    public void setName(ERole name) {
        this.name = name;
    }
}