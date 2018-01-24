package boletin17_4;


public class MetodosArray {
    
   public  TablaDNI [] crearArray(){
        TablaDNI [] tabla = {new TablaDNI('A',3),new TablaDNI('B',11),new TablaDNI('C',20),new TablaDNI('D',9),
        new TablaDNI('E',22),new TablaDNI('F',7),new TablaDNI('G',4),new TablaDNI('H',18),new TablaDNI('J',13),
        new TablaDNI('K',21),new TablaDNI('L',19),new TablaDNI('M',5),new TablaDNI('N',12),new TablaDNI('P',8),
        new TablaDNI('Q',16),new TablaDNI('R',1),new TablaDNI('S',15),new TablaDNI('T',0),new TablaDNI('V',17),
        new TablaDNI('W',2),new TablaDNI('X',10),new TablaDNI('Y',6),new TablaDNI('Z',14)};
        
        return tabla;
    }
   
    public char buscarLetra(TablaDNI[] tabla ,int resto){
        boolean encontrado=false; //A persoa non esta na lista
        
        for (int i=0;i<tabla.length;i++){
            if (tabla[i].getResto()==resto){
                encontrado=true;
                return tabla[i].getLetra();
            }
        }
        if (encontrado==false){
            System.out.println("O resto introducinono esta na lista");
        }
        return 0;
    }
   
    public void calcularDNI(int dni){
       int resto = dni % 23;
       char letra = buscarLetra(crearArray(),resto);
       
       System.out.println("O DNI completo e: "+dni+letra);
   }
}
