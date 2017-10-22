package com.harrari.cata_service;

import com.harrari.cata_service.dao.ProduitRepository;
import com.harrari.cata_service.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CataServiceApplication implements CommandLineRunner{

    @Autowired
    ProduitRepository produitRepository  ;

    public static void main(String[] args) {
        SpringApplication.run(CataServiceApplication.class, args);
    }


    @Override
    public void run(String... strings) throws Exception {
        produitRepository.save(new Produit("lol",120,125));
        produitRepository.save(new Produit("lol",120,125));
        produitRepository.save(new Produit("lol",120,125));
        produitRepository.save(new Produit("lol",120,125));
        produitRepository.save(new Produit("lol",120,125));


        produitRepository.findAll()
                .forEach(produit -> System.out.println(produit.getDesignation()));

    }
}
