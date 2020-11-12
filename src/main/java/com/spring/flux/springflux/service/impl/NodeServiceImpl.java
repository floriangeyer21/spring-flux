package com.spring.flux.springflux.service.impl;

import com.spring.flux.springflux.domain.Node;
import com.spring.flux.springflux.repository.NodeRepository;
import com.spring.flux.springflux.service.interfaces.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class NodeServiceImpl implements NodeService {
    private final NodeRepository nodeRepository;

    @Autowired
    public NodeServiceImpl(NodeRepository nodeRepository) {
        this.nodeRepository = nodeRepository;
    }

    @Override
    public Mono<Node> persist(Node node) {
        return nodeRepository.save(node);
    }

    @Override
    public Flux<Node> getAll() {
        return nodeRepository.findAll();
    }
}
