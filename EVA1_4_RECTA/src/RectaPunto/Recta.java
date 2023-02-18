/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RectaPunto;

/**
 *
 * @author diego
 */
public class Recta {
    Punto punto1;
    Punto punto2;

    public Recta(Punto punto1, Punto punto2) {
        this.punto1 = punto1;
        this.punto1 = punto2;
    }

    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }
    
    public double Distancia(){
        //SEGUN YO AQUI ES DONDE VA LA PUTA FUNCION QUE CALCULE EL PUNTO, CREO QUE ES UN MATHSQUARE Y UN POW
        return 13;
      
    }

}
