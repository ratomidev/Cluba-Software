/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GraphicComponent;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;

/**
 *
 * @author MRtou
 */
public class Pie {
      
     private  ObservableList<PieChart.Data> pieChartData; 
     private final PieChart chart; 
     private int nbFemale ; 
     private int nbMale ;
      public Pie(){
            nbFemale = 13 ; 
            nbMale=20; 
      this.pieChartData=FXCollections.observableArrayList(
                new PieChart.Data(String.format("Male",nbMale), nbMale),
                 new PieChart.Data(String.format("Fmale %s" ,nbFemale), nbFemale));  
              chart = new PieChart(pieChartData);
      }
       public PieChart show(){
             return this.chart; 
       }
        
        

}
