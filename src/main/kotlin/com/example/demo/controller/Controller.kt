package com.example.demo.controller

import com.example.demo.model.SimpleModel
import com.example.demo.model.CreateSimpleModel
import com.example.demo.service.Service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping
class Controller {

    @Autowired
    private lateinit var service: Service

    @GetMapping("/demo/users")
    private fun getTemplates(): ResponseEntity<Any> {
        return ResponseEntity
                .ok()
                .body(service.getAllUsers())
    }

    @GetMapping("/demo/user/{id}")
    private fun getTemplateById(@PathVariable id: Int): ResponseEntity<Any> {
        return ResponseEntity
                .ok()
                .body(service.getUser(id))
    }

    @GetMapping("/demo/user")
    private fun getTemplateByName(@RequestParam(value = "name") name: String): ResponseEntity<Any?> {
        return ResponseEntity
                .ok()
                .body(service.getUserByName(name))
    }

    @PostMapping("/demo/user")
    private fun postTemplate(@RequestBody simpleModel: CreateSimpleModel): ResponseEntity<Any> {
        service.saveUser(simpleModel.toEntity())
        return ResponseEntity
                .ok()
                .body(true)
    }

    @DeleteMapping("/demo/user/{id}")
    fun deleteUser(@PathVariable("id") id:Int ):ResponseEntity<String> {
        service.deleteUserByID(id)
        return ResponseEntity
                .ok()
                .body("remove it")
    }

    @PutMapping("/demo/user/{id}")
    fun updateUser(@PathVariable("id") id: Int, @RequestBody simpleModel: SimpleModel ):ResponseEntity<Any> {
        val changeModel  = SimpleModel(
                id = simpleModel.id
                , username = simpleModel.username
                , password = simpleModel.password)
        service.saveUser(changeModel)
        return ResponseEntity
                .ok()
                .body(true)
    }
}