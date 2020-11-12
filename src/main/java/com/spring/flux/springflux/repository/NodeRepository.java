package com.spring.flux.springflux.repository;

import com.spring.flux.springflux.domain.Node;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeRepository extends ReactiveMongoRepository<Node, Long> {
}
