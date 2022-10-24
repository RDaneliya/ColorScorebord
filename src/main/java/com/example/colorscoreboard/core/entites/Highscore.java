package com.example.colorscoreboard.core.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "highscore", indexes = {
        @Index(name = "idx_highscore_nickname", columnList = "nickname")
})
public class Highscore {

    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "nickname", nullable = false, unique = true, updatable = false)
    private String nickname;

    @Column(name = "score", nullable = false)
    private Long score;

}
