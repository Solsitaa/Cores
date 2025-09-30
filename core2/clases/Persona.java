package clases;
//Atributos D:
public class Persona{
    private String nombre;
    private int edad;

//constructores para inicializar lo de arriba
public Persona(String nombre, int edad){
    this.nombre = nombre;
    this.edad = edad;
}
//metodo de instancia, setters y getters
public int agregarAños(int añosAAgregar){
    this.edad += añosAAgregar;
    return this.edad;
}
public String getNombre(){
    return this.nombre;
}

public void despliegaInformacion(){
    System.out.println("Nombre: "+ this.nombre);
    System.out.println("Tu edad es: " + this.edad);
}
}