/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2p1_juanlópez;

/**
 *
 * @author jjlm1
 */
public class Personaje {
    String nombre;
    double hp;
    double mp;
    double atacpoints;
    double defenpoints;
    
    public Personaje(String nombre,double hp,double mp,double atacpoints,double defenpoints){
        this.nombre=nombre;
        this.hp=hp;
        this.mp=mp;
        this.atacpoints=atacpoints;
        this.defenpoints=defenpoints;
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public void sethp(double hp){
        this.hp=hp;
    }
    public void setmp(double mp){
        this.mp=mp;
    }
    public void setatac(double atacpoints){
        this.atacpoints=atacpoints;
    }
    public void setdefen(double defenpoints){
        this.defenpoints=defenpoints;
    }
    public String getnombre(){
        return nombre;
    }
    public double gethp(){
        return hp;
    }
    public double getmp(){
        return mp;
    }
    public double getatac(){
        return atacpoints;
    }
    public double getdefen(){
        return defenpoints;
    }
    
}
