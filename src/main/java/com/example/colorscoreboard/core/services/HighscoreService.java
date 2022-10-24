package com.example.colorscoreboard.core.services;

import com.example.colorscoreboard.core.dto.HighscoreDto;

import java.util.List;

public interface HighscoreService {

    HighscoreDto getHighscoreByUser(String user);

    List<HighscoreDto> getTopTenHighscores();

    List<HighscoreDto> getTopHundredHighscores();

    void saveHighScore(HighscoreDto dto);

}
