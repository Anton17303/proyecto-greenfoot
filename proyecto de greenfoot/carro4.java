import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class carro4 extends Actor
{
   
     
    private int speed;
    
    public carro4(int v){
        speed = v;
    }

    public void act()
    {
        
        //turn(20);
        if (Greenfoot.isKeyDown("left"))
        {
            
            if(getX()>150+50) // no tiene que avanzar más de 200 pixeles a la derecha
                setLocation(getX() - 4, getY());// toma la posición acutal y le resta 4 pixeles en x y en y lo deja normal
        }
        if (Greenfoot.isKeyDown("right"))
        {
            if(getX()<701-50)// la posiciòn en X sea menr a 651
                setLocation(getX() + 4, getY()); // si es verdadero en a podiciòn en x se sumara 4 px y la posiciòn en y sera igua
        }
        if (Greenfoot.isKeyDown("up"))
        {
            //arriba
            if(getY() > 172)// la posiciòn en Y tiene que ser mayor a 172
                setLocation(getX(), getY()-2);// la posiciòn en Y tiene que disminuir 2 px en 
        }
        if (Greenfoot.isKeyDown("down"))
        {
            if(getY() < 801)// la posciicòn en Y tiene que ser menor a 801
                setLocation(getX(), getY()+4);// si es verdadero la posiciiòn en Y se suamara 4 p y en eje x sera igual
        }
        checkCollision();
    }
    
    public void checkCollision(){
        Actor collide1 = getOneIntersectingObject(carro1.class);// ¡ la colicòn del carro1
        Actor collided2 = getOneIntersectingObject(carro2.class);// ¡ la colicòn del carro 2
        Actor collided3 = getOneIntersectingObject(carro3.class);// ¡ la colicòn del carro 3
        //Actor collided4 = getOneIntersectingObject(carro5.class);// ¡ la colicòn del carro 
        Actor collided5 = getOneIntersectingObject(carro5.class);// ¡ la colicòn del carro 5
        if ( collide1 != null)// ¡ la colicòn del carro 1 es diferencia de null
        {
          getWorld().removeObject(collide1);// se borarrara el objecto carro 1
          getWorld().removeObject(this);// se borarrara el objeto carros 4
          Greenfoot.stop();// se para el juego
        }
        if ( collided2 != null){
          getWorld().removeObject(collided2);
          getWorld().removeObject(this);
          Greenfoot.stop();
        }
        if ( collided3 != null){
          getWorld().removeObject(collided3);
          getWorld().removeObject(this);
          Greenfoot.stop();
        }
        if ( collided5 != null){
          getWorld().removeObject(collided5);
          getWorld().removeObject(this);
          Greenfoot.stop();
        }


    }
    
    public void aumenta_velocidad(){
        speed++;// aumenta la velocidad en += 1
    }
}
