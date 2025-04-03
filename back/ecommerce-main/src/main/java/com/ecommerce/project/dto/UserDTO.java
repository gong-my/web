package com.ecommerce.project.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDTO {

    private int id;
    private String userId;
    private String userPass;
    private String userName;
}
