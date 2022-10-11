/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GraphicComponent.StaticCharts;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;

/**
 *
 * @author MRtou
 */
public class PieChartSettingTwo {
      private PieChart pie; 
      private ObservableList<PieChart.Data> pieChartData1; 
      private PieChart.Data female ; 
      private PieChart.Data male ; 
      private int numberOfFemale ; 
      private int numberOfMale ; 
      public PieChartSettingTwo(PieChart pie){
            this.pie= pie ;
            this.numberOfFemale=0; 
            this.numberOfMale=0; 
            this.setVlaues();
             
      }
      public void prepare(){
             ;  
               pie.setData(pieChartData1);
      }
       public void addItem(String name, int number){
            this.pieChartData1.add(new PieChart.Data(name, number)); 
      } 
      public void setNumberOfFemale(int x){
            this.numberOfFemale =x ; 
            this.female.setPieValue(this.numberOfFemale);
            this.setVlaues();
            pie.setData(pieChartData1);
      }
      public void setNumberOfMale(int x){
            this.numberOfMale=x; 
            this.male.setPieValue(this.numberOfMale);
            this.setVlaues();
            pie.setData(pieChartData1);
      }
      private void setVlaues(){
            this.female = new PieChart.Data(
                    String.format("Female %d", this.numberOfFemale),
                    this.numberOfFemale); 
            this.male = new PieChart.Data(
                    String.format("Male %d", this.numberOfMale),
                    this.numberOfMale); 
           this.pieChartData1=FXCollections.observableArrayList(
               female, male );
      } 
}
