package fr.pgah.bestioles;

import java.awt.*;
import java.util.Random;

public class Tigre extends Bestiole {

    Random couleur = new Random();
    int mouv = 0;

    public Tigre() {

    }

    public Action getAction(BestioleInfo info) {

        if (info.getEnFace() == Voisin.AUTRE) {
            return Action.INFECTER;
        } else if (info.getEnFace() == Voisin.MUR ^ info.getADroite() == Voisin.MUR) {
            mouv++;
            return Action.GAUCHE;
        } else if (info.getEnFace() == Voisin.MEME) {
            mouv++;
            return Action.DROITE;
        } else {
            mouv++;
            return Action.SAUTER;
        }
    }

    public Color getCouleur() {

        couleur.nextInt(3);
        return Color.red;

    }

    public String toString() {
        return "TGR";
    }
}
