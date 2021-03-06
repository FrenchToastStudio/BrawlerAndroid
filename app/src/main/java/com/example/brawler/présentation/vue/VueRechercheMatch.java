package com.example.brawler.présentation.vue;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.brawler.R;
import com.example.brawler.domaine.entité.Utilisateur;
import com.example.brawler.présentation.présenteur.PrésenteurRechercheMatch;

public class VueRechercheMatch extends Fragment {

    private PrésenteurRechercheMatch présenteur;
    private TextView txtNom;
    private TextView txtLocation;
    private TextView txtVictoire;
    private Button btnAccepter;
    private Button btnPasser;
    private Button btnParLocation;
    private Button btnParNiveau;
    private boolean btnMatchClickable;
    private ImageView imgUtilisateur;

    public void setPrésenteur(PrésenteurRechercheMatch présenteur) {
        this.présenteur = présenteur;
    }

    @Override
    public View onCreateView (LayoutInflater inflater,
                              ViewGroup container,
                              Bundle savedInstanceState) {

        View vue = inflater.inflate(R.layout.fragement_recherche_match, container, false);
        btnMatchClickable = true;
        txtNom = vue.findViewById(R.id.txt_nom);
        txtLocation = vue.findViewById(R.id.txt_location);
        txtVictoire = vue.findViewById(R.id.txt_nombre_victoire);
        btnAccepter = vue.findViewById(R.id.btn_accepter);
        btnPasser = vue.findViewById(R.id.btn_passer);
        btnParLocation = vue.findViewById(R.id.btn_parLocation);
        btnParNiveau = vue.findViewById(R.id.btn_ParNiveau);
        imgUtilisateur = vue.findViewById(R.id.img_utilisateur);

        btnAccepter.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                présenteur.jugerUtilisateur(true);
            }
        });

        btnPasser.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                présenteur.jugerUtilisateur(false);
            }
        });

        btnParLocation.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                présenteur.changerRecherche(false);
            }
        });

        btnParNiveau.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                présenteur.changerRecherche(true);
            }
        });

        return vue;
    }

    public void afficherUtilisateur(Utilisateur utilisateur){
        txtLocation.setText(utilisateur.getLocation());
        txtNom.setText(utilisateur.getNom());
        txtVictoire.setText(String.valueOf(utilisateur.getStatistique().getNombreVictoire()));
    }

    public void  toggleÉtatBouton() {
        btnMatchClickable = !btnMatchClickable;
        btnAccepter.setClickable(btnMatchClickable);
        btnPasser.setClickable(btnMatchClickable);
    }
}
