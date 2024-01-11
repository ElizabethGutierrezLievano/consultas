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
@Table(name = "c_especialidades", catalog = "consultas", schema = "consulta_app")
@NamedQueries({
    @NamedQuery(name = "CEspecialidades.findAll", query = "SELECT c FROM CEspecialidades c")})
public class CEspecialidades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_especialidades", insertable = false)
    private Short idEspecialidades;
    @Column(name = "especialidades_nombre")
    private String especialidadesNombre;
    @Column(name = "especialidades_descrip")
    private String especialidadesDescrip;
    @Basic(optional = false)
    @Column(name = "fec_cre", updatable = false, insertable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecCre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEspecialidades")
    private List<CDoctores> cDoctoresList;

    public CEspecialidades() {
    }

    public CEspecialidades(Short idEspecialidades) {
        this.idEspecialidades = idEspecialidades;
    }

    public CEspecialidades(Short idEspecialidades, Date fecCre) {
        this.idEspecialidades = idEspecialidades;
        this.fecCre = fecCre;
    }

    public Short getIdEspecialidades() {
        return idEspecialidades;
    }

    public void setIdEspecialidades(Short idEspecialidades) {
        this.idEspecialidades = idEspecialidades;
    }

    public String getEspecialidadesNombre() {
        return especialidadesNombre;
    }

    public void setEspecialidadesNombre(String especialidadesNombre) {
        this.especialidadesNombre = especialidadesNombre;
    }

    public String getEspecialidadesDescrip() {
        return especialidadesDescrip;
    }

    public void setEspecialidadesDescrip(String especialidadesDescrip) {
        this.especialidadesDescrip = especialidadesDescrip;
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
        hash += (idEspecialidades != null ? idEspecialidades.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CEspecialidades)) {
            return false;
        }
        CEspecialidades other = (CEspecialidades) object;
        if ((this.idEspecialidades == null && other.idEspecialidades != null) || (this.idEspecialidades != null && !this.idEspecialidades.equals(other.idEspecialidades))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kosmoscompany.consultas.entities.CEspecialidades[ idEspecialidades=" + idEspecialidades + " ]";
    }
    
}
