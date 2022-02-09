package com.example.demo.service

import com.example.demo.model.SimpleModel
import org.springframework.stereotype.Service

@Service
interface Service {

    fun getAllUsers(): List<SimpleModel>?

    fun getUser(id: Int): SimpleModel?

    fun saveUser(userModel: SimpleModel): SimpleModel

    fun getUserByName(name: String): SimpleModel?

    fun deleteUserByID(id: Int)
}