package marie.model;

public class Plateau {
    //tableau 8x8
    //case vide => coordonnees null


    private Piece[] [] plateau;

//plateau vide
    public Plateau() {
        this.plateau = new Piece[8][8];
        for (int i = 0; i <8 ; i++) {
            for (int j = 0; j < 8; j++) {
                plateau[i][j] = null;
            }

        }
//initialisation des 32 pièces
        plateau[0][0] = new Piece("tour",false, "File:Images/tourN.png");
        plateau[0][1] = new Piece("cavalier",false , "File:Images/cavalierN.png");
        plateau[0][2] = new Piece("fou",false, "File:Images/fouN.png");
        plateau[0][3] = new Piece("roi",false, "File:Images/roiN.png");
        plateau[0][4] = new Piece("dame",false, "File:Images/dameN.png");
        plateau[0][5] = new Piece("fou",false, "File:Images/fouN.png");
        plateau[0][6] = new Piece("cavalier",false, "File:Images/cavalierN.png");
        plateau[0][7] = new Piece("tour",false, "File:Images/tourN.png");

        plateau[1][0] = new Piece("pion",false, "File:Images/pionN.png");
        plateau[1][1] = new Piece("pion",false, "File:Images/pionN.png");
        plateau[1][2] = new Piece("pion",false, "File:Images/pionN.png");
        plateau[1][3] = new Piece("pion",false, "File:Images/pionN.png");
        plateau[1][4] = new Piece("pion",false, "File:Images/pionN.png");
        plateau[1][5] = new Piece("pion",false, "File:Images/pionN.png");
        plateau[1][6] = new Piece("pion",false, "File:Images/pionN.png");
        plateau[1][7] = new Piece("pion",false, "File:Images/pionN.png");

        plateau[6][0] = new Piece("pion",true, "File:Images/pionB.png");
        plateau[6][1] = new Piece("pion",true, "File:Images/pionB.png");
        plateau[6][2] = new Piece("pion",true, "File:Images/pionB.png");
        plateau[6][3] = new Piece("pion",true, "File:Images/pionB.png");
        plateau[6][4] = new Piece("pion",true, "File:Images/pionB.png");
        plateau[6][5] = new Piece("pion",true, "File:Images/pionB.png");
        plateau[6][6] = new Piece("pion",true, "File:Images/pionB.png");
        plateau[6][7] = new Piece("pion",true, "File:Images/pionB.png");

        plateau[7][0] = new Piece("tour",true, "File:Images/tourB.png");
        plateau[7][1] = new Piece("cavalier",true, "File:Images/cavalierB.png");
        plateau[7][2] = new Piece("fou",true, "File:Images/fouB.png");
        plateau[7][3] = new Piece("roi",true, "File:Images/roiB.png");
        plateau[7][4] = new Piece("dame",true, "File:Images/dameB.png");
        plateau[7][5] = new Piece("fou",true, "File:Images/fouB.png");
        plateau[7][6] = new Piece("cavalier",true, "File:Images/cavalierB.png");
        plateau[7][7] = new Piece("tour",true, "File:Images/tourB.png");
    }

    public Piece[][] getPlateau() {
        return plateau;
    }
}
