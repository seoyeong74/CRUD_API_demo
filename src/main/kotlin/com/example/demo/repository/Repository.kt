package com.example.demo.repository

import com.example.demo.model.SimpleModel
import org.springframework.data.repository.CrudRepository

interface Repository: CrudRepository<SimpleModel,Int> {

    fun findByUsername(Name: String): SimpleModel?

    fun findAllBy(): List<SimpleModel>?

}