package com.paloassignment.FileAPI.repo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paloassignment.FileAPI.entity.Order;

@ComponentScan
@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
