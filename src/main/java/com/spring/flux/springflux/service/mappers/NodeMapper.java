package com.spring.flux.springflux.service.mappers;

import com.spring.flux.springflux.domain.Node;
import com.spring.flux.springflux.domain.dto.NodeRequestDto;
import com.spring.flux.springflux.domain.dto.NodeResponseDto;
import org.springframework.stereotype.Component;

@Component
public class NodeMapper {

    public Node mapFromDto(NodeRequestDto nodeRequestDto) {
        return Node.builder()
                .id(nodeRequestDto.getId())
                .nodeRoot(nodeRequestDto.getNodeRoot())
                .build();
    }

    public NodeResponseDto mapToDto(Node node) {
        return NodeResponseDto.builder()
                .id(node.getId())
                .nodeRoot(node.getNodeRoot())
                .build();
    }
}
