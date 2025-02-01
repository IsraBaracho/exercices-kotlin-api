package com.example.demo_kotlin_api.entity.exercices

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table(name = "exercises", schema = "applications")
data class Exercices(
    @Id
    val id: Long? = null,
    val name: String,
    val sets: Int,
    val repetitions: Int,
    val weight: Int,
    //val media: ByteArray,

)