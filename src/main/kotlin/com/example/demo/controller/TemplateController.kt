package com.example.demo.controller

import com.example.demo.model.TemplateModel
import com.example.demo.service.TemplateService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController // @Controller + @ResponseBody
@RequestMapping//("/template")
class TemplateController {

    @Autowired
    private lateinit var templateService: TemplateService

    @GetMapping("/templates")
    private fun getTemplates(): ResponseEntity<Any> {
        return ResponseEntity
                .ok()
                .body(templateService.getAllTemplates())
    }

    @GetMapping("/template/{id}")
    private fun getTemplateById(@PathVariable id: Int): ResponseEntity<Any> {
        return ResponseEntity
                .ok()
                .body(templateService.getTemplate(id))
    }

    @GetMapping("/template")
    private fun getTemplateByName(@RequestParam(value = "name") name: String): ResponseEntity<Any?> {
        return ResponseEntity
                .ok()
                .body(templateService.getTemplateByName(name))
    }

    @PostMapping("/template")
    private fun postTemplate(@RequestBody templateModel: TemplateModel): ResponseEntity<Any> {
        templateService.saveTemplate(templateModel)
        return ResponseEntity
                .ok()
                .body(true)
    }

    @DeleteMapping("/template/{id}")
    fun deleteCricketer(@PathVariable("id") id:Int ):ResponseEntity<String> {
        templateService.deleteTemplateByID(id)
        return ResponseEntity
                .ok()
                .body("remove it")
    }

    @PutMapping("/template/{id}")
    fun updateCricketer(@PathVariable("id") id: Int, @RequestBody templateModel: TemplateModel ):ResponseEntity<Any> {
        val cCricketer  = TemplateModel(
                id = templateModel.id
                , templateName = templateModel.templateName
                , content = templateModel.content)
        templateService.saveTemplate(cCricketer)
        return ResponseEntity
                .ok()
                .body(true)
    }
}