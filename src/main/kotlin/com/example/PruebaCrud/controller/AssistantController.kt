package com.example.PruebaCrud.controller




import com.example.PruebaCrud.model.Assistant
import com.example.PruebaCrud.service.AssistantService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/assistant")
class AssistantController {
    @Autowired
    lateinit var assistantService: AssistantService
    @GetMapping
    fun list ():List <Assistant>{
        return assistantService.list()
    }
    @PostMapping
    fun save (@RequestBody assistant: Assistant): ResponseEntity<Assistant> {
        return ResponseEntity(assistantService.save(assistant), HttpStatus.OK)
    }
    @PutMapping
    fun update (@RequestBody assistant: Assistant): ResponseEntity<Assistant> {
        return ResponseEntity(assistantService.update(assistant), HttpStatus.OK)
    }
}