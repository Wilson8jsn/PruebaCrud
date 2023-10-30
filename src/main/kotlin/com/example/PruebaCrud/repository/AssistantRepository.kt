package com.example.PruebaCrud.repository


import com.example.PruebaCrud.model.Assistant
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AssistantRepository:JpaRepository<Assistant, Long?> {

    fun findById (id: Long?):Assistant?

}

