/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author PC
 */
public class CuentaAhorro {
    
    private int numeroCuenta;
    private String titularCuenta;
    private int saldoCuenta;
    private Double interesAnual;

    public CuentaAhorro() {
    }

    public CuentaAhorro(int numeroCuenta, String titularCuenta, int saldoCuenta, Double interesAnual) {
        this.numeroCuenta = numeroCuenta;
        this.titularCuenta = titularCuenta;
        this.saldoCuenta = saldoCuenta;
        this.interesAnual = interesAnual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitularCuenta() {
        return titularCuenta;
    }

    public void setTitularCuenta(String titularCuenta) {
        this.titularCuenta = titularCuenta;
    }

    public int getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(int saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public Double getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(Double interesAnual) {
        this.interesAnual = interesAnual;
    }
    
    
    
}
