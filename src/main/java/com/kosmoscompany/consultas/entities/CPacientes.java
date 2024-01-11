/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kosmoscompany.consultas.entities;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author 
 */
@Entity
@Table(name = "c_pacientes", catalog = "consultas", schema = "consulta_app")
@NamedQueries({
    @NamedQuery(name = "CPacientes.findAll", query = "SELECT c FROM CPacientes c")})
public class CPacientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pacientes", insertable = false)
    private Long idPacientes;
    @Basic(optional = false)
    @Column(name = "pacientes_nombres")
    private String pacientesNombres;
    @Basic(optional = false)
    @Column(name = "pacientes_a_paterno")
    private String pacientesAPaterno;
    @Column(name = "pacientes_a_materno")
    private String pacientesAMaterno;
    @Basic(optional = false)
    @Column(name = "fec_cre", updatable = false, insertable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecCre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPacientes")
    private List<TxCitas> txCitasList;

    public CPacientes() {
    }

    public CPacientes(Long idPacientes) {
        this.idPacientes = idPacientes;
    }

    public CPacientes(Long idPacientes, String pacientesNombres, String pacientesAPaterno, Date fecCre) {
        this.idPacientes = idPacientes;
        this.pacientesNombres = pacientesNombres;
        this.pacientesAPaterno = pacientesAPaterno;
        this.fecCre = fecCre;
    }

    public Long getIdPacientes() {
        return idPacientes;
    }

    public void setIdPacientes(Long idPacientes) {
        this.idPacientes = idPacientes;
    }

    public String getPacientesNombres() {
        return pacientesNombres;
    }

    public void setPacientesNombres(String pacientesNombres) {
        this.pacientesNombres = pacientesNombres;
    }

    public String getPacientesAPaterno() {
        return pacientesAPaterno;
    }

    public void setPacientesAPaterno(String pacientesAPaterno) {
        this.pacientesAPaterno = pacientesAPaterno;
    }

    public String getPacientesAMaterno() {
        return pacientesAMaterno;
    }

    public void setPacientesAMaterno(String pacientesAMaterno) {
        this.pacientesAMaterno = pacientesAMaterno;
    }

    public Date getFecCre() {
        return fecCre;
    }

    public void setFecCre(Date fecCre) {
        this.fecCre = fecCre;
    }

    public List<TxCitas> getTxCitasList() {
        return txCitasList;
    }

    public void setTxCitasList(List<TxCitas> txCitasList) {
        this.txCitasList = txCitasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPacientes != null ? idPacientes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CPacientes)) {
            return false;
        }
        CPacientes other = (CPacientes) object;
        if ((this.idPacientes == null && other.idPacientes != null) || (this.idPacientes != null && !this.idPacientes.equals(other.idPacientes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kosmoscompany.consultas.entities.CPacientes[ idPacientes=" + idPacientes + " ]";
    }
    
}
