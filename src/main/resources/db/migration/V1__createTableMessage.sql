CREATE TABLE IF NOT EXISTS "message-broker".message
(
    id       BIGSERIAL PRIMARY KEY,
    username VARCHAR(30) NOT NULL,
    path     TEXT        NOT NULL,
    time     timestamp   NOT NULL
);