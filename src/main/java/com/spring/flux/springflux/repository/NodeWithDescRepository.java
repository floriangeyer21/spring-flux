package com.spring.flux.springflux.repository;

import com.spring.flux.springflux.domain.NodeWithDesc;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeWithDescRepository
        extends ReactiveMongoRepository<NodeWithDesc, Long> {
}
