package com.example.repository

import com.example.model.Customers
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomersRepository : JpaRepository<Customers, Int>
