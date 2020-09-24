package com.example.brawler.présentation.modèle;

import com.example.brawler.domaine.entité.Utilisateur;

import java.util.ArrayList;

public class Modèle {

    private ArrayList<Utilisateur> listeUtilisateurs;
    private int utilisateurEnRevue;
    private Utilisateur utilisateur;

    public Modèle(){
        listeUtilisateurs = new ArrayList<>();
        utilisateurEnRevue = 0;
    }

    public ArrayList<Utilisateur> getListUtilisateurs() {
        return listeUtilisateurs;
    }

    public void setListeUtilisateurs(ArrayList<Utilisateur> listUtilisateurs) {
        this.listeUtilisateurs = listUtilisateurs;
    }

    public Utilisateur getUtilisateurActuel() {
        return listeUtilisateurs.get(utilisateurEnRevue);
    }

    public int getUtilisateurEnRevue(){
        return utilisateurEnRevue;
    }

    public void prochainUtilisateur(){utilisateurEnRevue +=1;}

    public void viderListe() {
        if (listeUtilisateurs.size() == 0) {
            listeUtilisateurs.removeAll(listeUtilisateurs);
            utilisateurEnRevue = 0;
        }
    }

    public Utilisateur getUtilisateur(){
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
  }
