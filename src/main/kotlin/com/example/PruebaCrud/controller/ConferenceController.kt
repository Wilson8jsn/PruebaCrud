package com.example.PruebaCrud.controller





import com.example.PruebaCrud.model.Conference
import com.example.PruebaCrud.service.ConferenceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/conference")
class ConferenceController {
    @Autowired
    lateinit var conferenceService: ConferenceService
    @GetMapping
    fun list (): ResponseEntity<*> {
        return ResponseEntity(conferenceService.list(), HttpStatus.OK)
    }
    @PostMapping
    fun save (@RequestBody conference: Conference): ResponseEntity<Conference> {
        return ResponseEntity(conferenceService.save(conference), HttpStatus.OK)
    }
    @PutMapping
    fun update (@RequestBody conference: Conference): ResponseEntity<Conference> {
        return ResponseEntity(conferenceService.update(conference), HttpStatus.OK)
    }
}