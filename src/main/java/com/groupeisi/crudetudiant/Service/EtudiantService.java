package com.groupeisi.crudetudiant.Service;

import com.groupeisi.crudetudiant.Entity.Etudiant;
import com.groupeisi.crudetudiant.Repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService {
    @Autowired
    private EtudiantRepository etudiantRepository;

    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }

    public Etudiant createEtudiant (Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }
    public Etudiant updateEtudiant(Integer id, Etudiant updatedEtudiant) {
        Etudiant existingEtudiant = etudiantRepository.findById(id).orElse(null);
        if (existingEtudiant != null) {
            existingEtudiant.setNom(updatedEtudiant.getNom());
            existingEtudiant.setPrenom(updatedEtudiant.getPrenom());

            return etudiantRepository.save(existingEtudiant);
        }
        return null;
    }


    public void deleteEtudiant(Integer id) {
        etudiantRepository .deleteById(id);
    }
}
