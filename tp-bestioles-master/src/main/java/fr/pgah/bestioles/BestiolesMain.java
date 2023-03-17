// Bestioles - pgah
// BestiolesMain est la méthode principale de la simulation.
// Vous pouvez modifier le nombre de bestioles ou encore la longueur/largeur
// de la Frame (valeurs passées au constructeur de BestioleFrame)

package fr.pgah.bestioles;

public class BestiolesMain {
    public static void main(String[] args) {
        BestioleFrame frame = new BestioleFrame(60, 40);
        int nbBestiole = 50;
        // décommentez chacune de ces lignes au fur et à mesure
        // que les classes sont complétées
        frame.add(nbBestiole, Ours.class);
        frame.add(nbBestiole, Tigre.class);
        frame.add(nbBestiole, TigreBlanc.class);
        frame.add(nbBestiole, Yeti.class);
        frame.add(nbBestiole, ChatNinja.class);
        frame.add(nbBestiole, Crocodile.class);
        frame.add(nbBestiole, Plancton.class);

        frame.start();
    }
}