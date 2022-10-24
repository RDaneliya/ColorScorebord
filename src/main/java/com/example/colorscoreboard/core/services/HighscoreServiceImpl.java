package com.example.colorscoreboard.core.services;

import com.example.colorscoreboard.core.dto.HighscoreDto;
import com.example.colorscoreboard.core.mapper.HighscoreMapper;
import com.example.colorscoreboard.core.repository.highscore.HighscoreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class HighscoreServiceImpl implements HighscoreService {
    private final HighscoreMapper mapper;
    private final HighscoreRepository repository;

    @Override
    public HighscoreDto getHighscoreByUser(String user) {
        return mapper.highscoreToHighscoreDto(repository.findHighscoreByNickname(user));
    }

    @Override
    public List<HighscoreDto> getTopTenHighscores() {
        return repository.findTop10ByOrderByScoreDesc()
                         .stream()
                         .map(mapper::highscoreToHighscoreDto)
                         .collect(Collectors.toList());
    }

    @Override
    public List<HighscoreDto> getTopHundredHighscores() {
        return repository.findTop100ByOrderByScoreDesc()
                         .stream()
                         .map(mapper::highscoreToHighscoreDto)
                         .collect(Collectors.toList());
    }

    @Override
    public void saveHighScore(HighscoreDto dto) {
        repository.save(mapper.highscoreDtoToHighscore(dto));
    }
}
