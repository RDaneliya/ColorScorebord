package com.example.colorscoreboard.core.repository.highscore;

import com.example.colorscoreboard.core.entites.Highscore;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface HighscoreRepository extends JpaRepository<Highscore, UUID> {

    Highscore findHighscoreByNickname(String nickname);

    List<Highscore> findTop10ByOrderByScoreDesc();

    List<Highscore> findTop100ByOrderByScoreDesc();

}
