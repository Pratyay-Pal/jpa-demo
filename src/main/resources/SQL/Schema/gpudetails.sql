CREATE TABLE `gpudetails` (
  `gpudetesid` int NOT NULL,
  `gpuname` varchar(100) NOT NULL,
  `vram` int DEFAULT NULL,
  `cores` int DEFAULT NULL,
  `clockspeed` int DEFAULT NULL,
  `memorytype` varchar(100) DEFAULT NULL,
  `architecture` varchar(100) DEFAULT NULL,
  `price` int DEFAULT NULL,
  `3dmarkscore` int DEFAULT NULL,
  PRIMARY KEY (`gpuname`)
)