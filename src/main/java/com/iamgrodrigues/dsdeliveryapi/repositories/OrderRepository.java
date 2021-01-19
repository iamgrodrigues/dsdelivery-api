package com.iamgrodrigues.dsdeliveryapi.repositories;

import com.iamgrodrigues.dsdeliveryapi.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
