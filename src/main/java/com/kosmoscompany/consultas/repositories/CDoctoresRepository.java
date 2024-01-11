/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kosmoscompany.consultas.repositories;

import com.kosmoscompany.consultas.entities.CDoctores;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author
 */

@Repository
public interface CDoctoresRepository extends JpaRepository<CDoctores, UUID> {
    
    public Optional<CDoctores> findByDoctoresNombres(String doctoresNombres);
    
    
}
