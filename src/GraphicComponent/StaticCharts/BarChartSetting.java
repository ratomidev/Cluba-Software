/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GraphicComponent.StaticCharts;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;

/**
 *
 * @author MRtou
 */
public class BarChartSetting {
      private BarChart barChart ;
      private XYChart.Series series1 ; 
      
      public BarChartSetting(BarChart barChart){
            this.barChart = barChart; 
            this.series1=new XYChart.Series(); 
             series1.setName("Ages"); 
      }
       
      public void addItem(String name, int x) {
            series1.getData().add(new XYChart.Data(name, x)); 
        
      }
      public void prepare() {
            this.barChart.getData().addAll(series1); 
      }
      /*
       XYChart.Series series1 =new XYChart.Series(); 
        series1.setName("name series"); 
        series1.getData().add(new XYChart.Data("rami",300));
        series1.getData().add(new XYChart.Data("rami1",300)); 
        series1.getData().add(new XYChart.Data("rami2",300)); 
        series1.getData().add(new XYChart.Data("rami3",300)); 
        series1.getData().add(new XYChart.Data("rami4",300)); 
        barChartOne.getData().addAll(series1); 
        */
}
