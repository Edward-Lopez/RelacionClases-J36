public class SalaCine
{
    private int capacidadMax;
    private int cantidadActual;
    private String nombrePelicula;
    protected Persona [] personas;
    
    /**
     * Constructor en blanco
     */
    public SalaCine()
    {
        this.capacidadMax = 50;
        this.cantidadActual = 0;
        this.nombrePelicula = "";
    }
    
    /**
     * Constructor con inicialización de datos
     */
    public SalaCine(int capacidadMax, int cantidadActual, String nombrePelicula)
    {
        this.capacidadMax = capacidadMax;
        this.cantidadActual = cantidadActual;
        this.nombrePelicula = nombrePelicula;
    }
    
    public int getCapacidadMax(){
        return this.capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax){
        this.capacidadMax = capacidadMax;
    }

    public int getCantidadActual(){
        return this.cantidadActual;
    }

    public void setCantidadActual(int cantidadActual){
        this.cantidadActual = cantidadActual;
    }

    public String getNombrePelicula(){
        return this.nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula){
        this.nombrePelicula = nombrePelicula;
    }

    public void setPersonas(Persona [] personas){
        this.personas = personas;
    }
    
    public Persona [] getPersonas(){
        return this.personas;
    }
}


