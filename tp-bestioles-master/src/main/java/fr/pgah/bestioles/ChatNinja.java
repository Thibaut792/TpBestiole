package fr.pgah.bestioles;

import java.awt.*;

public class ChatNinja extends Bestiole {

    public ChatNinja() {

    }

    public Action getAction(BestioleInfo info) {

        if (info.getEnFace() == Voisin.AUTRE) {
            return Action.INFECTER;
        } else if (info.getAGauche() == Voisin.AUTRE) {
            return Action.GAUCHE;
        } else if (info.getADroite() == Voisin.AUTRE) {
            return Action.DROITE;
        } else if (info.getDerriere() == Voisin.MEME) {
            return Action.SAUTER;
        }
        // if (info.getEnFace() == Voisin.MEME) {
        // return Action.SAUTER;
        // }
        return Action.DROITE;
    }

    public Color getCouleur() {
        return Color.orange;
    }

    public String toString() {
        return "CHNJ";
    }
}
