package com.example.fivelettersscorebord.core.dto;

import com.example.fivelettersscorebord.core.entites.Highscore;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface HighscoreMapper {
    Highscore highscoreDtoToHighscore(HighscoreDto highscoreDto);

    HighscoreDto highscoreToHighscoreDto(Highscore highscore);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Highscore updateHighscoreFromHighscoreDto(
            HighscoreDto highscoreDto,
            @MappingTarget Highscore highscore
    );
}
