/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan60.akatsuki;

/**
 *
 * @author Kiyo
 */
public class Akatsuki extends Desa{
    
    public Akatsuki(){
        super();
        
    }
    
    public void tampilAkatsuki(){
        System.out.println("Konohagakure    : " + getKonoha());
        System.out.println("Amegakure       : " + getAme());
        System.out.println("Iwagakure       : " + getIwa());
        System.out.println("Sunagakure      : " + getSuna());
        System.out.println("Kirigakure      : " + getKiri());
        System.out.println("Yugakure        : " + getYu());
        System.out.println("Takigakure      : " + getTaki());
        System.out.println("Otsutsuki       : " + getOtsutsuki());
    }
}
