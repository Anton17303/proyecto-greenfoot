
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class carro5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class carro5 extends Actor
{

    private  int speed;
    
    public carro5(int v){
            speed = v;//llama la varialbe velocidad
    }    
    
    
    public void act() 
    {
        // Add your action code here.
        setLocation(getX(), getY() + speed);// la localiaciòn en eje X y en eje Y màs la suma de la velocidad
        if( getY() >= getWorld().getHeight() - 1 ){// si la posiciòn del objeto es mayor al alto del fondo
            MyWorld juego = (MyWorld) getWorld();
            juego.removeObject(this);//borrar el objeto carro
            juego.aumentar_puntuacion(10);// ell contador de puntaje aumenta en 10
            juego.disminuir_num_rivales();// el numero de rivales disminuye
            juego.aumentar_num_adelantamientos();// aumenta el nuemroo de adelantamientos
        }
    }    
    
}
