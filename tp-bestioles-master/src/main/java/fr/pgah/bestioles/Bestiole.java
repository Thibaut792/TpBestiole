// Superclasse de toutes les bestioles.
// Vos classes doivent donc en dériver.
//
// Redéfinissez les méthodes suivantes pour modifier
// le comportement des bestioles :
//
//     public Action getMove(BestioleInfo info)
//     public Color getCouleur()
//     public String toString()
//
// La superclasse définit un comportement par défaut
// pour toutes ces méthodes.

package fr.pgah.bestioles;

import java.awt.*;

public abstract class Bestiole {
  public static enum Voisin {
    MUR, RIEN, MEME, AUTRE
  };

  public static enum Action {
    SAUTER, GAUCHE, DROITE, INFECTER
  };

  public static enum Direction {
    NORD, SUD, EST, OUEST
  };

  public abstract Action getAction(BestioleInfo info);

  public abstract Color getCouleur();

  public abstract String toString();

  // Ceci emêche les classes dérivées de redéfinir l'égalité
  // d'objets Bestiole (important pour que le simulateur fonctionne correctement)
  public final boolean equals(Object autre) {
    return this == autre;
  }
}