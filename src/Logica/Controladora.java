package Logica;

import Persistencia.ControladoraPersistencia;

public class Controladora {
    
    
    public void agregarPerro( String nroCliente, String nombre, String raza, String color, boolean alergico, boolean atencionEspecial, String nombreDuenio, String celularDuenio, String areaObservaciones){
        Perro perro = new Perro();
        ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        
        //asigno los valores pasados por parametro desde la IGU
        perro.setNum_cliente(nroCliente);
        perro.setNombre_perro(nombre);
        perro.setRaza(raza);
        perro.setColor(color);
        perro.setAlergico(alergico);
        perro.setAtencion_especial(atencionEspecial);
        perro.setNombre_duenio(nombreDuenio);
        perro.setCel_duenio(celularDuenio);
        perro.setObservaciones(areaObservaciones);
        
        //llamo al metodo creado en la clase ControladoraPersistencia para guardar los datos en la base de datos
        controlPersis.crearPerro(perro);
    }

    //utilizado para consultar si el idPerro ya esta en la base de datos
    public boolean verSiEsta(String idPerro){
        ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        return controlPersis.buscarPerro(idPerro);
    }


}

