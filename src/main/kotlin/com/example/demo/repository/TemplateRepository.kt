package com.example.demo.repository

import com.example.demo.model.TemplateModel
import org.springframework.data.repository.CrudRepository

interface TemplateRepository: CrudRepository<TemplateModel,Int> {

    fun findByTemplateName(templateName: String): TemplateModel?

    fun findAllBy(): List<TemplateModel>?

}