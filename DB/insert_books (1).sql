-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Feb 15, 2023 at 05:57 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `citydb`
--

-- --------------------------------------------------------

--
-- Table structure for table `insert_books`
--

CREATE TABLE `insert_books` (
  `Book_name` varchar(50) NOT NULL,
  `Author` varchar(50) NOT NULL,
  `Pages` int(6) NOT NULL,
  `Price` varchar(15) NOT NULL,
  `Type` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `insert_books`
--

INSERT INTO `insert_books` (`Book_name`, `Author`, `Pages`, `Price`, `Type`) VALUES
('Harry potter and the chamber of secrets', 'J K Rolling', 500, 'Rs.1250.00', 'Friction'),
('harry potter and chamber of secrets', '12', 1223, '1000', '123'),
('The Witcher: Blood of Elves', ' Andrzej Sapkowski', 320, 'Rs.2,500.00', 'Friction');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
