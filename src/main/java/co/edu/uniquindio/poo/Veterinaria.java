package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.Enum.Especie;
import co.edu.uniquindio.poo.Enum.Genero;

public class Veterinaria {
    
    //Atributos de la clase:
    private String nombre;
    private Especie especie;
    private String raza;
    private byte edad;
    private Genero genero;
    private String color;
    private Float peso;

    // ------------------------------------------------------------------------------------------------
    // Contructor de la clase que contiene todos los atributos de la clase

    public Veterinaria(String nombre, Especie especie, String raza, byte edad, Genero genero, String color, Float peso) {

        assert nombre != null && !nombre.isBlank():"El nombre es obligatorio";
        assert especie != null :"La especie es obligatorio";
        assert raza != null && !raza.isBlank(): "La raza es obligatorio";
        assert edad >= 0: "La edad debe de ser positiva";
        assert genero != null : "El genero es obligatorio";
        assert color != null && !color.isBlank(): "El color es obligatorio";
        assert peso >=0: "El peso debe de ser positivo";


        //Materializar el objeto
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.genero = genero;
        this.color = color;
        this. peso = peso;

}

public Veterinaria(String nombre, String raza, byte edad, String color, Float peso) {

    assert nombre != null && !nombre.isBlank():"El nombre es obligatorio";
    assert raza != null && !raza.isBlank(): "La raza es obligatorio";
    assert edad >= 0: "La edad debe de ser positiva";
    assert color != null && !color.isBlank(): "El color es obligatorio";
    assert peso >=0: "El peso debe de ser positivo";


    //Materializar el objeto
    this.nombre = nombre;
    this.raza = raza;
    this.edad = edad;
    this.color = color;
    this. peso = peso;

}


    //Constructor vacio
    public Veterinaria(){

    }


    //--------------------------------------------------------------------------------------------------------------------------------
    //Metodos de acceso
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Especie getEspecie() {
        return especie;
    }


    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public String getRaza(){
        return raza;
    }

    public void setRaza(String raza){
        this.raza = raza;
    }

    public byte getEdad(){
        return edad;
    }

    public void setEdad(byte edad){
        this.edad = edad;
    }

   
    public Genero getGenero() {
        return genero;
    }


    public void setGenero(Genero genero) {
        this.genero = genero;
    }


    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public Float getPeso(){
        return peso;
    }

    public void setPeso(Float peso){
        this.peso = peso;
    }

    //--------------------------------------------------------------------------
    @Override
    public String toString(){
        return "La mascota se llama: " + nombre + "\n Su especie es: " + especie + "\n  Su raza es: " + raza + "\n Su edad es: " + edad +  
        " \n Su genero es: " + genero + "\n Su color es: " + color + "\n Su peso es: " + peso;
    }
}