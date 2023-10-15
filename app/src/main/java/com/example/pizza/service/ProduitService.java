package com.example.pizza.service;

import android.util.Log;

import com.example.pizza.dao.IDao;

import java.util.ArrayList;
import java.util.List;
import com.example.pizza.classes.Produit;

public class ProduitService implements IDao<Produit>{
    private List<Produit> produits;

    public ProduitService() {
        this.produits = new ArrayList<>();
    }

    @Override
    public boolean create(Produit o) {
        Log.d("Create : ", o.toString());
        return produits.add(o);
    }

    @Override
    public Produit findById(int id) {
        Log.d("FindById : ", id+"");
        for(Produit p : produits)
            if(p.getId() == id) {
                return p;
            }
        return null;
    }

    @Override
    public List<Produit> findAll() {
        Log.d("findAll : ", produits.size()+"");
        return produits;
    }

    @Override
    public boolean delete(Produit o) {
        Log.d("Delete : ", o.toString());
        return produits.remove(o);
    }

    @Override
    public boolean update(Produit o) {
        Produit p = findById(o.getId());
        p.setNom(o.getNom());
        p.setDescription(o.getDescription());
        p.setNbrIngredients(o.getNbrIngredients());
        p.setDuree(o.getDuree());
        p.setDetaisIngred(o.getDetaisIngred());
        p.setPhoto(o.getPhoto());
        p.setPreparation(o.getPreparation());
        return false;
    }
}






