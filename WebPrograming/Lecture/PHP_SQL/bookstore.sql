-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 23, 2023 at 05:40 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bookstore`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` int(11) NOT NULL,
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `address` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `telephone` varchar(13) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `name`, `address`, `email`, `telephone`) VALUES
(1, 'ZyPherX', 'KMUTNB', 's6406021620050@email.kmutnb.ac.th', '0909250292'),
(2, 'Punnawat Pinsaeng', 'KMUTNB', 'example@email.com', '0123456789'),
(4, '$name', '$address', '$email', '$tel'),
(5, 'Punnawat Pinsaeng', 'KMUTNB', 's6406021620050@email.kmutnb.ac.th', '0909250292'),
(6, 'ปัณณวรรธ ปิ่นแสง', 'KMUTNB', 's6406021620050@email.kmutnb.ac.th', '0909250292'),
(7, 'ปัณณวรรธ ปิ่นแสง', 'KMUTNB', 's6406021620050@email.kmutnb.ac.th', '0909250292'),
(8, 'ปัณณวรรธ ปิ่นแสง', 'KMUTNB', 's6406021620050@email.kmutnb.ac.th', '0909250292'),
(9, 'ปัณณวรรธ ปิ่นแสง', 'KMUTNB', 's6406021620050@email.kmutnb.ac.th', '0909250292'),
(10, 'Punnawat Pinsaeng', 'KMUTNB', 's6406021620050@email.kmutnb.ac.th', '0909250292'),
(11, 'Punnawat Pinsaeng', 'KMUTNB', 's6406021620050@email.kmutnb.ac.th', '0909250292'),
(12, 'ปัณณวรรธ ปิ่นแสง', 'KMUTNB', 's6406021620050@email.kmutnb.ac.th', '0909250292'),
(13, 'Punnawat Pinsaeng', 'KMUTNB', 's6406021620050@email.kmutnb.ac.th', '0909250292');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
