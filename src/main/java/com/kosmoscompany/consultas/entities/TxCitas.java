/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kosmoscompany.consultas.entities;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author 
 */
@Entity
@Table(name = "tx_citas", catalog = "consultas", schema = "consulta_app")
@NamedQueries({
    @NamedQuery(name = "TxCitas.findAll", query = "SELECT t FROM TxCitas t")})
public class TxCitas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_citas", insertable = false)
    private Long idCitas;
    @Basic(optional = false)
    @Column(name = "citas_horario")
    @Temporal(TemporalType.DATE)
    private Date citasHorario;
    @Basic(optional = false)
    @Column(name = "fec_cre", updatable = false, insertable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecCre;
    @JoinColumn(name = "id_doctores", referencedColumnName = "id_doctores")
    @ManyToOne(optional = false)
    private CDoctores idDoctores;
    @JoinColumn(name = "id_pacientes", referencedColumnName = "id_pacientes")
    @ManyToOne(optional = false)
    private CPacientes idPacientes;

    public TxCitas() {
    }

    public TxCitas(Long idCitas) {
        this.idCitas = idCitas;
    }

    public TxCitas(Long idCitas, Date citasHorario, Date fecCre) {
        this.idCitas = idCitas;
        this.citasHorario = citasHorario;
        this.fecCre = fecCre;
    }

    public Long getIdCitas() {
        return idCitas;
    }

    public void setIdCitas(Long idCitas) {
        this.idCitas = idCitas;
    }

    public Date getCitasHorario() {
        return citasHorario;
    }

    public void setCitasHorario(Date citasHorario) {
        this.citasHorario = citasHorario;
    }

    public Date getFecCre() {
        return fecCre;
    }

    public void setFecCre(Date fecCre) {
        this.fecCre = fecCre;
    }

    public CDoctores getIdDoctores() {
        return idDoctores;
    }

    public void setIdDoctores(CDoctores idDoctores) {
        this.idDoctores = idDoctores;
    }

    public CPacientes getIdPacientes() {
        return idPacientes;
    }

    public void setIdPacientes(CPacientes idPacientes) {
        this.idPacientes = idPacientes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCitas != null ? idCitas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TxCitas)) {
            return false;
        }
        TxCitas other = (TxCitas) object;
        if ((this.idCitas == null && other.idCitas != null) || (this.idCitas != null && !this.idCitas.equals(other.idCitas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kosmoscompany.consultas.entities.TxCitas[ idCitas=" + idCitas + " ]";
    }
    
}
