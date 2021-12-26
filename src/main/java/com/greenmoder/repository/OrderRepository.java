package com.greenmoder.repository;

import com.greenmoder.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
