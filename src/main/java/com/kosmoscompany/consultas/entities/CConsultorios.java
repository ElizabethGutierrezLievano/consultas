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
@Table(name = "c_consultorios", catalog = "consultas", schema = "consulta_app")
@NamedQueries({
    @NamedQuery(name = "CConsultorios.findAll", query = "SELECT c FROM CConsultorios c")})
public class CConsultorios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_consultorios", insertable = false)
    private Short idConsultorios;
    @Basic(optional = false)
    @Column(name = "consultorios_numero")
    private String consultoriosNumero;
    @Basic(optional = false)
    @Column(name = "onsultorios_piso")
    private String onsultoriosPiso;
    @Basic(optional = false)
    @Column(name = "fec_cre", updatable = false, insertable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecCre;
    @OneToMany(mappedBy = "idConsultorio")
    private List<CDoctores> cDoctoresList;

    public CConsultorios() {
    }

    public CConsultorios(Short idConsultorios) {
        this.idConsultorios = idConsultorios;
    }

    public CConsultorios(Short idConsultorios, String consultoriosNumero, String onsultoriosPiso, Date fecCre) {
        this.idConsultorios = idConsultorios;
        this.consultoriosNumero = consultoriosNumero;
        this.onsultoriosPiso = onsultoriosPiso;
        this.fecCre = fecCre;
    }

    public Short getIdConsultorios() {
        return idConsultorios;
    }

    public void setIdConsultorios(Short idConsultorios) {
        this.idConsultorios = idConsultorios;
    }

    public String getConsultoriosNumero() {
        return consultoriosNumero;
    }

    public void setConsultoriosNumero(String consultoriosNumero) {
        this.consultoriosNumero = consultoriosNumero;
    }

    public String getOnsultoriosPiso() {
        return onsultoriosPiso;
    }

    public void setOnsultoriosPiso(String onsultoriosPiso) {
        this.onsultoriosPiso = onsultoriosPiso;
    }

    public Date getFecCre() {
        return fecCre;
    }

    public void setFecCre(Date fecCre) {
        this.fecCre = fecCre;
    }

    public List<CDoctores> getCDoctoresList() {
        return cDoctoresList;
    }

    public void setCDoctoresList(List<CDoctores> cDoctoresList) {
        this.cDoctoresList = cDoctoresList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idConsultorios != null ? idConsultorios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CConsultorios)) {
            return false;
        }
        CConsultorios other = (CConsultorios) object;
        if ((this.idConsultorios == null && other.idConsultorios != null) || (this.idConsultorios != null && !this.idConsultorios.equals(other.idConsultorios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kosmoscompany.consultas.entities.CConsultorios[ idConsultorios=" + idConsultorios + " ]";
    }
    
}
