package com.spring.flux.springflux.controllers;

import com.spring.flux.springflux.constants.NodeConstants;
import com.spring.flux.springflux.domain.Node;
import com.spring.flux.springflux.domain.dto.NodeRequestDto;
import com.spring.flux.springflux.domain.dto.NodeResponseDto;
import com.spring.flux.springflux.service.interfaces.NodeService;
import com.spring.flux.springflux.service.mappers.NodeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(NodeConstants.NODE_URL)
public class NodeController {
    private final NodeService nodeService;
    private final NodeMapper nodeMapper;

    @Autowired
    public NodeController(NodeService nodeService, NodeMapper nodeMapper) {
        this.nodeService = nodeService;
        this.nodeMapper = nodeMapper;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<NodeResponseDto> persist(@RequestBody NodeRequestDto nodeRequestDto) {
        Node node = nodeMapper.mapFromDto(nodeRequestDto);
        return nodeService.persist(node).map(nodeMapper::mapToDto);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Flux<NodeResponseDto> getAll() {
        return nodeService.getAll().map(nodeMapper::mapToDto);
    }
}
