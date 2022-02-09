package com.example.demo.service

import com.example.demo.model.TemplateModel
import org.springframework.stereotype.Service

@Service
interface TemplateService {

    fun getAllTemplates(): List<TemplateModel>?

    fun getTemplate(id: Int): TemplateModel?

    fun saveTemplate(templateModel: TemplateModel): TemplateModel

    fun getTemplateByName(name: String): TemplateModel?

    fun deleteTemplateByID(id: Int)
}