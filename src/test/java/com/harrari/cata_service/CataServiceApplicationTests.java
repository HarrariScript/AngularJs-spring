package com.harrari.cata_service;

import com.harrari.cata_service.dao.ProduitRepository;
import com.harrari.cata_service.entities.Produit;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CataServiceApplicationTests {
	@Autowired
	ProduitRepository produitRepository;

	@Test
	public void contextLoads() {
		produitRepository.save(new Produit("levovo thinkpad t540p ", 1500, 30));
		produitRepository.save(new Produit("samsung ", 1200, 40));
		produitRepository.save(new Produit("dell Xps ", 1500, 30));
		produitRepository.save(new Produit("levovo thinkpad t540p ", 1500, 30));
		produitRepository.save(new Produit("samsung ", 1200, 40));
		produitRepository.save(new Produit("dell Xps ", 1500, 30));
		produitRepository.save(new Produit("levovo thinkpad t540p ", 1500, 30));
		produitRepository.save(new Produit("samsung ", 1200, 40));
		produitRepository.save(new Produit("dell Xps ", 1500, 30));
		produitRepository.save(new Produit("levovo thinkpad t540p ", 1500, 30));
		produitRepository.save(new Produit("samsung ", 1200, 40));
		produitRepository.save(new Produit("dell Xps ", 1500, 30));
		produitRepository.save(new Produit("levovo thinkpad t540p ", 1500, 30));
		produitRepository.save(new Produit("samsung ", 1200, 40));
		produitRepository.save(new Produit("dell Xps ", 1500, 30));
		produitRepository.save(new Produit("levovo thinkpad t540p ", 1500, 30));
		produitRepository.save(new Produit("samsung ", 1200, 40));
		produitRepository.save(new Produit("dell Xps ", 1500, 30));
		produitRepository.save(new Produit("levovo thinkpad t540p ", 1500, 30));
		produitRepository.save(new Produit("samsung ", 1200, 40));
		produitRepository.save(new Produit("dell Xps ", 1500, 30));



		produitRepository.findAll()
				.forEach(p -> System.out.println("Product name " + p.getDesignation()));
	}

}
