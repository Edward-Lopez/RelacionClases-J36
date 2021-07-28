public class Persona
{
    private String nombre;
    private int edad;
    
    /**
     * Constructor en blanco
     */
    public Persona()
    {
        this.nombre = "";
        this.edad = 0;
    }
    
    /**
     * Constructor con inicialización de datos
     */
    public Persona(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
}




