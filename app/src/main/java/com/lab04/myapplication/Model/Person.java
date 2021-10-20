package com.lab04.myapplication.Model;

import java.util.*;

class Person {
    String nombres;
    String apePat;
    String apeMat;
    Date fecNac;
    char sexo;
    String dni;
    String direccion;

    public Person(String nombres,String apePat, String apeMat,String dni, String direccion){
        this.nombres = nombres;
        this.apePat = apePat;
        this.apeMat = apeMat;
        this.dni = dni;
        this.direccion = direccion;
    }
    public Person(){
        this.nombres = null;
        this.apePat = null;
        this.apeMat = null;
        this.dni = null;
        this.direccion = null;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApePat(String apePat) {
        this.apePat = apePat;
    }

    public void setApeMat(String apeMat) {
        this.apeMat = apeMat;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApePat() {
        return apePat;
    }

    public String getApeMat() {
        return apeMat;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }
}
