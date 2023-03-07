package tareacuatro;

public class Perro {
    private String color;
    private int edad;
    private String nombre;
    private String raza;
    private double tamaño;


    public Perro() {
    }

    public Perro(String color, double tamaño, int edad, String raza, String nombre) {
        this.color = color;
        this.tamaño = tamaño;
        this.edad = edad;
        this.raza = raza;
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(byte tamaño) {
        this.tamaño = tamaño;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setEspecie(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "Color=" + color +
                ", tamaño=" + tamaño +
                ", edad=" + edad +
                ", raza='" + raza + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public boolean correr(){
        System.out.println("El perro se emocionó y corrió");
        boolean resultado = Math.random() > 5.1;

        return resultado;
    }
    public boolean rascarse(){
        System.out.println("El perro se esta rascando");
        boolean resultado2 = Math.random() < 7;

        return resultado2;
    }

}
