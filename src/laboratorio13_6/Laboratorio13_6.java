package laboratorio13_6;
import galapagos.*;
public class Laboratorio13_6 {

    
    public static void main(String[] args) {
        Turtle t1;
        TurtleDrawingWindow playground;
        
        playground = new TurtleDrawingWindow( );
        t1 = new Turtle(Turtle.NO_DEFAULT_WINDOW);
        playground.add(t1);
        
        playground.setUnit( 0.4 );
        playground.setOrigin(0,-50);
        playground.setVisible(true);


        t1.speed(2000);
        t1.penSize(2);
        
        int cantidadCirculos = 1;
        while(cantidadCirculos <= 20){
            int n = 1;
            while(n <= 360){
            t1.move(2);
            t1.turn(1);
            n++;
            }
            
            t1.move(50);
            t1.turn(-20);
                    
            cantidadCirculos++;
        }
    }
    
}
