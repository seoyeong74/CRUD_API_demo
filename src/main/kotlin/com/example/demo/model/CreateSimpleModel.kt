package com.example.demo.model

data class CreateSimpleModel (
        val username: String,
        val password: String
) {
    fun toEntity(): SimpleModel {
        return SimpleModel(
                username = username,
                password = password
        )
    }
}
