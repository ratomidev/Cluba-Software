package MainProject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import GraphicComponent.Db;
import GraphicComponent.EventMembers;
import GraphicComponent.Member;
import GraphicComponent.Pie;
import GraphicComponent.StaticCharts.BarChartSetting;
import GraphicComponent.StaticCharts.BarChartSettingThree;
import GraphicComponent.StaticCharts.BarChartSettingTwo;
import GraphicComponent.StaticCharts.PieChartSetting;
import GraphicComponent.StaticCharts.PieChartSettingTwo;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import objects.RecordObj;

/**
 * FXML Controller class
 *
 * @author MRtou
 */
public class FXMLController implements Initializable {
 public static TextField lNom,lEmail,lTel,lVille ;
 public static AnchorPane ancho;
 public static Carte now ; 
    public static HBox hb; 
     private final Db db =new Db(); 
    @FXML
    private VBox MainVBox;

    @FXML
    private AnchorPane StageAnchorPane;

    @FXML
    private Button btn;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnAddPhoto;

    @FXML
    private Button btnBudget;

    @FXML
    private Button btnMembers;

    @FXML
    private Button btnStatistics;

    @FXML
    private CheckBox checkBoxFemale;
    
    @FXML
    private CheckBox checkBoxMale;

    @FXML
    private ComboBox comboBox;

    @FXML
    private HBox hbAdd;

    @FXML
    private ImageView logo;

    @FXML
    private AnchorPane membersAnchorPane;

    @FXML
    private MenuButton menuButton;

    @FXML
    private ScrollPane scrollPane;

    @FXML
    private TextField textFieldCountry;

    @FXML
    private TextField textFieldDate;

    @FXML
    private TextField textFieldEmail;

    @FXML
    private TextField textFieldLastName;

    @FXML
    private TextField textFieldName;

    @FXML
    private TextField textFieldTel;
    @FXML 
    private AnchorPane anchorStatics ; 
    @FXML 
    private PieChart pieChart , pieChart2; 
    @FXML 
    private BarChart barChartOne, barChartTwo; 
    @FXML 
    private AnchorPane anchoBudget; 
    @FXML 
    private Label label0, label1, label2, label4; 
    @FXML
    private TextField tfEvenement , tfSujet, tfDepense, tfSourceRevenu; 
    @FXML 
    private TextArea textArea; 
    @FXML 
    private BarChart barChartThree ; 
    @FXML
    private Button addBtnBudget;
    @FXML 
    private TableColumn columnDate,
            columnSujet,
            columnEvenement,
            columnDepense,
            columnRevenu,
            columnSourceRevenu;
    @FXML 
    private TableView tableV; 
    private String address; 
    private String photoLink;
    
    
    @FXML
    void addToList(ActionEvent event) {

     Member m = takeDataAndCreateMember();
          createAndAddCarte(m);
    }

    @FXML
    void eventBtnBudget(ActionEvent event) {
           anchorStatics.setVisible(false); 
           membersAnchorPane.setVisible(false);
           anchoBudget.setVisible(true);
    }

    @FXML
    void eventBtnMembre(ActionEvent event) {
           anchorStatics.setVisible(false); 
           anchoBudget.setVisible(false);
           membersAnchorPane.setVisible(true);
    }

    @FXML
    void eventBtnStatistiques(ActionEvent event) {
            membersAnchorPane.setVisible(false);
            anchoBudget.setVisible(false);
            anchorStatics.setVisible(true);
    }

    @FXML
    void mouseEntredBtn(MouseEvent event) {
       EventMembers.changeColorOfButtonOnMouseEntred(event);
        }

    @FXML
    void mouseExitedBtn(MouseEvent event) {
          EventMembers.changeColorOfButtonOnMouseExited(event);
    }
    
    @FXML
    void btnAddOnMouseEntred(MouseEvent event){
          EventMembers.btnAddChangeColorOnMouseEntred(event);
          
    }
    
    @FXML
    void btnAddOnMouseExited(MouseEvent event){
          EventMembers.btnAddChangeColorOneMouseExited(event);
    }
    
    @FXML 
    void eventBtnAddPhoto(){
         photoLink= EventMembers.addAphotofinal(btnAddPhoto);
    }
    
    @FXML 
   void eventCheckBoxMale(){
      if(checkBoxFemale.isSelected()){
            checkBoxFemale.setSelected(false);
      }
   }
    
    @FXML
    void eventCheckBoxFemale(){
      if(checkBoxMale.isSelected()){
            checkBoxMale.setSelected(false);
      }
   }
    
      @Override
      public void initialize(URL url, ResourceBundle rb) {
           // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
         
         comboBoxInit(); 
         hbInit(); 
         scrollPane.setStyle("-fx-focus-color: none;");
         hb.setStyle("-fx-focus-color: none;");
         setAncho(); 
         Carte.setNodes(scrollPane,hbAdd);
         
        
        PieChartSetting pieChartSetting =new PieChartSetting(pieChart);
        PieChartSettingTwo pieChartSettingTwo =new PieChartSettingTwo(pieChart2);
        
        pieChartSetting.prepare();
      
        pieChartSettingTwo.prepare();
        pieChartSettingTwo.setNumberOfFemale(175);
        pieChartSettingTwo.setNumberOfMale(200);
      pieChartSetting.addItem("bizerte", 2);
       pieChartSetting.addItem("tunis", 5);
      pieChartSetting.addItem("aryena", 3);
       
        
                 
                 
        //barchart 
       
        BarChartSetting barChartSetting = new BarChartSetting(barChartOne);  
        barChartSetting.prepare();
        barChartSetting.addItem("19", 200);
        barChartSetting.addItem("20", 600);
        barChartSetting.addItem("30", 600);
        barChartSetting.addItem("25", 400);
        barChartSetting.addItem("23", 1000);
        BarChartSettingThree barChartSettingThree = new BarChartSettingThree(barChartThree); 
        barChartSettingThree.addItemR("rami",500 );
        barChartSettingThree.addItemD("rami",1000 );
        barChartSettingThree.addItemD("ahmed",300 );
        barChartSettingThree.addItemR("ahmed",600 );
        barChartSettingThree.addItemD("ahmed",300 );
        barChartSettingThree.addItemR("salah",600 );
        barChartSettingThree.addItemD("salah",300 );
        barChartSettingThree.addItemR("ali",600 );
        barChartSettingThree.addItemD("ali",300 );
       
        
        
        
        
        
        /*
        
        XYChart.Series series2 =new XYChart.Series(); 
        series2.setName("name series"); 
        series2.getData().add(new XYChart.Data("rami",300));
        series2.getData().add(new XYChart.Data("rami1",300)); 
        series2.getData().add(new XYChart.Data("rami2",300)); 
        series2.getData().add(new XYChart.Data("rami3",300)); 
        series2.getData().add(new XYChart.Data("rami4",300)); 
       
        barChartTwo.getData().addAll(series2); 
*/    
        BarChartSettingTwo barChartSettingTwo = new BarChartSettingTwo(barChartTwo);
        barChartSettingTwo.addItem("License", 3);
        barChartSettingTwo.addItem("Doctorat", 4);
      }


     private Member takeDataAndCreateMember(){
           String sexe="" ; 
           if(checkBoxMale.isSelected())
                 sexe = "m"; 
           else sexe = "f"; 
           System.out.println(textFieldName.getText());
                 Member m;
           m = new Member(textFieldName.getText()
                   ,textFieldLastName.getText()
                   ,textFieldEmail.getText()
                   ,textFieldTel.getText()
                   ,textFieldCountry.getText() 
                   ,(String)comboBox.getValue()
                   ,textFieldDate.getText()
                   ,sexe
                   ,photoLink
             );
                 try{
                 db.add(m);
                 db.show();
                 }catch(Exception e){
                       System.out.println("here");
                 }
       return m ; 
          }
    public void comboBoxInit(){
          ObservableList<String> options = 
    FXCollections.observableArrayList(
        "Licence",
        "Mastere",
        "Doctorat"
    );
          comboBox.setItems(options);
    }
    public void createAndAddCarte(Member m){
           Carte c = new Carte(
            m.getName(),
            m.getEmail(),
            m.getPhoneNumber(),
            m.getCountry(),
            m.getPathPhoto(),m); 
      hb.getChildren().add(c.create());
    }
    public void hbInit(){
           hb = new HBox(50); 
        
            hb.setStyle("-fx-background-color :  #e4e4e4; ");
            hb.setPrefWidth(1286.0);
            hb.setPrefHeight(329.0);
            hb.setLayoutX(13.0);
            hb.setLayoutY(13.0);
            
            MainProject.Carte c = new Carte("Rami Toumi","Mr.toumiRami@outlook.fr","93175211","Bizete","C:\\Users\\MRtou\\AndroidStudioProjects\\MyApplication3\\app\\src\\main\\res\\mipmap-hdpi\\ic_aa_round.png");
             MainProject.Carte  cc = new Carte("Safe Haddar","safaahadddar@outlook.fr","28147521","Tunis","C:\\Users\\MRtou\\AndroidStudioProjects\\MyApplication3\\app\\src\\main\\res\\mipmap-hdpi\\ic_aa_round.png") ;
       
                  
           hb.getChildren().addAll(c.create()); 
          hb.getChildren().addAll(cc.create()); 
            
         scrollPane.setContent(hb);
    }

 public void  setAncho(){
 
      ImageView img = new ImageView("C:\\Users\\MRtou\\AndroidStudioProjects\\MyApplication3\\app\\src\\main\\res\\mipmap-hdpi\\ic_aa_round.png"); 
    
 
      TextField labelNom = new TextField("Nom et prénom :");
     
      TextField labelEmail = new TextField("Email :"); 
      TextField labelTel = new TextField("Tel :"); 
      TextField labelVille = new TextField("Ville :");
       lNom=new TextField(".");
    
      lEmail=new TextField("."); 
      lTel = new TextField("."); 
        lVille = new TextField("."); 
      labelNom.setLayoutX(28);
     
      labelEmail.setLayoutX(28);
      labelTel.setLayoutX(28);
      labelVille.setLayoutX(28);
      labelNom.setLayoutY(190);
 
      labelEmail.setLayoutY(230);
      labelTel.setLayoutY(270);
      labelVille.setLayoutY(310);
      labelNom.setAlignment(Pos.TOP_RIGHT);
 
      labelEmail.setAlignment(Pos.TOP_RIGHT);
      labelTel.setAlignment(Pos.TOP_RIGHT);
      labelVille.setAlignment(Pos.TOP_RIGHT);
     labelNom.setEditable(false);

     labelEmail.setEditable(false);
     labelTel.setEditable(false);
     labelVille.setEditable(false);
     
     labelNom.setStyle("-fx-background-color : white ;");
 
     labelEmail.setStyle("-fx-background-color :  white ;");
     labelTel.setStyle("-fx-background-color :  white ;");
     labelVille.setStyle("-fx-background-color :  white;");
     lNom.setLayoutX(228);
     
     lEmail.setLayoutX(228);
     lTel.setLayoutX(228);
     lVille.setLayoutX(228);
     lNom.setLayoutY(190);
   
     lEmail.setLayoutY(230);
     lTel.setLayoutY(270);
     lVille.setLayoutY(310);
    
     img.setLayoutX(179);
     img.setLayoutY(26);
     img.setFitHeight(112);
     
     img.setFitWidth(142);
     
     Button eng = new Button("Enregistrer"); 
     eng.setLayoutX(378);
     eng.setLayoutY(401);
     eng.setStyle("-fx-background-color : #58e738");
    eng.setFont(Font.font("Arial", FontWeight.BOLD,12 ));
    eng.setTextFill(Color.WHITE);
 
    eng.setOnAction(e->{
          try{
          Carte.now.setLabelNom(lNom.getText());
          Carte.now.setlEmail(lEmail.getText());
          Carte.now.setlTel(lTel.getText());
          Carte.now.setlVille(lVille.getText());
          }
    catch(Exception e1){
          System.out.println("rami");
            }; 
          ancho.setVisible(false);
          scrollPane.setDisable(false);
          hbAdd.setDisable(false);
                  
   
    });

            
      
          //  System.out.println(this.now.getVille());
           ancho = new AnchorPane();
            ancho.setVisible(false);
            ancho.setPrefHeight(500);
            ancho.setPrefWidth(500);
            ancho.setLayoutX(350);
            ancho.setLayoutY(80);
            Button b = new Button("X"); 
            b.setStyle("-fx-background-radius : 50"); 
            b.setOnAction(e->{
                  hbAdd.setDisable(false);
                  scrollPane.setDisable(false);
                  ancho.setVisible(false);
                  }); 
            b.setPrefWidth(56);
            b.setPrefHeight(26);
            b.setLayoutX(430);
            b.setLayoutY(0); 
            ancho.getChildren().addAll(b,img, labelNom,labelEmail,labelTel,labelVille,lNom,lEmail,lTel,lVille,eng); 
            ancho.setStyle("-fx-background-color : white;"
            +"-fx-background-radius: 40");
            membersAnchorPane.getChildren().add(ancho);
                    
            
    }

}