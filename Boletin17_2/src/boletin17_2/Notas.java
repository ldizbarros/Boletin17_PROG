package boletin17_2;

import javax.swing.JOptionPane;

public class Notas {
    int[] notas = new int[30];
    
    public int[] crearArray(){
        for (int i=0; i<notas.length;i++){
            int nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce una nota"));
            notas[i]=nota;
        }
        return notas;
    }
    
    public void calcularAprobadosSuspensos(){
        int aprobados = 0,suspensos = 0;
        for (int i=0; i<notas.length;i++){
            if (notas[i]>=5){
                aprobados++;
            }else{
                suspensos++;
            }
        }
        System.out.println("Hay "+aprobados+" aprobados y "+suspensos+" suspensos");
    }
    
    public void notaMedia(){
        int suma=0;
        for (int i=0; i<notas.length;i++){
            suma=suma+notas[i];
        }
        System.out.println("A nota media da clase e: "+suma/notas.length);
    }
    
    public void notaMaisAlta(){
        int aux=0;
        for (int i=0; i<notas.length-1;i++){
            for (int f=1; i<notas.length;i++){
                if (notas[i]>notas[f]){
                    if (notas[i]>aux){
                         aux =   notas[i];   
                    }
                }
            }
        }
        
        System.out.println("A maior nota da clase e un "+aux);
    }
}
