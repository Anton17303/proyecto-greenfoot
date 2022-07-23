import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class carro2 extends Actor
{
    /**
     * Act - do whatever the carro2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private  int speed;
    
    public carro2(int v){
            speed = v;//llama la varialbe velocidad
    }    
    
    
    public void act() 
    {
        // Add your action code here.
        setLocation(getX(), getY() + speed);// la localiaciòn en eje X y en eje Y màs la suma de la velocidad
        if( getY() >= getWorld().getHeight() - 1 ){// si la posiciòn del objeto es mayor al alto del fondo
            MyWorld juego = (MyWorld) getWorld();
            juego.removeObject(this);// borrar el objeto carro
            juego.aumentar_puntuacion(10);// ell contador de puntaje aumenta en 10
            juego.disminuir_num_rivales();// el numero de rivales disminuye
            juego.aumentar_num_adelantamientos();// aumenta el nuemroo de adelantamientos
        }
    }    
    
}
