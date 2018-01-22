package boletin17_2;

/**
 * Carga un array  de tipo int, cas notas no módulo de programación ,dos 30 alumnos da clase de DAM .
 * Visualiza o numero de aprobados e o de suspensos.
 * Calcula e visualiza a nota media da clase
 * Visualiza a nota mais alta .
 */
public class Boletin17_2 {

    public static void main(String[] args) {
        Notas obx1 = new Notas();
        
        int [] notas = obx1.crearArray();
        
        for (int i=0; i<notas.length;i++){
            System.out.println("Nota "+(i+1)+": "+notas[i]);
        }
        
        obx1.calcularAprobadosSuspensos();
        
        obx1.notaMedia();
        
        obx1.notaMaisAlta();
    }
    
}
