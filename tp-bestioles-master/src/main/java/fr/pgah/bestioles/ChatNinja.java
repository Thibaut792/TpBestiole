package fr.pgah.bestioles;

import java.awt.*;

public class ChatNinja extends Bestiole {

    public ChatNinja() {

    }

    public Action getAction(BestioleInfo info) {

        if (info.getEnFace() == Voisin.AUTRE) {
            return Action.INFECTER;
        }
        if (info.getEnFace() == Voisin.RIEN) {
            return Action.SAUTER;
        }
        if (info.getDerriere() == Voisin.AUTRE) {
            return Action.INFECTER;
        }
        return Action.DROITE;
    }

    public Color getCouleur() {
        return Color.orange;
    }

    public String toString() {
        return "CHNJ";
    }
}
