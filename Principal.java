public class Principal
{
    public static void main(String [] args)
    {
        //Creación de sala de cine IMax y revisión de atributos HEREDADOS y propios
        SalaCineImax sala1 = new SalaCineImax(50, 0, "El Vengador del Futuro", "THX");
        System.out.println("la capacidad de mi sala es de : "+sala1.getCapacidadMax());
        System.out.println("el sistema de sonido de mi sala es de : "+sala1.getSistemaSonido());
        
        //Creación de un conjunto de personas en un arreglo
        Persona [] personas = new Persona[3];
        personas[0] = new Persona("Carlos", 25);
        personas[1] = new Persona("Cielo", 20);
        personas[2] = new Persona("Eduardo", 14);
        
        //Revisión de información de una persona del arreglo
        System.out.println("El nombre de la persona en la posición 2 es: " + personas[2].getNombre());
        
        //AGREGACIÓN del conjunto de personas DENTRO de la sala
        sala1.setPersonas(personas);
        
        //Revisión de información de una de las personas del arreglo DENTRO de la sala
        System.out.println("El nombre de la persona en sala en la silla 1 es: " + sala1.getPersonas()[1].getNombre());
        System.out.println("La edad de la persona en sala en la silla 1 es: " + sala1.getPersonas()[1].getEdad());
    }
}
