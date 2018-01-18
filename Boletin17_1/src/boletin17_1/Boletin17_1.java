package boletin17_1;
/**
 * Realiza un programa que cree un array chamado “numeros” con 6 numeros 
 * aleatorios dun rango de 1 a 50 .Seguidamente visualiza o array o revés 
 * ( 0 primeiro elemento visualizaráse  o último e asi sucesivamente )
*/
public class Boletin17_1 {

    public static void main(String[] args) {
        Numeros obx1 = new Numeros();
        
        int[] listaNumeros=obx1.crearArray();
        
        obx1.amosar(listaNumeros);
      
        obx1.amosarReves(listaNumeros);
        
    }
    
}
