/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.concesionarios.frontend.utilities.converter;

import co.concesionario.backend.persistence.entities.Vehiculo;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author camila
 */
@FacesConverter(forClass = Vehiculo.class)

public class VehiculoConverter extends AbstractConverter{
    
         public VehiculoConverter() {
        
        this.nameManagedBean="VehiculoManagedBean";
    
    }
    
    
}
