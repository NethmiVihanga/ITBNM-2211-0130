-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 16, 2024 at 11:16 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cafe_management_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `employee_details`
--

CREATE TABLE `employee_details` (
  `Employee_ID` varchar(20) NOT NULL,
  `Employee_Name` varchar(100) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Address` varchar(200) NOT NULL,
  `Mobile_Number` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employee_details`
--

INSERT INTO `employee_details` (`Employee_ID`, `Employee_Name`, `Email`, `Address`, `Mobile_Number`) VALUES
('01', 'kahavala', '0773174043', 'kahavala1234@gmail.com', 'horana,panaura');

-- --------------------------------------------------------

--
-- Table structure for table `newproduct`
--

CREATE TABLE `newproduct` (
  `Category` varchar(100) NOT NULL,
  `Quantity` varchar(100) NOT NULL,
  `Price` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `newproduct`
--

INSERT INTO `newproduct` (`Category`, `Quantity`, `Price`) VALUES
('Iced Coffe', '5', '450'),
('Espresso', '1', '2000'),
('Espresso', '1', '200'),
('Cup Cake', '10', '12500'),
('Iced Coffe', '3', '200'),
('Breakfast Sandwich', '2', '200');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `username` varchar(100) NOT NULL,
  `Password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`username`, `Password`) VALUES
('nethmi', '1995');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
