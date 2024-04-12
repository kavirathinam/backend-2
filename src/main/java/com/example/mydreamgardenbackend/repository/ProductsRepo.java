package com.example.mydreamgardenbackend.repository;


//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.mydreamgardenbackend.model.Products;

public interface ProductsRepo extends JpaRepository<Products,Integer>{
    @Query("SELECT p FROM Products p WHERE p.productId = :productId")
Products findByName(@RequestParam("productId")Integer productId);
}
