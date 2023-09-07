package com.atguigu.pojo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class User {

    // 不为空和空字符串
    @NotBlank
    private String name;
    // 长度大于6
    @Length(min = 6)
    private String password;
    @Min(1)
    private Integer age;
    @Email
    private String email;
}
