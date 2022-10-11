/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GraphicComponent;

import java.io.File;
import javafx.event.Event;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author MRtou
 */
public class EventMembers {
      
      public static void changeColorOfButtonOnMouseEntred(Event e){
            Button btnEvent = (Button)e.getSource();
            btnEvent.setStyle("-fx-background-color : #55556f");
      }
      
      public static void changeColorOfButtonOnMouseExited(Event e){
            Button btnEvent = (Button)e.getSource();
            btnEvent.setStyle("-fx-background-color :  #0f1020");
      }
      
      public static void btnAddChangeColorOnMouseEntred(Event e){
            Button btnEvent = (Button)e.getSource();
            btnEvent.setStyle("-fx-background-color : #0f1020");
      }
     
      public static void btnAddChangeColorOneMouseExited(Event e){
            Button btnEvent = (Button)e.getSource();
            btnEvent.setStyle("-fx-background-color : #4c53bf");
      }
      
      public static String addAphotofinal(Button btn){
            String photoLink =""; 
            FileChooser dirChooser = new FileChooser();
            Stage stage = (Stage) btn.getScene().getWindow(); 
            File file = dirChooser.showOpenDialog(stage);
            if(file != null){
                  photoLink =file.getAbsolutePath(); 
            }
            return photoLink; 
      }
}
