package fr.pgah.bestioles;

import java.awt.*;

public class TigreBlanc extends Bestiole {

    boolean tgr = false;

    public Action getAction(BestioleInfo info) {

        if (info.getEnFace() == Voisin.AUTRE) {
            tgr = true;
            return Action.INFECTER;
        } else if (info.getEnFace() == Voisin.MUR ^ info.getADroite() == Voisin.MUR) {
            return Action.GAUCHE;
        } else if (info.getEnFace() == Voisin.MEME) {
            return Action.DROITE;
        } else {
            return Action.SAUTER;
        }
    }

    public Color getCouleur() {
        return Color.white;
    }

    public String toString() {
        if (tgr) {
            return "TGR";
        } else {
            return "tgr";
        }
    }

}
