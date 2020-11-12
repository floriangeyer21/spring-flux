package com.spring.flux.springflux.service.mappers;

import com.spring.flux.springflux.domain.Node;
import com.spring.flux.springflux.domain.NodeWithDesc;
import com.spring.flux.springflux.domain.dto.NodeRequestDto;
import com.spring.flux.springflux.domain.dto.NodeResponseDto;
import com.spring.flux.springflux.domain.dto.NodeWithDescRequestDto;
import com.spring.flux.springflux.domain.dto.NodeWithDescResponseDto;
import org.springframework.stereotype.Component;

@Component
public class NodeWithDescMapper {

    public NodeWithDesc mapFromDto(NodeWithDescRequestDto nodeWithDescRequestDto) {
        return NodeWithDesc.builder()
                .id(nodeWithDescRequestDto.getId())
                .nodeRoot(nodeWithDescRequestDto.getNodeRoot())
                .nodeDesc(nodeWithDescRequestDto.getNodeDesc())
                .build();
    }

    public NodeWithDescResponseDto mapToDto(NodeWithDesc nodeWithDesc) {
        return NodeWithDescResponseDto.builder()
                .id(nodeWithDesc.getId())
                .nodeRoot(nodeWithDesc.getNodeRoot())
                .nodeDesc(nodeWithDesc.getNodeDesc())
                .build();
    }
}
