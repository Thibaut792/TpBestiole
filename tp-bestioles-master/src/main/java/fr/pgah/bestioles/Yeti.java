package fr.pgah.bestioles;

import java.awt.*;

public class Yeti extends Bestiole {

    int mouv = 0;

    public Yeti() {

    }

    public Action getAction(BestioleInfo info) {

        if (info.getEnFace() == Voisin.AUTRE) {
            return Action.INFECTER;
        }
        if (info.getEnFace() == Voisin.RIEN) {
            mouv = mouv + 1;
            return Action.SAUTER;
        }
        mouv = mouv + 1;
        return Action.DROITE;
    }

    public Color getCouleur() {
        return Color.gray;
    }

    public String toString() {

        if (mouv <= 6) {
            return "gna";
        }
        if (mouv <= 12) {
            return "gne";
        }
        if (mouv <= 18) {
            return "bah";
        }
        if (mouv <= 24) {
            mouv = 0;
            return "bek";
        } else {
            return null;
        }
    }
}
