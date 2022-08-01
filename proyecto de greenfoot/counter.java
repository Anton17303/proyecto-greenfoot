import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class counter extends Actor
{
    private int value1 = 0;
    private int targeta = 0;
    private String text;
    private int largo_string;

    public counter(){
        this("");
    }
    public counter(String prefix)
    {
        text = prefix;
        largo_string = (text.length() + 2) * 16;

        setImage(new GreenfootImage(largo_string, 24));
        GreenfootImage image = getImage();
        Font font = image.getFont();
        image.setFont(font.deriveFont(24.0F));  // use larger font
        image.setColor(Color.BLACK);
        
        updateImage();
    }
    public void act() {
        if(value1 < targeta) {
            value1++;
            updateImage();
        }
        else if(value1 > targeta) {
            value1--;
            updateImage();
        }
    }
    public void add(int puntaje){
        targeta += puntaje;
    }
    public void subtract(int puntaje){
        targeta -= puntaje;
    }
    public int getValue(){
        return value1;
    }
    private void updateImage(){
        GreenfootImage image = getImage();
        image.clear();
        image.drawString(text + value1, 1, 18);
    }
}
