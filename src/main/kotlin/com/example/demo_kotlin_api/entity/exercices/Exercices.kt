package com.example.demo_kotlin_api.entity.exercices

import org.springframework.data.relational.core.mapping.Table

@Table(name = "exercices", schema = "application")
data class Exercices(
    val id: Long? = null,
    val name: String,
    val sets: Int,
    val repetitions: Int,
    val weight: Int,
    val media: ByteArray,

)