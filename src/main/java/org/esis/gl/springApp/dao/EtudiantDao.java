package org.esis.gl.springApp.dao;

import org.esis.gl.springApp.entity.Etudiant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EtudiantDao extends CrudRepository<Etudiant, Long> {

}
