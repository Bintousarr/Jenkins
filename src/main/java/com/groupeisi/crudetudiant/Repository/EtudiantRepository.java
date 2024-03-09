package com.groupeisi.crudetudiant.Repository;

import com.groupeisi.crudetudiant.Entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {

}
