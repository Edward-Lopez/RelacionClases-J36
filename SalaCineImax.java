public class SalaCineImax extends SalaCine
{
    private String sistemaSonido;
    
    /**
     * Constructor en blanco
     */
    public SalaCineImax()
    {
        super();
        this.sistemaSonido = "";
    }
    
    /**
     * Constructor con inicialización de datos
     */
    public SalaCineImax(int capacidadMax, int cantidadActual, String nombrePelicula, String sistemaSonido)
    {
        super(capacidadMax, cantidadActual, nombrePelicula);
        this.sistemaSonido = sistemaSonido;
    }
    
    public void setSistemaSonido(String sistemaSonido)
    {
         this.sistemaSonido = sistemaSonido;
    }
    
    public String getSistemaSonido()
    {
         return this.sistemaSonido;
    }
}
