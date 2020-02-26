/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;
import java.lang.Math;
/**
 *
 * @author HP PC
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = {0,0,1,2,3,4,4,7,7,7,7}; //Con este es el 7
        //int[] numeros = {0,0,1,2,3,4,6}; //con este el 6
        //int[] numeros = {0,0,2,6,9,10}; //Con este el 2
        buscar_valor(numeros,0,numeros.length-1);    
    }
    
    static void buscar_valor(int enteros[],int inferior,int superior){
        int mitad;
        
        if(enteros.length-1==enteros[enteros.length-1]){
            System.out.println("El número " + (enteros.length-1)+ " coincide con su posición");
        }
        else{
            mitad= (superior+inferior)/2;
            if(enteros[mitad]==mitad){
                System.out.println("Lo encontró");
                System.out.println("El número " + mitad + " coincide con su posición");    
            }
            if(enteros[mitad]>mitad){   
                if(mitad!=superior){
                    buscar_valor(enteros,inferior, mitad);}
                else{
                    System.out.println("No se encontró");
                }
            }
            if(enteros[mitad]<mitad){   
                if(mitad!=superior){
                    buscar_valor(enteros,mitad,superior);}
                else{
                    System.out.println("No se encontró");
                }
            }
        }
    }   
}
