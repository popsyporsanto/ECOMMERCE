package com.Amozz.Ecommerce.Model;

import com.Amozz.Ecommerce.Enum.ProductCategory;
import com.Amozz.Ecommerce.Enum.ProductStatus;
import jdk.jfr.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;

    private String ProductName;
    private int price;
    private int quantity;

    @Enumerated(EnumType.STRING)
    ProductCategory  productCategory;

    @Enumerated(EnumType.STRING)
    ProductStatus productStatus;

    @ManyToOne
    @JoinColumn
    Seller seller;

    @OneToOne(mappedBy = "product",cascade=CascadeType.ALL)
    Item item ;



}
