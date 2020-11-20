package com.example.brawler.présentation.modèle;

import com.example.brawler.domaine.entité.Message;
import com.example.brawler.domaine.entité.Notification;
import com.example.brawler.domaine.entité.Utilisateur;

import java.util.ArrayList;
import java.util.List;

public class Modèle {

    private List<Utilisateur> listeUtilisateurs;
    private int utilisateurEnRevue;
    private Utilisateur utilisateur;
    private List<Message> messages;
    private List<Notification> notification;
    private String texteRéponse;

    public Modèle(){
        listeUtilisateurs = new ArrayList<>();
        utilisateurEnRevue = 0;
        messages = new ArrayList<>();
    }

    public List<Utilisateur> getListUtilisateurs() {
        return listeUtilisateurs;
    }

    public void setListeUtilisateurs(List<Utilisateur> listUtilisateurs) {
        this.listeUtilisateurs = listUtilisateurs;
    }


    public void setListeMessage(List<Message> messages) {
        this.messages = messages;
    }

    public List<Message> getMessages(){
        return messages;
    }

    public Utilisateur getUtilisateurActuel() {
        return listeUtilisateurs.get(utilisateurEnRevue);
    }

    public int getUtilisateurEnRevue(){
        return utilisateurEnRevue;
    }

    public void prochainUtilisateur(){utilisateurEnRevue +=1;}

    public void viderListeUtilisateurs() {
        if (listeUtilisateurs.size() != 0) {
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

    public void setUtilisateurEnRevue(int i) {
        utilisateurEnRevue = i;
    }

    public List<Utilisateur> getListeUtilisateurs() {
        return listeUtilisateurs;
    }


    //Notification

    public List<Notification> getNotification() {
        return notification;
    }

    public void setNotification(List<Notification> notification) {
        this.notification = notification;
    }

    public String getTexteRéponse() {
        return texteRéponse;
    }

    public void setTexteRéponse(String texteRéponse) {
        this.texteRéponse = texteRéponse;
    }
}
