
package com.mycompany.iudapplication.domain;

import java.sql.Date;


public class Empleados {
    
    private int id;
    private String tipoIdentificacion;
    private String numeroIdentificacion;
    private String nombre;
    private String apellidos;
    private String estadoCivil;
    private String sexo;
    private String direccion;
    private String telefono;
    private String fechaNacimiento;
    private int nivelEstudioId;
    private int universidadId;
    private int tituloEstudioId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getNivelEstudioId() {
        return nivelEstudioId;
    }

    public void setNivelEstudioId(int nivelEstudioId) {
        this.nivelEstudioId = nivelEstudioId;
    }

    public int getUniversidadId() {
        return universidadId;
    }

    public void setUniversidadId(int universidadId) {
        this.universidadId = universidadId;
    }

    public int getTituloEstudioId() {
        return tituloEstudioId;
    }

    public void setTituloEstudioId(int tituloEstudioId) {
        this.tituloEstudioId = tituloEstudioId;
    }
    
    public String toString(){
        return nombre + " " + apellidos;
    }
    
    
}
