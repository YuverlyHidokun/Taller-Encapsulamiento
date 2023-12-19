public class Usuarios {
    private String nombre;
    private String numTarjetaBanco;

    // Constructor
    public Usuarios(String nombre, String numTarjetaBanco) {
        this.nombre = nombre;
        this.numTarjetaBanco = numTarjetaBanco;
    }

    // Método para mostrar la información del usuario
    public void mostrarInformacion() {
        String mensaje = "Hola, el nombre es: " + nombre + ". Mi número de tarjeta es: " + numTarjetaBanco;
        System.out.println(mensaje);
    }

    public static void main(String[] args) {
        // Crear un objeto de la clase Usuarios
        Usuarios usuario1 = new Usuarios("Juan Perez", "1234-5678-9012-3456");

        // Mostrar la información del usuario1
        usuario1.mostrarInformacion();
    }
}
