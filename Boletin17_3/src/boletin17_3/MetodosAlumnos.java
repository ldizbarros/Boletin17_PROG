package boletin17_3;

import javax.swing.JOptionPane;

public class MetodosAlumnos {
    
    public  Alumno[] crearArray(){
        String nome;
        int nota;
        Alumno[] alumnos =  new Alumno[6];
        for (int i=0; i<alumnos.length;i++){
            nome = JOptionPane.showInputDialog("Introduzca o nome do alumno");
            nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce a sua nota"));
            alumnos[i] = new Alumno(nome,nota);
        }
        return alumnos;
    }
    
    public void amosar(Alumno[] listaAlumnos){
        for(Alumno elemento:listaAlumnos){
            System.out.println(elemento);
        } 
    }
    
    public void buscar(Alumno[] listaAlumnos, String nome){
        boolean encontrado=false; //O alumno non esta na lista
        
        for (int i=0;i<listaAlumnos.length;i++){
            if (listaAlumnos[i].getNome().equalsIgnoreCase(nome)){
                System.out.println("A nota de "+nome+" e un "+listaAlumnos[i].getNota());
                encontrado=true;
            }
        }
        if (encontrado==false){
            System.out.println("O alumno introducido non esta na lista");
        }
    }
    
    public void alumnosAprobados(Alumno[] listaAlumnos){
        for(Alumno elemento:listaAlumnos){
            if (elemento.getNota()>=5){
                System.out.println(elemento);
            }
        } 
    }
}
