package net.javaguides.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.javaguides.springboot.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE " +
    "p.id LIKE CONCAT('%',:query, '%')" +
            "Or p.sku LIKE CONCAT('%', :query, '%')"+
            "Or p.name LIKE CONCAT('%',:query, '%')" +
            "Or p.description LIKE CONCAT('%', :query, '%')"+
            "Or p.active LIKE CONCAT('%', :query, '%')"+
            "Or p.imageUrl LIKE CONCAT('%', :query, '%')"+
            "Or p.dateCreated LIKE CONCAT('%', :query, '%')"+
            "Or p.dateUpdated LIKE CONCAT('%', :query, '%')"
            )
    List<Product> searchProducts(String query);

}
