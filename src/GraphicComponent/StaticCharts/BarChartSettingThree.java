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
public class BarChartSettingThree {
      private BarChart barChart;
      private XYChart.Series seriesD; 
      private XYChart.Series seriesR; 
      
      public BarChartSettingThree(BarChart barChart) {
            this.barChart = barChart ; 
             this.seriesD=new XYChart.Series(); 
             this.seriesR=new XYChart.Series(); 
             this.seriesD.setName("Depense");
             this.seriesR.setName("Revenu");
             barChart.getData().addAll(seriesD, seriesR); 
      }
      public void addItemD(String name, int x) {
            seriesD.getData().add(new XYChart.Data(name, x));
          
        
      }
      public void addItemR(String name, int x) {
            seriesR.getData().add(new XYChart.Data(name, x)); 
            
        
      }
}
