/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniandes.cupi2.lineasTelefonicas.mundo;

/**
 *
 * @author Nahuel
 */
public class LineaVozIP extends LineaTelefonica{
    
    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------
    
    private int NumeroMinutosLargaDistancia;
    private int NumeroMinutosCelular;
    private double SaldoDisponible;
    
    
    //-----------------------------------------------------------------
    // M�todos   
    //-----------------------------------------------------------------

    public LineaVozIP() {
        NumeroMinutosLargaDistancia = 0;
        NumeroMinutosCelular = 0;
        SaldoDisponible = 100000;
        
    }

    public int darNumeroMinutosLargaDistancia() {
        return NumeroMinutosLargaDistancia;
    }

    public void setNumeroMinutosLargaDistancia(int NumeroMinutosLargaDistancia) {
        this.NumeroMinutosLargaDistancia = NumeroMinutosLargaDistancia;
    }

    public int darNumeroMinutosCelular() {
        return NumeroMinutosCelular;
    }

    public void setNumeroMinutosCelular(int NumeroMinutosCelular) {
        this.NumeroMinutosCelular = NumeroMinutosCelular;
    }

    public double darSaldoDisponible() {
        return SaldoDisponible;
    }

    public void setSaldoDisponible(double SaldoDisponible) {
        this.SaldoDisponible = SaldoDisponible;
    }

    public int getNumeroLlamadas() {
        return numeroLlamadas;
    }

    public void setNumeroLlamadas(int numeroLlamadas) {
        this.numeroLlamadas = numeroLlamadas;
    }

    public int getNumeroMinutos() {
        return numeroMinutos;
    }

    public void setNumeroMinutos(int numeroMinutos) {
        this.numeroMinutos = numeroMinutos;
    }
    
    
    
    

    
    
}
