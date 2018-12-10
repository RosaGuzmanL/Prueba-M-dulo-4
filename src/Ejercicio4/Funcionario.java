/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author PC
 */
public class Funcionario {
    
    private String rut;
    private String nombresApellidos;
    private String domicilio;
    private String fechaNacimiento;
    private Double sueldoBruto;

    public Funcionario() {
    }

    public Funcionario(String rut, String nombresApellidos, String domicilio, String fechaNacimiento, Double sueldoBruto) {
        this.rut = rut;
        this.nombresApellidos = nombresApellidos;
        this.domicilio = domicilio;
        this.fechaNacimiento = fechaNacimiento;
        this.sueldoBruto = sueldoBruto;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombresApellidos() {
        return nombresApellidos;
    }

    public void setNombresApellidos(String nombresApellidos) {
        this.nombresApellidos = nombresApellidos;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(Double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
    
    public String mostrarDatos(){
        return this.rut+", "+this.nombresApellidos+", vive en  "
                +this.domicilio+", nació: "+this.fechaNacimiento+" ,su sueldo bruto es "
                +this.sueldoBruto;
    }
    
}
