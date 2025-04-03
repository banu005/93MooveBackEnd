package com.example.demo.repository;


import com.example.demo.model.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//repository : répertoire ou dossier qui fait le lien avec la bdd, va chercher les infos dans la bdd
@Repository
public interface CoursRepository extends JpaRepository<Cours,Integer> {

}
