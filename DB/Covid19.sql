-- MySQL Script generated by MySQL Workbench
-- lun 18 may 2020 22:54:48
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema EstadisticasCOVID
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `EstadisticasCOVID` ;

-- -----------------------------------------------------
-- Schema EstadisticasCOVID
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `EstadisticasCOVID` ;
USE `EstadisticasCOVID` ;

-- -----------------------------------------------------
-- Table `EstadisticasCOVID`.`Usuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `EstadisticasCOVID`.`Usuario` ;

CREATE TABLE IF NOT EXISTS `EstadisticasCOVID`.`Usuario` (
  `usuario` VARCHAR(45) NOT NULL,
  `correo` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `administrador` TINYINT NOT NULL,
  PRIMARY KEY (`usuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `EstadisticasCOVID`.`Mapa`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `EstadisticasCOVID`.`Mapa` ;

CREATE TABLE IF NOT EXISTS `EstadisticasCOVID`.`Mapa` (
  `idMapa` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`idMapa`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `EstadisticasCOVID`.`Subdivision`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `EstadisticasCOVID`.`Subdivision` ;

CREATE TABLE IF NOT EXISTS `EstadisticasCOVID`.`Subdivision` (
  `idSubdivision` VARCHAR(60) NOT NULL,
  `idMapa` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`idSubdivision`, `idMapa`),
  INDEX `idMapa_idx` (`idMapa` ASC) VISIBLE,
  CONSTRAINT `idMapa`
    FOREIGN KEY (`idMapa`)
    REFERENCES `EstadisticasCOVID`.`Mapa` (`idMapa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `EstadisticasCOVID`.`Registro`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `EstadisticasCOVID`.`Registro` ;

CREATE TABLE IF NOT EXISTS `EstadisticasCOVID`.`Registro` (
  `fecha` DATE NOT NULL,
  `idSubdivision` VARCHAR(60) NOT NULL,
  `recuperados` INT NOT NULL,
  `fallecidos` INT NOT NULL,
  `casa` INT NOT NULL,
  `hospital` INT NOT NULL,
  `uci` INT NOT NULL,
  `femeninos` INT NOT NULL,
  `masculinos` INT NOT NULL,
  `visitas` INT NOT NULL,
  PRIMARY KEY (`fecha`, `idSubdivision`),
  INDEX `idSubdivision_idx` (`idSubdivision` ASC) VISIBLE,
  CONSTRAINT `idSubdivision`
    FOREIGN KEY (`idSubdivision`)
    REFERENCES `EstadisticasCOVID`.`Subdivision` (`idSubdivision`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `EstadisticasCOVID`.`fallecidosEdad`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `EstadisticasCOVID`.`fallecidosEdad` ;

CREATE TABLE IF NOT EXISTS `EstadisticasCOVID`.`fallecidosEdad` (
  `fecha` DATE NOT NULL,
  `idSubdivision` VARCHAR(60) NOT NULL,
  `cero` INT NOT NULL,
  `diez` INT NOT NULL,
  `veinte` INT NOT NULL,
  `treinta` INT NOT NULL,
  `cuarenta` INT NOT NULL,
  `cincuenta` INT NOT NULL,
  `sesenta` INT NOT NULL,
  `setenta` INT NOT NULL,
  `ochenta` INT NOT NULL,
  `noventa` INT NOT NULL,
  PRIMARY KEY (`fecha`, `idSubdivision`),
  INDEX `idSubdivision_idx` (`idSubdivision` ASC) VISIBLE,
  CONSTRAINT `fecha1`
    FOREIGN KEY (`fecha`)
    REFERENCES `EstadisticasCOVID`.`Registro` (`fecha`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `idSubdivision1`
    FOREIGN KEY (`idSubdivision`)
    REFERENCES `EstadisticasCOVID`.`Subdivision` (`idSubdivision`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `EstadisticasCOVID`.`recuperadosEdad`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `EstadisticasCOVID`.`recuperadosEdad` ;

CREATE TABLE IF NOT EXISTS `EstadisticasCOVID`.`recuperadosEdad` (
  `fecha` DATE NOT NULL,
  `idSubdivision` VARCHAR(60) NOT NULL,
  `cero` INT NOT NULL,
  `diez` INT NOT NULL,
  `veinte` INT NOT NULL,
  `treinta` INT NOT NULL,
  `cuarenta` INT NOT NULL,
  `cincuenta` INT NOT NULL,
  `sesenta` INT NOT NULL,
  `setenta` INT NOT NULL,
  `ochenta` INT NOT NULL,
  `noventa` INT NOT NULL,
  PRIMARY KEY (`fecha`, `idSubdivision`),
  INDEX `idSubdivision_idx` (`idSubdivision` ASC) VISIBLE,
  CONSTRAINT `fecha2`
    FOREIGN KEY (`fecha`)
    REFERENCES `EstadisticasCOVID`.`Registro` (`fecha`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `idSubdivision2`
    FOREIGN KEY (`idSubdivision`)
    REFERENCES `EstadisticasCOVID`.`Subdivision` (`idSubdivision`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `EstadisticasCOVID`.`confirmadosEdad`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `EstadisticasCOVID`.`confirmadosEdad` ;

CREATE TABLE IF NOT EXISTS `EstadisticasCOVID`.`confirmadosEdad` (
  `fecha` DATE NOT NULL,
  `idSubdivision` VARCHAR(60) NOT NULL,
  `cero` INT NOT NULL,
  `diez` INT NOT NULL,
  `veinte` INT NOT NULL,
  `treinta` INT NOT NULL,
  `cuarenta` INT NOT NULL,
  `cincuenta` INT NOT NULL,
  `sesenta` INT NOT NULL,
  `setenta` INT NOT NULL,
  `ochenta` INT NOT NULL,
  `noventa` INT NOT NULL,
  PRIMARY KEY (`fecha`, `idSubdivision`),
  INDEX `idSubdivision_idx` (`idSubdivision` ASC) VISIBLE,
  CONSTRAINT `fecha3`
    FOREIGN KEY (`fecha`)
    REFERENCES `EstadisticasCOVID`.`Registro` (`fecha`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `idSubdivision3`
    FOREIGN KEY (`idSubdivision`)
    REFERENCES `EstadisticasCOVID`.`Subdivision` (`idSubdivision`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
