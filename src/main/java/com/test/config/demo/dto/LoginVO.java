package com.test.config.demo.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class LoginVO {

    private String userId;
    private String password;

}
