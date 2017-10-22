package com.harrari.cata_service.dao;

import com.harrari.cata_service.entities.Produit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface ProduitRepository extends JpaRepository<Produit,Long> {

    @Query("select p from Produit p where p.designation like :x ")
    public Page<Produit> chercherProduits(@Param("x") String mc , Pageable pageable);
}
