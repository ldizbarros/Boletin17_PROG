package boletin17_4;

import javax.swing.JOptionPane;

public class TablaDNI {
    private int resto;
    private char letra;

    public TablaDNI() {
    }

    public TablaDNI(char letra,int resto) {
        this.resto = resto;
        this.letra = letra;
    }

    public int getResto() {
        return resto;
    }

    public char getLetra() {
        return letra;
    }

    public void setResto(int resto) {
        this.resto = resto;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
}
