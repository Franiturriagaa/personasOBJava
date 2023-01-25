public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();

        cliente1.setNombre("Ricardo Lugones");
        cliente1.setEdad(25);
        cliente1.setTelefono("3794-990088");
        cliente1.setCredito(3000);

        System.out.println("Nombre: " + cliente1.getNombre());
        System.out.println("Edad: " + cliente1.getEdad());
        System.out.println("Telefono:  " + cliente1.getTelefono());
        System.out.println("Credito: " + cliente1.getCredito());
        
        Trabajador trabajador1 = new Trabajador();

        trabajador1.setNombre("Matias Perez");
        trabajador1.setEdad(28);
        trabajador1.setTelefono("3794-222333");
        trabajador1.setSalario(300);

        System.out.println("Nombre: " + trabajador1.getNombre());
        System.out.println("Edad: " + trabajador1.getEdad());
        System.out.println("Telefono:  " + trabajador1.getTelefono());
        System.out.println("Salario: " + trabajador1.getSalario());

    }
    }

class Persona {
    int edad;
    String nombre;
    String telefono;
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
class Cliente extends Persona {
    int credito;
    public int getCredito(){
        return credito;
    }
    public void setCredito(int credito){
        this.credito = credito;
    }

}
class Trabajador extends Persona {
    int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

}

