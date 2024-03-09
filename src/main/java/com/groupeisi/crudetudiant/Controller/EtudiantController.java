package com.groupeisi.crudetudiant.Controller;

import com.groupeisi.crudetudiant.Entity.Etudiant;
import com.groupeisi.crudetudiant.Service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class EtudiantController {
    @Autowired
    private EtudiantService etudiantService;
    @GetMapping
    public List<Etudiant> getAllEtudiants() {
        return etudiantService.getAllEtudiants();
    }
    @PostMapping
    public Etudiant createEtudiant (@RequestBody Etudiant etudiant) {
        return etudiantService.createEtudiant(etudiant);
    }
    @PutMapping("/{id}")
    public Etudiant updateEtudiant(@PathVariable Integer id, @RequestBody Etudiant updatedEtudiant) {
        return etudiantService.updateEtudiant(id, updatedEtudiant);
    }
    @DeleteMapping("/{id}")
    public void deleteEtudiant(@PathVariable Integer id) {
        etudiantService.deleteEtudiant(id);
    }
}
