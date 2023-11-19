package com.example.controller

import com.example.model.Customers
import com.example.service.CustomersService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class CustomersController(private val customersService: CustomersService) {

    @GetMapping("/customers")
    fun getAllCustomers(@RequestParam(defaultValue = "0") page: Int,
                        @RequestParam(defaultValue = "5") size: Int): List<Customers> {
        return customersService.getAllCustomers(page, size)
    }
    @PostMapping("/customers")
    fun saveCustomer(@RequestBody user: Customers): Customers = customersService.saveCustomer(user)

    @DeleteMapping("/customers/{id}")
    fun deleteCustomer(@PathVariable id: Int) = customersService.deleteCustomer(id)

    @PutMapping("/customers/{id}")
    fun updateCustomer(@PathVariable id: Int, @RequestBody updatedCustomer: Customers) = customersService.updateCustomer(id, updatedCustomer)

    @GetMapping("/customers/{id}")
    fun getCustomerById(@PathVariable id: Int): Customers? = customersService.getCustomerById(id)


}
