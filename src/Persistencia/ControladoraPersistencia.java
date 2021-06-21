package Persistencia;

import Logica.Perro;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    PerroJpaController perroJpa = new PerroJpaController();
    
    
    public void crearPerro(Perro perro){
        try {
            perroJpa.create(perro);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    //para saber si el id ya se encuentra en la bd
    public boolean buscarPerro(String idPerro){
        Perro perro = new Perro();
        perro = perroJpa.findPerro(idPerro);
        
        return perro != null;
    }
}
