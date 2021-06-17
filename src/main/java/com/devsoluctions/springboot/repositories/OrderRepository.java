package com.devsoluctions.springboot.repositories;

import com.devsoluctions.springboot.entitites.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
