package br.com.doctorwho.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class MedicalSpecialtyDto  {
    @NotBlank
    @Size(min = 5, max = 50)
    private String title;

    @NotBlank
    @Size(min = 10, max = 100)
    private String description;
}
