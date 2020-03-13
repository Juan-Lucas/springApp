package org.esis.gl.springApp.controller;

import org.esis.gl.springApp.dao.EtudiantDao;
import org.esis.gl.springApp.entity.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EtudiantController {

    @Autowired
    EtudiantDao etudiantDao;

    @GetMapping("/index")
    String index(Model model){
        //recuperation de tous les etudiants
        model.addAttribute("etudiants",etudiantDao.findAll());
        return "index";
    }

    @GetMapping("/add")
    String afficherForm(Model model){
        Etudiant etudiant = new Etudiant();
        //on passe un objet vide qu'on va initialiser a partir des donnees du form au formulaire
        model.addAttribute("etudiant",etudiant);
        return "form";
    }

    @PostMapping("/save")
    String save(Etudiant etudiant){
        etudiantDao.save(etudiant);
        return"redirect:/index";
    }
}
