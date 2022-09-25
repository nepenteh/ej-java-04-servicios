/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.time.LocalDate;

/**
 *
 * @author JoseManuel
 */
public class RevisionAlarma extends Servicio {

    protected int numeroAlarmas;

    public RevisionAlarma(LocalDate fechaInicio, String cliente, int numeroAlarmas) {
        super("Revisor Especialista Contraincendios", fechaInicio, cliente);
        this.numeroAlarmas = numeroAlarmas;
    }

    public int getNumeroAlarmas() {
        return numeroAlarmas;
    }

    public void setNumeroAlarmas(int numeroAlarmas) {
        this.numeroAlarmas = numeroAlarmas;
    }
    
    
    
    
    @Override
    public double costeMaterial() {
        return 0;
    }

    @Override
    public double costeManoObra() {
        return (numeroAlarmas/3.0)*40;
    }

    @Override
    public double costeTotal() {
        return costeManoObra();
    }

    @Override
    public String detalleServicio() {
        String cadena = "";
        
        cadena += "REVISIÓN PERIÓDICA ALARMAS CONTRAINCENDIOS\n";
        cadena += "Cliente: "+cliente+"\n";
        cadena += "Fecha: "+fechaInicio+"\n";
        cadena += "----------------------\n";
        cadena += "TOTAL: "+costeTotal()+"\n";
        cadena += "----------------------\n";
        return  cadena;
    }
    
}
