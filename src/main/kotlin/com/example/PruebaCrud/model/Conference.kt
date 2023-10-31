package com.example.PruebaCrud.model

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "conference")
class Conference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    var id: Long? = null

    @Column(name = "description")
    var description : String? = null

    @Column(name = "city")
    var city: String? = null

    @Column(name = "totalassistants")
    var totalassistants: Int? = null
}
