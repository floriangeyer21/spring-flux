package com.spring.flux.springflux.domain.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NodeRequestDto {
    private Long id;
    private String nodeRoot;
}
