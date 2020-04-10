package marie.model;

public class Piece {
    private String nom;
    private boolean estBlanc;
    private String cheminImg;


    public Piece(String nom, boolean estBlanc, String cheminImg) {
        this.nom = nom;
        this.estBlanc = estBlanc;
        this.cheminImg = cheminImg;
    }

    public String getCheminImg() {
        return cheminImg;
    }
}



