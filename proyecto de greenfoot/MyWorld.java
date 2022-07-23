import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{


    private counter score;
    private counter level;
    
    private int velocidad_coche;
    private int num_adelantamientos;
    private int num_adelantamientos_nivel;
    private carro4 alonso;
    private int num_rivales;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(973,853, 1); //El tamaño de la imagen de la pista
    
        
       num_adelantamientos = 0; // el contador inicial de puntos
       num_adelantamientos_nivel = 4;
       velocidad_coche = 2; // acumulador y inici de la velocidad del carro personal
       
       score = new counter("Puntos: " );// nombre del contador de puntaje
       level = new counter("Nivel: " );// nombre del contador de niveles
       level.add(1);// puntaje inicial 1
       alonso = new carro4(velocidad_coche);// envia la velocidad del carror
       
       addObject(alonso, 300, 600);
       addObject(level, 100, 90);// posicion del contador niveles
       addObject(score, 100, 60);// posición del contador de puntos
    }
    
    public void act(){
        aumentar_dificultad();//llama la función de aumentar dificultad
        aniadir_rivales();// lla,a la funcion de añadir rivales
    }
    
    public int getRandomNumber(int start,int end){
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
    }
    
    public void aumentar_puntuacion(int valor){
        score.add(valor);// agrega el valor del puntaje en el label
    }
    
    public void aumentar_num_adelantamientos(){
        num_adelantamientos++;
    }
    
    public void disminuir_num_rivales(){
        num_rivales--;
    }
    
    
    public void aumentar_dificultad(){
        if(num_adelantamientos == num_adelantamientos_nivel){
            num_adelantamientos = 0;
            num_adelantamientos_nivel = num_adelantamientos_nivel + 2;
            velocidad_coche++;
            level.add(1);
            alonso.aumenta_velocidad();
        }
    }
   
    public void aniadir_rivales(){
        
        if(num_rivales == 0){
            
            int carril = getRandomNumber(1,6);// genera el número random de carril
            
            if( carril == 1){// carril 1
                addObject(new carro1(velocidad_coche),240, 80);// genera el carro en el carrirl 1
            }
            else if(carril == 2){// carril 2
                addObject(new carro2(velocidad_coche),335, 80);// genera el carro en el carrirl 2
            }
            else if(carril == 3){// carril 3
                addObject(new carro3(velocidad_coche),415, 80);// genera el carro en el carrirl 3
            }
            else if(carril == 4){// carril 4
                addObject(new carro2(velocidad_coche),520, 80);// genera el carro en el carrirl 4
            }
            else if(carril == 5){// carril 5
                addObject(new carro5(velocidad_coche),615, 80);// genera el carro en el carrirl 5
            }
            else{
                addObject(new carro1(velocidad_coche),410, 80);// genera el carro en el carrirl
            }
            
            carril++;
            carril = carril % 3;
            

            if( carril == 1){// carril 1
                addObject(new carro1(velocidad_coche),240, 80);// genera el carro en el carrirl 1
            }
            else if(carril == 2){// carril 2
                addObject(new carro2(velocidad_coche),335, 80);// genera el carro en el carrirl 2
            }
            else if(carril == 3){// carril 3
                addObject(new carro3(velocidad_coche),415, 80);// genera el carro en el carrirl 3
            }
            else if(carril == 4){// carril 4
                addObject(new carro2(velocidad_coche),520, 80);// genera el carro en el carrirl 4
            }
            else if(carril == 5){// carril 5
                addObject(new carro5(velocidad_coche),615, 80);// genera el carro en el carrirl
            }
            else{// carril 
                addObject(new carro1(velocidad_coche),410, 80);// genera el carro en el carrirl
            }
            
            
            num_rivales =2; // cantidad de ribales
        
    }
    
    
    
}
}
