package com.example.demo.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class SimpleModel(
        @Id
        @GeneratedValue
        val id: Int,
        val Username: String,
        val password: String)