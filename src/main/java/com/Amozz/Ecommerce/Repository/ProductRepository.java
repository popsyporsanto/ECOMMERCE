package com.Amozz.Ecommerce.Repository;

import com.Amozz.Ecommerce.Enum.ProductCategory;
import com.Amozz.Ecommerce.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    List<Product> findAllByProductCategory(ProductCategory productCategory);
}
