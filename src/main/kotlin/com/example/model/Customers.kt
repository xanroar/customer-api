package com.example.model

import jakarta.persistence.*

@Entity
@Table(name = "customers")
data class Customers(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customers_seq")
    @SequenceGenerator(name = "customers_seq", sequenceName = "customers_seq", allocationSize = 1)
    val id: Int? = null,
    val name: String,
    val email: String,
    val phone: String
)
