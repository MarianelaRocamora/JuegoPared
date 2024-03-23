
package juegoejemplo;


public class JuegoEjemplo {

   
    public static void main(String[] args) {
        System.out.println("-------------Inicio del juego-----------");
        Auto ford = new Auto("rojo", 10,5);
        Escena escena1=new Escena(ford);
        escena1.jugar();
      
      
        
        
        
    }
    
}
