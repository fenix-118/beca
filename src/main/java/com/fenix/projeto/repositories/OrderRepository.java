package com.fenix.projeto.repositories;

import com.fenix.projeto.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {


}
