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
public class PieChartSetting {
      private PieChart pie;
      private ObservableList<PieChart.Data> pieChartData; 
      
      public PieChartSetting(PieChart pie) {
            this.pie=pie; 
            this.pieChartData=FXCollections.observableArrayList();  
      }
      public void prepare(){
             
               
                 pie.setData(pieChartData);
      }
      public void addItem(String name, int number){
                  
                  PieChart.Data pcd= this.isInList(name); 
                  if(pcd==null)
                        this.pieChartData.add(new PieChart.Data(
                                String.format(name+" %d", number),
                                number)); 
                  else {
                       pcd.setPieValue(number);
                  }
                       
      } 
      private PieChart.Data isInList(String name){
            for(PieChart.Data item : pieChartData){
                 if(item.getName().equals(name)) 
                        return item ; 
            }
            return null ; 
      }
}