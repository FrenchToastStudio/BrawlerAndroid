package com.example.brawler.MockDAO;

import com.example.brawler.domaine.entité.Niveau;
import com.example.brawler.domaine.entité.Statistique;
import com.example.brawler.domaine.entité.Utilisateur;
import com.example.brawler.domaine.intéracteur.SourceUtilisateur;

public class MockUtilisateur implements SourceUtilisateur {
    Utilisateur utilisateur = new Utilisateur("DVilleda", Niveau.INTERMÉDIAIRE,"Montréal", 0,0);
    /**
     * @return Retourne un mock Utilisateur sans photo de profil.
     */
    @Override
    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    @Override
    public void setUtilisateur(Utilisateur utilisateur) {

    }
}
