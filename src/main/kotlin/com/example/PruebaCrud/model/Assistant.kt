package com.example.PruebaCrud.model

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "assistant")
class Assistant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    var id: Long? = null

    @Column(name = "fullname")
    var fullname : String? = null

    @Column(name = "role")
    var role: String? = null

    @Column(name = "conferenceid")
    var conferenceid: Int? = null
}
