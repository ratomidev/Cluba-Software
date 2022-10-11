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
public class BarChartSettingTwo {
      private BarChart barChart ; 
      private XYChart.Series series ; 
      private XYChart.Data license;
      private XYChart.Data preparatoir;
      private XYChart.Data master;
      private XYChart.Data doctorat;
      public BarChartSettingTwo(BarChart barChart){
            this.barChart = barChart; 
            this.series=new XYChart.Series(); 
             series.setName("Niveau scolaire"); 
             this.license= new XYChart.Data("License",15);
             this.preparatoir= new XYChart.Data("Preparatoir",20);
             this.master= new XYChart.Data("Master",40);
             this.doctorat= new XYChart.Data("Doctorat",10);
             series.getData().addAll(license, preparatoir,master,doctorat); 
             this.barChart.getData().addAll(series);
      }
      public void addItem(String name, int x){
           if(name.equals("License")) {
                 this.license.setYValue(x);
           }
           if(name.equals("Preparatoir")) {
                 this.preparatoir.setYValue(x);
           }
           if(name.equals("Master")) {
                 this.master.setYValue(x);
           }
           if(name.equals("Doctorat")) {
                 this.doctorat.setYValue(x);
           }
      }
}
