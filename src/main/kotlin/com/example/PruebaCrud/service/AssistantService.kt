package com.example.PruebaCrud.service




import com.example.PruebaCrud.model.Assistant
import com.example.PruebaCrud.repository.AssistantRepository
import com.example.PruebaCrud.repository.ConferenceRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class AssistantService {

    @Autowired
    lateinit var conferenceRepository: ConferenceRepository

    @Autowired
    lateinit var assistantRepository: AssistantRepository

    fun list ():List<Assistant>{
        return assistantRepository.findAll()
    }

    fun save(assistant: Assistant): Assistant {
        try{
            assistantRepository.findById(assistant.id)
                ?:throw Exception("Id del cliente no existe")
            return assistantRepository.save(assistant)
        }
        catch (ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }

    fun update(assistant: Assistant): Assistant {
        try {
            assistantRepository.findById(assistant.id)
                ?: throw Exception("ID no existe")

            return assistantRepository.save(assistant)
        }
        catch (ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }
}