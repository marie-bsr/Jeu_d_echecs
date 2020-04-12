package marie.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import marie.model.Plateau;

import java.net.URL;
import java.util.ResourceBundle;

public class PlateauController implements Initializable {

    private Plateau plateau;

    @FXML
    private Pane pane00, pane01, pane02,pane03, pane04, pane05, pane06,pane07,
            pane10,pane11,pane12,pane13,pane14, pane15,pane16,pane17,
            pane20,pane21, pane22, pane23, pane24, pane25, pane26, pane27,
            pane30, pane31, pane32, pane33, pane34, pane35, pane36, pane37,
            pane40, pane41, pane42, pane43, pane44, pane45, pane46, pane47,
            pane50, pane51, pane52, pane53, pane54, pane55, pane56, pane57,
            pane60, pane61, pane62, pane63, pane64, pane65, pane66, pane67,
            pane70, pane71, pane72, pane73, pane74, pane75, pane76, pane77
    ;


    private Pane[][] paneVue;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //plateau du model
        plateau = new Plateau();
        //plateau de la vue
        paneVue = new Pane [8][8];
        paneVue[0] = new Pane[]{pane00, pane01, pane02, pane03, pane04, pane05, pane06, pane07};
        paneVue[1] = new Pane[]{pane10, pane11, pane12, pane13, pane14, pane15, pane16, pane17};
        paneVue[2] = new Pane[]{pane20, pane21, pane22, pane23, pane24, pane25, pane26, pane27};
        paneVue[3] = new Pane[]{pane30, pane31, pane32, pane33, pane34, pane35, pane36, pane37};
        paneVue[4] = new Pane[]{pane40, pane41, pane42, pane43, pane44, pane45, pane46, pane47};
        paneVue[5] = new Pane[]{pane50, pane51, pane52, pane53, pane54, pane55, pane56, pane57};
        paneVue[6] = new Pane[]{pane60, pane61, pane62, pane63, pane64, pane65, pane66, pane67};
        paneVue[7] = new Pane[]{pane70, pane71, pane72, pane73, pane74, pane75, pane76, pane77};

        updateView();

    }

    /**
     methode pour mettre à jour la vue en fonction des infos du modele
     affiche le plateau avec les pieces en bonne position, cad avec images au bon endroit sur les paneaux
     si la case n'est pas vide (du modele), on ajoute une image à la case de la vue
    */

    public void updateView(){
        for (int i = 0; i <8 ; i++) {
            for (int j = 0; j < 8; j++) {
               if(plateau.getPlateau()[i][j]!= null ){
                   paneVue[i][j].getChildren().add(new ImageView(new Image(plateau.getPlateau()[i][j].getCheminImg())));
                }
            }

        }

    }


}
