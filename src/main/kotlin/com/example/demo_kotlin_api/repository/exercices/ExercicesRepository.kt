package com.example.demo_kotlin_api.repository.exercices

import com.example.demo_kotlin_api.entity.exercices.Exercices
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ExercicesRepository: CoroutineCrudRepository<Exercices, Long?> {
    @Query("SELECT * FROM applications.exercises WHERE name = :name")
    suspend fun findByName(name: String): List<Exercices>
}