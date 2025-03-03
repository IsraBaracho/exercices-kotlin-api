package com.example.demo_kotlin_api.service.exercices

import com.example.demo_kotlin_api.entity.exercices.Exercices
import com.example.demo_kotlin_api.repository.exercices.ExercicesRepository
import kotlinx.coroutines.flow.toList
import org.springframework.stereotype.Service

@Service
class ExerciceService(
    private val exercicesRepository: ExercicesRepository
) {
    suspend fun save(exercice: Exercices): Exercices {
        return exercicesRepository.save(exercice)
    }

    suspend fun findAll(): List<Exercices> {
        return exercicesRepository.findAll().toList()
    }

    suspend fun findById(id: Long): Exercices {
        return exercicesRepository.findById(id)
            ?: throw Exception("Exercice not found")
    }
    suspend fun findByName(name: String): List<Exercices> {
        return exercicesRepository.findByName(name)
    }

    suspend fun delete(id: Long) {
        return exercicesRepository.deleteById(id)
    }
}