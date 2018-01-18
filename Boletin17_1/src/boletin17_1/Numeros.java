package boletin17_1;

import javax.swing.JOptionPane;

public class Numeros {
    int[] numeros = new int[6];
    
    public int[] crearArray(){
        for (int i=0; i<numeros.length;i++){
            numeros[i]=(int) (Math.random() * 50)+1;
        }
        return numeros;
    }
    
    public void amosar(int[] listaNumeros){
        for(int i=0; i<listaNumeros.length;i++){
            System.out.println(listaNumeros[i]);
        } 
    }
    
    public void amosarReves(int[] listaNumeros){
        for(int i=listaNumeros.length-1;i>=0;i--){
            System.out.println(listaNumeros[i]);
        } 
    }
}
