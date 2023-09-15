/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.quesadilla.ui;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author aleja
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        System.out.println("Ingrese texto a evaluar: ");
        Scanner entrada = new Scanner(System.in);
        String oracion = entrada.nextLine();
        int hermosillo =0;
        int guaymas =0;
        int tijuana=0;
        int desconocido=0;
        
        
        String nuevaOracion = oracion.replace("(", "").replace(")", " ").replace("-", "").replace(" ", "");
        String[] separar = nuevaOracion.split(",");
        System.out.println(nuevaOracion);
        
        for(int i=0; i<separar.length; i++){
            if(separar[i].startsWith("622")){
                guaymas++;
               
            }
            if(separar[i].startsWith("662")){
                hermosillo++;
               
            }
            if(separar[i].startsWith("664")){
                tijuana++;
             
            }
            else{
                desconocido++;
               
            }
            
        }
        System.out.println("Cantidad de claves de Hermosillo: "+hermosillo);
        System.out.println("Cantidad de claves de Guaymas: "+guaymas);
        System.out.println("Cantidad de claves de Tijuana: "+tijuana);
        System.out.println("Cantidad de claves Desconocidas: "+desconocido);
        
        
        
        
        
        
     
     
     
    }
    }
    

