package GraphicComponent;


import GraphicComponent.Member;
import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MRtou
 */
public class Db {
      private LinkedList<Member> members ; 
      public Db(){
           members = new LinkedList<Member>();  
      }
      public void add(Member m){
            members.add(m); 
      }
      public void remove(Member m){
            members.add(m); 
      }
      public void show(){
            for(Member m : members){
                  System.out.println(m.getName()+m.getLastName()+m.getEmail()+
                          m.getPhoneNumber()+m.getLevel()
                          +m.getDate()
                          +m.getSexe()
                          +m.getPathPhoto());
            }
           }
}
