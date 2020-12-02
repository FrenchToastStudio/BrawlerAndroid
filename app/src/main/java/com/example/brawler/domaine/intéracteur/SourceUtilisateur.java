package com.example.brawler.domaine.intéracteur;

import com.example.brawler.domaine.entité.Message;
import com.example.brawler.domaine.entité.Utilisateur;

import java.util.List;

/**
 * Interface qui contiendra les differentes methodes pour traiter les objet de type Utilisateur
 */
public interface SourceUtilisateur {
    Utilisateur getUtilisateur() throws UtilisateursException;

    Utilisateur getUtilisateurParId(int id, boolean doitLireImage) throws UtilisateursException;

    void setUtilisateur(Utilisateur utilisateur) throws UtilisateursException;

    Utilisateur getUtilisateurActuel() throws UtilisateursException;
}
