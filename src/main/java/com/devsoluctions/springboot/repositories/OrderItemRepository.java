package com.devsoluctions.springboot.repositories;

import com.devsoluctions.springboot.entitites.OrderItem;
import com.devsoluctions.springboot.entitites.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
