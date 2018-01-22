package boletin17_3;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**Modifica o programa anterior e engadelle un array cos nomes dos alumnos:
 * Visualiza a nota dun alumno determinado
 * Visualiza unha lista co nome dos alumnos aprobados.
 * Fai unha lista ordenada por orden crecente de notas
 * Visualiza a nota dun alumno determinado que pides por teclado
 */
public class Boletin17_3 {

    public static void main(String[] args) {
        MetodosAlumnos obx1 = new MetodosAlumnos();
        
        Alumno[] listaAlumnos = obx1.crearArray();
        obx1.amosar(listaAlumnos);
        
        obx1.buscar(listaAlumnos, "luisana");
        
        Arrays.sort(listaAlumnos);
        obx1.amosar(listaAlumnos);
        
        String nome = JOptionPane.showInputDialog("Introduzca o nome do alumno");
        obx1.buscar(listaAlumnos, nome);
    }
    
}
