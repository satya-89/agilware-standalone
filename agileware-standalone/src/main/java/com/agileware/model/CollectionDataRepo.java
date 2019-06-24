package com.agileware.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollectionDataRepo extends CrudRepository<CollectionData, String> {

}
