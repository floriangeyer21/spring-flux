package com.spring.flux.springflux.service.impl;

import com.spring.flux.springflux.domain.NodeWithDesc;
import com.spring.flux.springflux.repository.NodeWithDescRepository;
import com.spring.flux.springflux.service.interfaces.NodeWithDescService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class NodeWithDescServiceImpl implements NodeWithDescService {
    private final NodeWithDescRepository nodeWithDescRepository;

    @Autowired
    public NodeWithDescServiceImpl(NodeWithDescRepository nodeWithDescRepository) {
        this.nodeWithDescRepository = nodeWithDescRepository;
    }

    @Override
    public Mono<NodeWithDesc> persist(NodeWithDesc nodeWithDesc) {
        return nodeWithDescRepository.save(nodeWithDesc);
    }

    @Override
    public Flux<NodeWithDesc> getAll() {
        return nodeWithDescRepository.findAll();
    }
}
