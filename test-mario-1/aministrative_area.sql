-- -----------------------------------------------------
-- Schema administrative_area
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `administrative_area` DEFAULT CHARACTER SET utf8 ;
USE `administrative_area` ;

-- -----------------------------------------------------
-- Table `administrative_area`.`province`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `administrative_area`.`province` (
  `id` INT NOT NULL DEFAULT AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `desc` VARCHAR(100) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  INDEX `index_name` (`name` ASC))
ENGINE = InnoDB;