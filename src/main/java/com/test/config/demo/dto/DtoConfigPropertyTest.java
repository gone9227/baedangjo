package com.test.config.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data @NoArgsConstructor @AllArgsConstructor
public class DtoConfigPropertyTest {

    @Value("${hello.name}")
    private String name;
    @Value("${hello.value}")
    private String value;

}
