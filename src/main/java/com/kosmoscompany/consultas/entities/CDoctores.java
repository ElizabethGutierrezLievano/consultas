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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "c_doctores", catalog = "consultas", schema = "consulta_app")
@NamedQueries({
    @NamedQuery(name = "CDoctores.findAll", query = "SELECT c FROM CDoctores c")})
public class CDoctores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_doctores", insertable = false)
    private Short idDoctores;
    @Basic(optional = false)
    @Column(name = "doctores_nombres")
    private String doctoresNombres;
    @Basic(optional = false)
    @Column(name = "doctores_a_paterno")
    private String doctoresAPaterno;
    @Column(name = "doctores_a_materno")
    private String doctoresAMaterno;
    @Basic(optional = false)
    @Column(name = "fec_cre", updatable = false, insertable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecCre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDoctores")
    private List<TxCitas> txCitasList;
    @JoinColumn(name = "id_consultorio", referencedColumnName = "id_consultorios")
    @ManyToOne
    private CConsultorios idConsultorio;
    @JoinColumn(name = "id_especialidades", referencedColumnName = "id_especialidades")
    @ManyToOne(optional = false)
    private CEspecialidades idEspecialidades;

    public CDoctores() {
    }

    public CDoctores(Short idDoctores) {
        this.idDoctores = idDoctores;
    }

    public CDoctores(Short idDoctores, String doctoresNombres, String doctoresAPaterno, Date fecCre) {
        this.idDoctores = idDoctores;
        this.doctoresNombres = doctoresNombres;
        this.doctoresAPaterno = doctoresAPaterno;
        this.fecCre = fecCre;
    }

    public Short getIdDoctores() {
        return idDoctores;
    }

    public void setIdDoctores(Short idDoctores) {
        this.idDoctores = idDoctores;
    }

    public String getDoctoresNombres() {
        return doctoresNombres;
    }

    public void setDoctoresNombres(String doctoresNombres) {
        this.doctoresNombres = doctoresNombres;
    }

    public String getDoctoresAPaterno() {
        return doctoresAPaterno;
    }

    public void setDoctoresAPaterno(String doctoresAPaterno) {
        this.doctoresAPaterno = doctoresAPaterno;
    }

    public String getDoctoresAMaterno() {
        return doctoresAMaterno;
    }

    public void setDoctoresAMaterno(String doctoresAMaterno) {
        this.doctoresAMaterno = doctoresAMaterno;
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

    public CConsultorios getIdConsultorio() {
        return idConsultorio;
    }

    public void setIdConsultorio(CConsultorios idConsultorio) {
        this.idConsultorio = idConsultorio;
    }

    public CEspecialidades getIdEspecialidades() {
        return idEspecialidades;
    }

    public void setIdEspecialidades(CEspecialidades idEspecialidades) {
        this.idEspecialidades = idEspecialidades;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDoctores != null ? idDoctores.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CDoctores)) {
            return false;
        }
        CDoctores other = (CDoctores) object;
        if ((this.idDoctores == null && other.idDoctores != null) || (this.idDoctores != null && !this.idDoctores.equals(other.idDoctores))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kosmoscompany.consultas.entities.CDoctores[ idDoctores=" + idDoctores + " ]";
    }
    
}
