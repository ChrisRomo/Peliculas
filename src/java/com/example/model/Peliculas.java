/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.model;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Chris
 */
public class Peliculas {
    public List getBrands (String peli){
        List genero = new ArrayList();
        if(peli.equals("la noche del terror")|| peli.equals("la cabaña")){
            genero.add("terror");
        }
        else if(peli.equals("risa en vacaciones")){
            genero.add("comedia");
        }
        else if(peli.equals("Rey Arturo") || peli.equals("Titanes")){
            genero.add("accion");
        }
        return(genero);
    }
}