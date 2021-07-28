public class SalaCine4XD extends SalaCine
{
    private String marcaSilla;
    
    /**
     * Constructor en blanco
     */
    public SalaCine4XD()
    {
        super();
        this.marcaSilla = "";
    }
    
    /**
     * Constructor con inicialización de datos
     */
    public SalaCine4XD(int capacidadMax, int cantidadActual, String nombrePelicula, String marcaSilla)
    {
        super(capacidadMax, cantidadActual, nombrePelicula);
        this.marcaSilla = marcaSilla;
    }
    
    public void setMarcaSilla(String marcaSilla)
    {
         this.marcaSilla = marcaSilla;
    }
    
    public String getMarcaSilla()
    {
         return this.marcaSilla;
    }
}
