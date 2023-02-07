package com.project.cartservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.cartservice.Model.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, String> {

}
