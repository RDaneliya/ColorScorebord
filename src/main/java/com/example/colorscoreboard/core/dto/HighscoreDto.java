package com.example.colorscoreboard.core.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HighscoreDto implements Serializable {

    private String nickname;

    private Long score;

}
