package com.flz.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class DoRegisterRequestDto {
    private String username;

    //@NotBlank(message="Boş geçilemez")
    // @Pattern(regex= "") Regexle parola stilini belirleyebiliriz.
    private String password;
    private String rePassword;

    //@Email(message="ssss....")
    private String email;
}
