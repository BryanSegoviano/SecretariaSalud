CREATE DATABASE  IF NOT EXISTS `expedientes` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `expedientes`;
-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: expedientes
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `expedientes`
--

DROP TABLE IF EXISTS `expedientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `expedientes` (
  `id_expediente` int NOT NULL AUTO_INCREMENT,
  `documento` tinyblob,
  `imagenes` tinyblob,
  `informacion_general` varchar(255) NOT NULL,
  PRIMARY KEY (`id_expediente`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `expedientes`
--

LOCK TABLES `expedientes` WRITE;
/*!40000 ALTER TABLE `expedientes` DISABLE KEYS */;
INSERT INTO `expedientes` VALUES (1,_binary 'Gkb',_binary '10:24:26','paciente enfermo'),(2,_binary 'Gkb',_binary '10:24:26','paciente aliviado');
/*!40000 ALTER TABLE `expedientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `habitantes`
--

DROP TABLE IF EXISTS `habitantes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `habitantes` (
  `idhabitante` int NOT NULL AUTO_INCREMENT,
  `dato_biometrico` tinyblob,
  `direccion` varchar(255) NOT NULL,
  `edad` int NOT NULL,
  `id_tutor` int DEFAULT NULL,
  `nombre` varchar(255) NOT NULL,
  `id_expediente` int NOT NULL,
  PRIMARY KEY (`idhabitante`),
  KEY `FKfsui23mab3fruf9i9y0f4spux` (`id_expediente`),
  CONSTRAINT `FKfsui23mab3fruf9i9y0f4spux` FOREIGN KEY (`id_expediente`) REFERENCES `expedientes` (`id_expediente`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `habitantes`
--

LOCK TABLES `habitantes` WRITE;
/*!40000 ALTER TABLE `habitantes` DISABLE KEYS */;
INSERT INTO `habitantes` VALUES (1,NULL,'Villa ITSON',32,1,'Juan Ramirez',1),(2,NULL,'P.O',21,0,'Mario Sanchez',2);
/*!40000 ALTER TABLE `habitantes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `idusuario` int NOT NULL AUTO_INCREMENT,
  `ciudad` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  PRIMARY KEY (`idusuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-10 23:25:23
