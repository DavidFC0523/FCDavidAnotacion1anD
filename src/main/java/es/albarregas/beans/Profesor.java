/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.beans;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author gared
 */
@Entity
@Table(name = "profesoresA1anD")
public class Profesor implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idProfesor")
    private int idProf;
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(orphanRemoval = true, fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinColumn(name = "idProfesor")
    private Set<CorreoElectronico> correos;

    public int getIdProf() {
        return idProf;
    }

    public void setIdProf(int idProf) {
        this.idProf = idProf;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<CorreoElectronico> getCorreos() {
        return correos;
    }

    public void setCorreos(Set<CorreoElectronico> correos) {
        this.correos = correos;
    }

}
