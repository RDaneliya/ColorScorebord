CREATE TABLE highscore (
    id       UUID         NOT NULL,
    nickname VARCHAR(255) NOT NULL,
    score    BIGINT       NOT NULL,
    CONSTRAINT pk_highscore PRIMARY KEY (id)
);

ALTER TABLE highscore
    ADD CONSTRAINT uc_highscore_nickname UNIQUE (nickname);

CREATE INDEX idx_highscore_nickname ON highscore(nickname);
