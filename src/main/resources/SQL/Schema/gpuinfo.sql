CREATE TABLE `gpuinfo` (
  `gpuid` int NOT NULL AUTO_INCREMENT,
  `gpuname` varchar(255) DEFAULT NULL,
  `company` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`gpuid`),
  KEY `gpuinfo_FK` (`gpuname`),
  CONSTRAINT `gpuinfo_FK` FOREIGN KEY (`gpuname`) REFERENCES `gpudetails` (`gpuname`)
)