/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GraphicComponent;

/**
 *
 * @author MRtou
 */
public class Member {
      private String name ; 
      private String lastName ; 
      private String email ; 
      private String phoneNumber ; 
      private String country ; 
      private String level ; 
      private String date; 
      private String sexe;
      private String pathPhoto; 
      
      /**
       *
       * @param name
       * @param lastName
       * @param email
       * @param phoneNumber
       * @param country
       */
   


      public Member(String name, String lastName,String email,String phoneNumber,String country,String level,String date,String sexe,String pathPhoto) {
            this.name = name;
            this.lastName = lastName;
            this.email = email; 
            this.phoneNumber = phoneNumber; 
            this.country = country ; 
            this.level=level; 
            this.date = date; 
            this.sexe = sexe;
            this.pathPhoto=pathPhoto; 
      }     

  

      public Member(String name) {
            this.name = name;
      }
    
      public String getLevel() {
            return level;
      }

      public void setLevel(String level) {
            this.level = level;
      }

      public String getDate() {
            return date;
      }

      public void setDate(String date) {
            this.date = date;
      }

      public String getSexe() {
            return sexe;
      }

      public void setSexe(String sexe) {
            this.sexe = sexe;
      }

      public String getPathPhoto() {
            return pathPhoto;
      }

      public void setPathPhoto(String pathPhoto) {
            this.pathPhoto = pathPhoto;
      }
      
    
      public void setName(String name) {
            this.name = name; 
      }
      
      public void setLastName(String lastName) {
            this.lastName = lastName; 
      }
      
      public void setPhoneNumber(String phoneNumber) {
                  this.phoneNumber = phoneNumber; 
      }
      
      public void setEmail(String email) {
                  this.email= email; 
      }
       public void setCountry(String country) {
                  this.country= country; 
      }
      public String getName(){
            return this.name; 
      }
      
      public String getLastName(){
            return this.lastName; 
      }
    
      public String getEmail(){
            return this.email; 
      }
      public String getCountry(){
            return this.country; 
      }
      public String getPhoneNumber() {
            return this.phoneNumber ; 
      }
}
