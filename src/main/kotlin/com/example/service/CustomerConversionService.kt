package com.example.service

import com.example.model.Customers
import com.example.model.CustomersDTO
import org.springframework.stereotype.Service

@Service
class CustomerConversionService {
    fun toDTO(customers: Customers): CustomersDTO {
        return CustomersDTO(id = customers.id, name = customers.name, email = customers.email, phone = customers.phone)
    }

    fun toEntity(customerDTO: CustomersDTO): Customers {
        return Customers(id = customerDTO.id, name = customerDTO.name, email = customerDTO.email, phone = customerDTO.phone)
    }
}
