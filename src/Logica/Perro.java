package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Perro implements Serializable {
    
    @Id
    private String num_cliente;
    
    @Basic
    private String nombre_perro;
    private String raza;
    private String color;
    private boolean alergico;
    private boolean atencion_especial;
    private String nombre_duenio;
    private String cel_duenio;
    private String observaciones;

    public Perro() {
    }

    public Perro(String num_cliente, String nombre_perro, String raza, String color, boolean alergico, boolean atencion_especial, String nombre_duenio, String cel_duenio, String observaciones) {
        this.num_cliente = num_cliente;
        this.nombre_perro = nombre_perro;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencion_especial = atencion_especial;
        this.nombre_duenio = nombre_duenio;
        this.cel_duenio = cel_duenio;
        this.observaciones = observaciones;
    }

    public String getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(String num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombre_perro() {
        return nombre_perro;
    }

    public void setNombre_perro(String nombre_perro) {
        this.nombre_perro = nombre_perro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAlergico() {
        return alergico;
    }

    public void setAlergico(boolean alergico) {
        this.alergico = alergico;
    }

    public boolean isAtencion_especial() {
        return atencion_especial;
    }

    public void setAtencion_especial(boolean atencion_especial) {
        this.atencion_especial = atencion_especial;
    }

    public String getNombre_duenio() {
        return nombre_duenio;
    }

    public void setNombre_duenio(String nombre_duenio) {
        this.nombre_duenio = nombre_duenio;
    }

    public String getCel_duenio() {
        return cel_duenio;
    }

    public void setCel_duenio(String cel_duenio) {
        this.cel_duenio = cel_duenio;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
}
