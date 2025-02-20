package org.example.civic_action.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SuggestionDto {
    private String userName;
    private String email;
    private String priorityArea;
    private String improvement;
}
