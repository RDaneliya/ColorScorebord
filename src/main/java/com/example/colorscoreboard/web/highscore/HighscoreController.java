package com.example.colorscoreboard.web.highscore;

import com.example.colorscoreboard.core.dto.HighscoreDto;
import com.example.colorscoreboard.core.services.HighscoreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/highscore")
@AllArgsConstructor
public class HighscoreController {
    private final HighscoreService highscoreService;

    @PostMapping
    public void addRecord(@RequestBody HighscoreDto highScoreRequest) {
        highscoreService.saveHighScore(highScoreRequest);
    }

    @GetMapping
    @ResponseBody
    public HighscoreDto getUserScore(@RequestParam String nickname) {
        return highscoreService.getHighscoreByUser(nickname);
    }

    @GetMapping("/top-ten")
    @ResponseBody
    public List<HighscoreDto> getTopTen() {
        return highscoreService.getTopTenHighscores();
    }

    @GetMapping("/top-hundred")
    public List<HighscoreDto> getTopHundred() {
        return highscoreService.getTopHundredHighscores();
    }
}
