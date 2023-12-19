public class Persona {
    private String nombre;
    private String numTarjetaBanco;

    // Constructor
    public Persona(String nombre, String numTarjetaBanco) {
        this.nombre = nombre;
        this.numTarjetaBanco = numTarjetaBanco;
    }

    // Método getter para el atributo numTarjetaBanco
    public String getNumTarjetaBanco() {
        return numTarjetaBanco;
    }

    // Método setter para el atributo numTarjetaBanco
    public void setNumTarjetaBanco(String nuevoNumero) {
        // Puedes agregar aquí lógica adicional para validar el nuevo número de tarjeta si es necesario
        this.numTarjetaBanco = nuevoNumero;
    }

    // Métodos getter y setter para el atributo nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        // Ejemplo de uso
        Persona persona1 = new Persona("Juan", "1234-5678-9012-3456");

        // Acceder al nombre y número de tarjeta usando los métodos get
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Número de tarjeta: " + persona1.getNumTarjetaBanco());

        // Modificar el nombre y número de tarjeta usando los métodos set
        persona1.setNombre("Pedro");
        persona1.setNumTarjetaBanco("9876-5432-1098-7654");

        // Verificar los cambios
        System.out.println("Nuevo nombre: " + persona1.getNombre());
        System.out.println("Nuevo número de tarjeta: " + persona1.getNumTarjetaBanco());
    }
}
