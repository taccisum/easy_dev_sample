DROP TABLE IF EXISTS foo;

CREATE TABLE foo (
  id              BIGINT PRIMARY KEY NOT NULL,
  field1          VARCHAR(50)        NOT NULL,
  created_by      BIGINT             NOT NULL,
  created_on      DATETIME           NOT NULL,
  updated_by      BIGINT,
  updated_on      DATETIME,
  deleted_flag    TINYINT            NOT NULL,
  organization_id BIGINT             NOT NULL
)
  ENGINE = InnoDB;

