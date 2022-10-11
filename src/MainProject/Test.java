/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainProject;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author MRtou
 */
public class Test extends Application {
      public Button b; 
      public static void main(String[] args) {
            launch(args); 
      }

      @Override
      public void start(Stage stage) throws Exception {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            HBox hb = new HBox(10) ;
            b = new Button("rami"); 
            hb.getChildren().add(b); 
            E e = new E();
            e.func(this);
            
            stage.setScene(new Scene(hb));
            stage.show();
       }
      public Button getB(){
            return this.b ; 
      }
      
}
