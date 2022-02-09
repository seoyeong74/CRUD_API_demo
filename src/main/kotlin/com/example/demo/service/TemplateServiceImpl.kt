package com.example.demo.service

import com.example.demo.model.TemplateModel
import com.example.demo.repository.TemplateRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
class TemplateServiceImpl constructor(@Autowired private val templateRepository: TemplateRepository) : TemplateService {

    override fun getAllTemplates(): List<TemplateModel>? =
            templateRepository.findAllBy()

    override fun getTemplate(id: Int): TemplateModel? =
            templateRepository.findById(id).orElse(null)

    override fun getTemplateByName(name: String): TemplateModel? {
        return templateRepository.findByTemplateName(name)
    }

    override fun deleteTemplateByID(id: Int) {
        templateRepository.deleteById(id)
    }

    @Transactional
    override fun saveTemplate(templateModel: TemplateModel): TemplateModel =
            templateRepository.save(templateModel)

}