package ClasesEj;

// Esta clase representa a un usuario.
// * @author IvánGonzálezGarcía
// * @version 1.0

public class Persona {

    private String nombre;
    private int edad;

    /**
     * Constructor de la clase Usuario.
     * @param nombre Nombre del usuario.
     * @param edad Edad del usuario.
     */

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Obtiene el nombre del usuario.
     * @return El nombre del usuario.
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Verifica si el usuario es mayor de edad.
     * @return true si es mayor de edad, false en caso contrario.
     */

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
}