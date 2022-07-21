public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.nombre = "Pedro Gomez";
        cliente.edad = 38;
        cliente.telefono = 25668794;
        trabajador.salario = 2000;
        cliente.credito = "Hipotecario";
        System.out.println("Cliente: " + cliente.nombre);
        System.out.println("Edad: " + cliente.edad);
        System.out.println("Telefono: " + cliente.telefono);
        System.out.println("Tipo de credito: " + cliente.credito);
        System.out.println("Salario: " + trabajador.salario + " Euros");


    }
}
class Persona {
    int edad;
    String nombre;
    int telefono;
}
class Cliente extends Persona {
    String credito;
}
class Trabajador extends Persona {
    double salario;
}