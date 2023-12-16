/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2p1_juanlópez;

/**
 *
 * @author jjlm1
 */
public class Items {
    String nombre;
    double hppoints;
    double mppoints;
    
    public Items(String nombre, double hppoints, double mppoints){
        this.nombre=nombre;
        this.hppoints=hppoints;
        this.mppoints=mppoints;
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public void sethp(double hppoints){
        this.hppoints=hppoints;
    }
    public void setmp(double mppoints){
        this.mppoints=mppoints;
    }
    public String getnombre(){
        return nombre;
    }
    public double gethp(){
        return hppoints;
    }
    public double getmp(){
        return mppoints;
    }
}
