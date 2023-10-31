package com.example.PruebaCrud.service



import com.example.PruebaCrud.model.Conference
import com.example.PruebaCrud.repository.AssistantRepository
import com.example.PruebaCrud.repository.ConferenceRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class ConferenceService {


    @Autowired
    lateinit var conferenceRepository: ConferenceRepository



    fun list ():List<Conference>{
        return conferenceRepository.findAll()
    }

    fun save(conference: Conference): Conference{
        try {
            conferenceRepository.findById(conference.id)
                ?: throw Exception("Id del cliente no encontrada")
            return conferenceRepository.save(conference)
        }catch (ex : Exception){
            throw ResponseStatusException(
                HttpStatus.NOT_FOUND, ex.message, ex)
        }
    }

    fun update(conference: Conference): Conference {
        try {
            conferenceRepository.findById(conference.id)
                ?: throw Exception("ID no existe")

            return conferenceRepository.save(conference)
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }
}