package com.agileware.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectDataRepo extends CrudRepository<SubjectData, String> {

}
