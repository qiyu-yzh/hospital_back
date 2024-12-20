package org.qiyu.hospital.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String uuid;
    private String userName;
    private String phone;
    private String email;
    private String role;
}
