/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objects;

/**
 *
 * @author MRtou
 */
public class RecordObj {
      private String date;
      private String sujet; 
      private String evenement;
      private String depense; 
      private String revenu; 
      private String sourceRevenu ; 

      public RecordObj(String date, String sujet, String evenement, String depense, String revenu, String sourceRevenu) {
            this.date = date;
            this.sujet = sujet;
            this.evenement = evenement;
            this.depense= depense ; 
            this.revenu = revenu;
            this.sourceRevenu = sourceRevenu;
      }

      public String getDate() {
            return date;
      }

      public void setDate(String date) {
            this.date = date;
      }

      public String getSujet() {
            return sujet;
      }

      public void setSujet(String sujet) {
            this.sujet = sujet;
      }

      public String getEvenement() {
            return evenement;
      }

      public void setEvenement(String evenement) {
            this.evenement = evenement;
      }

      public String getRevenu() {
            return revenu;
      }

      public void setRevenu(String revenu) {
            this.revenu = revenu;
      }

      public String getSourceRevenu() {
            return sourceRevenu;
      }

      public void setSourceRevenu(String sourceRevenu) {
            this.sourceRevenu = sourceRevenu;
      }

      public String getDepense() {
            return depense;
      }

      public void setDepense(String depense) {
            this.depense = depense;
      }
      
      
}
