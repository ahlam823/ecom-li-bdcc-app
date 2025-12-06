package org.example.billingservice.repository;

import org.example.billingservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface ProductItemRepository extends JpaRepository<ProductItem, Long> {

    @RestResource(path = "byBillId", rel = "byBillId")
    List<ProductItem> findByBillId(@Param("billId") Long billId);
}
