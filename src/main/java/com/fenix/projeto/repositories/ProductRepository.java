package com.fenix.projeto.repositories;


import com.fenix.projeto.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {


}
