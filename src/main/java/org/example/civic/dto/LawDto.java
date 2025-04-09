package org.example.civic.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LawDto {
    private String userName;
    private String userGender;
    private String lawDescription;
    private String lawCategory;
}