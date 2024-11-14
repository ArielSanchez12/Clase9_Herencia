public class Vehiculos { //Superclase
    String marca;
    String modelo;
    int anio;
    double kilometraje;

    // Constructor
    public Vehiculos(String marca, String modelo, int anio, double kilometraje) { //Constructor de la superclase
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = kilometraje;

    }

    //Metodos superclase
    public void imprimirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Kilometraje: " + kilometraje);
    }
}




//Subclase Coche
public static class Coche extends Vehiculos { //Se crea la subclase
    String color;
    public Coche(String marca, String modelo, int anio, double kilometraje, String color) { //Se crea algo parecido a un constructor de la superclase
        super(marca, modelo, anio, kilometraje); //Super es para decirle que estas variables son las que van a ir al constructor de la superclase
        this.color = color; //Agregamos el color a la subclase
    }
}

//Subclase Motocicleta
public static class Motocicleta extends Vehiculos {

    public Motocicleta(String marca, String modelo, int anio, double kilometraje) {
        super(marca, modelo, anio, kilometraje);

    }

}

//Subclase Camion
public static class Camion extends Vehiculos {

    public Camion(String marca, String modelo, int anio, double kilometraje) {
        super(marca, modelo, anio, kilometraje);

    }

}

public static void main(String[] args) { //Aca imprimimos la info
    Coche coche1 = new Coche("honda", "si se", 2000, 223.2, "blanco"); //Usamos el nombre de la superclase objeto1 = new ConstructorSUPERCLASE(con sus parametros)
    Motocicleta motocicleta1 = new Motocicleta("honda", "si se", 2000, 223.2); //Usamos el nombre de la superclase objeto1 = new ConstructorSUPERCLASE(con sus parametros)
    Camion camion1 = new Camion("mazda", "talvez", 2009, 2.2); //Usamos el nombre de la superclase objeto1 = new ConstructorSUPERCLASE(con sus parametros)

    coche1.imprimirInfo(); //SALE ERROR

}

