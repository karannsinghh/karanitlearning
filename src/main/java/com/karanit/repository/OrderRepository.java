package com.karanit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.karanit.entity.Order;


@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
