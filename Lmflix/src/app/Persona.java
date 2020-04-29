package app;

public abstract class Persona {
    public Persona(int edad, String nombre){
        this.edad = edad;
        this.nombre = nombre;
    }
    
    private int edad;
    private String nombre;

    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    

}