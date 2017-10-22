package com.harrari.cata_service.dao;

import com.harrari.cata_service.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;



@RestController
public class ProduitRestService  {
    @Autowired
    ProduitRepository produitRepository ;

    @GetMapping("/Produits")
    public Page<Produit> ListProduit(@RequestParam(defaultValue = "0") int page , @RequestParam(defaultValue = "12")int size ){
        return produitRepository.findAll(new PageRequest(page , size));
    }
    @GetMapping("/findsProduits")
    public Page<Produit> ListProduit( @RequestParam(defaultValue = " ") String mc , @RequestParam(defaultValue = "0") int page , @RequestParam(defaultValue = "12")int size  ){
        return produitRepository.chercherProduits("%"+mc+"%",new PageRequest(page , size));
    }

    @GetMapping("/Produits/{id}")
    public Produit getProduit(@PathVariable Long id ){
        return produitRepository.findOne(id);

    }
    @PostMapping("/Produits")
    public Produit save(@RequestBody Produit p){
        System.out.println(p);
        return  produitRepository.save(p);
    }
    @PutMapping("/Produits/{id}")
    public Produit update(@RequestBody Produit p , @PathVariable Long id ){
        p.setId(id);
        return produitRepository.saveAndFlush(p);
    }
    @DeleteMapping("/Produits/{id}")
    public void delete(@PathVariable Long id){
        produitRepository.delete(id);
    }


}
