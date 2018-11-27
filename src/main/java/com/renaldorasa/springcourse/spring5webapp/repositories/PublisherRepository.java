package com.renaldorasa.springcourse.spring5webapp.repositories;

import com.renaldorasa.springcourse.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
