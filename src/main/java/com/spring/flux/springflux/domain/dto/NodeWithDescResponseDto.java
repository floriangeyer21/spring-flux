package com.spring.flux.springflux.domain.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NodeWithDescResponseDto {
    private Long id;
    private String nodeRoot;
    private String nodeDesc;
}
