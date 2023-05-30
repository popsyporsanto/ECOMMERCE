package com.Amozz.Ecommerce.Repository;

import com.Amozz.Ecommerce.Model.Item;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface    ItemRepository extends JpaRepository<Item,Integer> {
}
