package com.example.demo.service

import com.example.demo.model.SimpleModel
import com.example.demo.repository.Repository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
class ServiceImpl constructor(@Autowired private val userRepository: Repository) : com.example.demo.service.Service {

    override fun getAllUsers(): List<SimpleModel>? =
            userRepository.findAllBy()

    override fun getUser(id: Int): SimpleModel? =
            userRepository.findById(id).orElse(null)

    override fun getUserByName(name: String): SimpleModel? {
        return userRepository.findByUsername(name)
    }

    override fun deleteUserByID(id: Int) {
        userRepository.deleteById(id)
    }

    @Transactional
    override fun saveUser(userModel: SimpleModel): SimpleModel =
            userRepository.save(userModel)

}