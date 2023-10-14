CREATE TABLE `screenmatch`.`movies` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `duration_in_minutes` VARCHAR(100) NOT NULL,
  `release_year` VARCHAR(6) NOT NULL,
  `genre` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`));
)
