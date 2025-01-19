package com.fpoirier.blog.domain.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateCategoryRequest {

    @NotBlank(message = "Category name is required")
    @Size(min = 2, max = 50, message = "The name of the category must be between 2 and 50 characters")
    @Pattern(regexp = "^[\\w\\s-]+$", message = "Name can only contain letters, numbers, spaces and hyphens")
    private String name;
}
