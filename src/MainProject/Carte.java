package MainProject;
import GraphicComponent.Member;
import static MainProject.FXMLController.ancho;
import javafx.animation.FadeTransition;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import static javafx.scene.layout.Region.USE_COMPUTED_SIZE;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.util.Duration;

public class Carte{
      public static Node x,y,z; 
      public static Carte now ; 
      private AnchorPane  anchorPane ,anchorBtn ;
private Image img; 
private Circle circle ; 
private Label 
        labelNom, 
        labelEmail, 
        labelTel, 
        labelVille, 
        lEmail, 
        lTel, 
        lVille 
        ; 
Button boui ; 
private Button btn ;
private Member member ; 
public Carte(String nom , String email,String tel ,String ville, String urlimg){
      
      
      anchorBtn = new AnchorPane(); 
      anchorBtn.setVisible(false);
      anchorBtn.setOnMouseClicked(e->{
            anchorBtn.setVisible(false); 
            visibleAll(true); });
      //anchorBtn.setLayoutX(29.0);
    //  anchorBtn.setLayoutY(279.0); 
      anchorBtn.setPrefWidth(200);
      anchorBtn.setPrefHeight(USE_COMPUTED_SIZE);
      anchorBtn.setStyle("-fx-background-color: #ffffff;");
      Button remove = new Button("Supprimer");
      Button modify = new Button("Modifier");
     
      remove.setLayoutX(105.0);
      remove.setLayoutY(143.0);
      remove.setPrefHeight(26);
      remove.setPrefWidth(78);
      remove.setTextFill(Color.WHITE);
      remove.setOnAction(e->FXMLController.hb.getChildren().remove(create()));
      remove.setStyle("-fx-background-radius : 0;"
              + "-fx-background-color: #ec2f2f ;");
     remove.setFont(Font.font("Arial", FontWeight.BOLD,12 ));
    
      modify.setLayoutX(15.0);
      modify.setLayoutY(143.0);
      modify.setPrefHeight(26);
      modify.setPrefWidth(78);
      modify.setTextFill(Color.WHITE);
      modify.setOnAction(e->{
           setAllTextField(); 
           func(x,y);
           anchorBtn.setVisible(false);
           visibleAll(true);}
                  );
      
      modify.setStyle("-fx-background-radius : 0;"
              + "-fx-background-color: #58e738 "); 
       modify.setFont(Font.font("Arial", FontWeight.BOLD,12 ));
      anchorBtn.getChildren().addAll(modify,remove);
      boui = new Button("oui"); 
      boui.setVisible(false);
      btn = new Button("..."); 
      btn.setStyle("-fx-background-color : #d1d1cf;");
      btn.setFont(Font.font("Arial", FontWeight.BOLD,12 ));
      
      btn.setTextFill(Color.WHITE);
      btn.setPrefWidth(15); 
      btn.setPrefHeight(9); 
      btn.setLayoutX(172);
      btn.setLayoutY(0); 
      btn.setOnAction(e->{
            now =  this; 
     
            visibleAll(false);
       
            anchorBtn.setVisible(true);
            //FXMLController.hb.getChildren().remove(create());
            
         //    FXMLController.hbCartes.getChildren().remove(this); 
         
      });
      
      anchorPane = new AnchorPane(); 
      
      img = new Image(urlimg); 
      circle = new Circle(); 
      labelNom = new Label(nom); 
      labelEmail = new Label("Email :"); 
      labelTel = new Label("    Tel :"); 
      labelVille = new Label("  Ville :"); 
      lEmail=new Label(email); 
      lTel = new Label(tel); 
      lVille = new Label(ville); 
      circle.setRadius(58.6);
      circle.setStroke(Color.WHITE);
      circle.setStrokeType(StrokeType.INSIDE);
      circle.setLayoutX(102.0);
      circle.setLayoutY(72.0);
      circle.setFill(new ImagePattern(img));
      //layoutX="29.0" layoutY="279.0" prefHeight="298.0"
      //prefWidth="195.0" style="-fx-background-color: #ffffff;"
      anchorPane.setLayoutX(29.0);
      anchorPane.setLayoutY(279.0); 
      anchorPane.setPrefWidth(195.0);
      anchorPane.setPrefHeight(298.0);
      anchorPane.setStyle("-fx-background-color: #ffffff;");
      // <Label alignment="CENTER" contentDisplay="CENTER" layoutX="24.0" layoutY="143.0" prefHeight="18.0"
      //prefWidth="156.0" text="Rami Toumi" textFill="#595959">
      labelNom.setAlignment(Pos.CENTER);
      labelNom.setContentDisplay(ContentDisplay.CENTER);
      labelNom.setLayoutX(24.0);
      labelNom.setLayoutY(143.0);
      labelNom.setPrefHeight(18.0);
      labelNom.setPrefWidth(156.0);
      labelNom.setTextFill(Color.web("#595959"));
/*<Label layoutX="23.0" layoutY="208.0" text="Email :" textFill="#595959" />
      <Label layoutX="23.0" layoutY="235.0" text="    Tel :" textFill="#595959" />
         <Label layoutX="23.0" layoutY="260.0" text="  Ville :" textFill="#595959"
      <Label layoutX="76.0" layoutY="207.0" prefHeight="18.0" prefWidth="110.0" text="rami@gmail.com" 
               textFill="#595959" />
 <Label layoutX="76.0" layoutY="234.0" prefHeight="18.0" prefWidth="91.0" 
                 text="93175211" textFill="#595959" />
         <Label layoutX="76.0" layoutY="259.0" prefHeight="18.0" prefWidth="91.0" 
                text="bizerte " textFill="#595959" />
                                */
            lVille.setLayoutX(76.0);
             lVille.setLayoutY(259.0);
             lVille.setPrefWidth(91.0);
             lVille.setPrefHeight(18.0);
             lVille.setTextFill(Color.web("#595959"));
             
         
            labelEmail.setLayoutX(23.0);
            labelEmail.setLayoutY(208.0);
            labelEmail.setTextFill(Color.web("#595959"));
            
             labelTel.setLayoutX(23.0);
            labelTel.setLayoutY(235.0);
            labelTel.setTextFill(Color.web("#595959"));
            
             labelVille.setLayoutX(23.0);
             labelVille.setLayoutY(260.0);
             labelVille.setTextFill(Color.web("#595959"));

             lEmail.setLayoutX(76.0);
             lEmail.setLayoutY(207.0);
             lEmail.setPrefWidth(110.0);
             lEmail.setPrefHeight(18.0);
             lEmail.setTextFill(Color.web("#595959"));
             
             lTel.setLayoutX(76.0);
             lTel.setLayoutY(234.0);
             lTel.setPrefWidth(91.0);
             lTel.setPrefHeight(18.0);
             lTel.setTextFill(Color.web("#595959"));
             anchorPane.getChildren().addAll(circle, labelNom,labelEmail,labelTel,labelVille, lEmail,lTel,lVille,btn ,boui,anchorBtn); 
             
}

      public Image getImg() {
            return img;
      }
public Carte(String nom , String email,String tel ,String ville, String urlimg,Member member){
      this.member=member ; 
      
      anchorBtn = new AnchorPane(); 
      anchorBtn.setVisible(false);
      anchorBtn.setOnMouseClicked(e->{
            anchorBtn.setVisible(false); 
            visibleAll(true); });
      //anchorBtn.setLayoutX(29.0);
    //  anchorBtn.setLayoutY(279.0); 
      anchorBtn.setPrefWidth(200);
      anchorBtn.setPrefHeight(USE_COMPUTED_SIZE);
      anchorBtn.setStyle("-fx-background-color: #ffffff;");
      Button remove = new Button("Supprimer");
      Button modify = new Button("Modifier");
     
      remove.setLayoutX(105.0);
      remove.setLayoutY(143.0);
      remove.setPrefHeight(26);
      remove.setPrefWidth(78);
      remove.setTextFill(Color.WHITE);
      remove.setOnAction(e->FXMLController.hb.getChildren().remove(create()));
      remove.setStyle("-fx-background-radius : 0;"
              + "-fx-background-color: #ec2f2f ;");
     remove.setFont(Font.font("Arial", FontWeight.BOLD,12 ));
    
      modify.setLayoutX(15.0);
      modify.setLayoutY(143.0);
      modify.setPrefHeight(26);
      modify.setPrefWidth(78);
      modify.setTextFill(Color.WHITE);
      modify.setOnAction(e->{
           setAllTextField(); 
           func(x,y);
           anchorBtn.setVisible(false);
           visibleAll(true);}
                  );
      
      modify.setStyle("-fx-background-radius : 0;"
              + "-fx-background-color: #58e738 "); 
       modify.setFont(Font.font("Arial", FontWeight.BOLD,12 ));
      anchorBtn.getChildren().addAll(modify,remove);
      boui = new Button("oui"); 
      boui.setVisible(false);
      btn = new Button("..."); 
      btn.setStyle("-fx-background-color : #d1d1cf;");
      btn.setFont(Font.font("Arial", FontWeight.BOLD,12 ));
      
      btn.setTextFill(Color.WHITE);
      btn.setPrefWidth(15); 
      btn.setPrefHeight(9); 
      btn.setLayoutX(172);
      btn.setLayoutY(0); 
      btn.setOnAction(e->{
            now =  this; 
     
            visibleAll(false);
       
            anchorBtn.setVisible(true);
            //FXMLController.hb.getChildren().remove(create());
            
         //    FXMLController.hbCartes.getChildren().remove(this); 
         
      });
      
      anchorPane = new AnchorPane(); 
      
      img = new Image(urlimg); 
      circle = new Circle(); 
      labelNom = new Label(nom); 
      labelEmail = new Label("Email :"); 
      labelTel = new Label("    Tel :"); 
      labelVille = new Label("  Ville :"); 
      lEmail=new Label(email); 
      lTel = new Label(tel); 
      lVille = new Label(ville); 
      circle.setRadius(58.6);
      circle.setStroke(Color.WHITE);
      circle.setStrokeType(StrokeType.INSIDE);
      circle.setLayoutX(102.0);
      circle.setLayoutY(72.0);
      circle.setFill(new ImagePattern(img));
      //layoutX="29.0" layoutY="279.0" prefHeight="298.0"
      //prefWidth="195.0" style="-fx-background-color: #ffffff;"
      anchorPane.setLayoutX(29.0);
      anchorPane.setLayoutY(279.0); 
      anchorPane.setPrefWidth(195.0);
      anchorPane.setPrefHeight(298.0);
      anchorPane.setStyle("-fx-background-color: #ffffff;");
      // <Label alignment="CENTER" contentDisplay="CENTER" layoutX="24.0" layoutY="143.0" prefHeight="18.0"
      //prefWidth="156.0" text="Rami Toumi" textFill="#595959">
      labelNom.setAlignment(Pos.CENTER);
      labelNom.setContentDisplay(ContentDisplay.CENTER);
      labelNom.setLayoutX(24.0);
      labelNom.setLayoutY(143.0);
      labelNom.setPrefHeight(18.0);
      labelNom.setPrefWidth(156.0);
      labelNom.setTextFill(Color.web("#595959"));
/*<Label layoutX="23.0" layoutY="208.0" text="Email :" textFill="#595959" />
      <Label layoutX="23.0" layoutY="235.0" text="    Tel :" textFill="#595959" />
         <Label layoutX="23.0" layoutY="260.0" text="  Ville :" textFill="#595959"
      <Label layoutX="76.0" layoutY="207.0" prefHeight="18.0" prefWidth="110.0" text="rami@gmail.com" 
               textFill="#595959" />
 <Label layoutX="76.0" layoutY="234.0" prefHeight="18.0" prefWidth="91.0" 
                 text="93175211" textFill="#595959" />
         <Label layoutX="76.0" layoutY="259.0" prefHeight="18.0" prefWidth="91.0" 
                text="bizerte " textFill="#595959" />
                                */
            lVille.setLayoutX(76.0);
             lVille.setLayoutY(259.0);
             lVille.setPrefWidth(91.0);
             lVille.setPrefHeight(18.0);
             lVille.setTextFill(Color.web("#595959"));
             
         
            labelEmail.setLayoutX(23.0);
            labelEmail.setLayoutY(208.0);
            labelEmail.setTextFill(Color.web("#595959"));
            
             labelTel.setLayoutX(23.0);
            labelTel.setLayoutY(235.0);
            labelTel.setTextFill(Color.web("#595959"));
            
             labelVille.setLayoutX(23.0);
             labelVille.setLayoutY(260.0);
             labelVille.setTextFill(Color.web("#595959"));

             lEmail.setLayoutX(76.0);
             lEmail.setLayoutY(207.0);
             lEmail.setPrefWidth(110.0);
             lEmail.setPrefHeight(18.0);
             lEmail.setTextFill(Color.web("#595959"));
             
             lTel.setLayoutX(76.0);
             lTel.setLayoutY(234.0);
             lTel.setPrefWidth(91.0);
             lTel.setPrefHeight(18.0);
             lTel.setTextFill(Color.web("#595959"));
             anchorPane.getChildren().addAll(circle, labelNom,labelEmail,labelTel,labelVille, lEmail,lTel,lVille,btn ,boui,anchorBtn); 
             
}

public AnchorPane create(){
      return anchorPane; 
}

public void visibleAll(boolean value){
      
  circle.setVisible(value); 

        labelNom.setVisible(value);
        labelEmail.setVisible(value); 
        labelTel.setVisible(value);
        labelVille.setVisible(value);
        lEmail.setVisible(value);
        lTel.setVisible(value);
        lVille.setVisible(value);
}

      public Member getMember() {
            return member;
      }

      public void setMember(Member member) {
            this.member = member;
      }

public void setAllTextField(){
      FXMLController.lNom.setText(this.labelNom.getText());

      FXMLController.lEmail.setText(this.lEmail.getText());
      FXMLController.lTel.setText(this.lTel.getText());
      FXMLController.lVille.setText(this.lVille.getText());
      
}
public void func(Node x ,Node y ){
      x.setDisable(true);
      y.setDisable(true); 
      
      FXMLController.ancho.setVisible(true);
      FadeTransition ft = new FadeTransition(Duration.millis(1000), ancho);
ft.setFromValue(0);
ft.setToValue(1);
ft.setCycleCount(1);
ft.setAutoReverse(false);
ft.play();
       
}
public static void setNodes(Node x , Node y){
      Carte.x=x ;
      Carte.y=y ;
}
public void setLabelNom(String x){
      this.labelNom.setText(x);
}
public void setlEmail(String x){
      this.lEmail.setText(x);
}
public void setlTel(String x){
      this.lTel.setText(x);
}
public void setlVille(String x){
      this.lVille.setText(x);
}
}