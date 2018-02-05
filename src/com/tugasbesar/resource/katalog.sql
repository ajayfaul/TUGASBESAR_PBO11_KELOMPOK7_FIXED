-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 04 Feb 2018 pada 04.46
-- Versi Server: 10.1.29-MariaDB
-- PHP Version: 7.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `katalog`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `daftarproduk`
--

CREATE TABLE `daftarproduk` (
  `ID_PRODUK` int(11) NOT NULL,
  `KATEGORI_PRODUK` varchar(200) NOT NULL,
  `MERK_PRODUK` varchar(150) NOT NULL,
  `NAMA_PRODUK` varchar(255) NOT NULL,
  `SPESIFIKASI` text,
  `HARGA` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `daftarproduk`
--

INSERT INTO `daftarproduk` (`ID_PRODUK`, `KATEGORI_PRODUK`, `MERK_PRODUK`, `NAMA_PRODUK`, `SPESIFIKASI`, `HARGA`) VALUES
(1, 'Processor', 'Intel', 'Intel Core i9-7980XE', 'Cores: 18\nThreads: 36\nBase clock: 2.6GHz\nBoost clock: 4.4GHz\nL3 cache: 24.75MB\nTDP: 165W', '± Rp. 28,999,000'),
(2, 'Processor', 'Intel', 'Intel Core i7-7740X', 'Cores: 4\nThreads: 8\nBase clock: 4.3GHz\nBoost clock: 4.5GHz\nL3 cache: 8MB\nTDP: 112W\nSocket: LGA 2066', '± Rp. 4,999,000'),
(3, 'Processor', 'Intel', 'Intel Core i5-7640X', 'Cores: 4\nThreads: 4\nBase clock: 4.0GHz\nBoost clock: 4.2GHz\nL3 cache: 6MB\nTDP: 112W\nSocket: LGA 2066', '± Rp. 3,599,000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `usersprofile`
--

CREATE TABLE `usersprofile` (
  `ID` int(11) NOT NULL,
  `NAMA` varchar(255) NOT NULL,
  `USERNAME` varchar(150) NOT NULL,
  `PASSWORD` varchar(150) NOT NULL,
  `EMAIL` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `usersprofile`
--

INSERT INTO `usersprofile` (`ID`, `NAMA`, `USERNAME`, `PASSWORD`, `EMAIL`) VALUES
(2, 'Muhammad Fajar M', 'admin', 'admin', 'muhammadfajarm@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `daftarproduk`
--
ALTER TABLE `daftarproduk`
  ADD PRIMARY KEY (`ID_PRODUK`);

--
-- Indexes for table `usersprofile`
--
ALTER TABLE `usersprofile`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `USERNAME` (`USERNAME`),
  ADD UNIQUE KEY `EMAIL` (`EMAIL`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `daftarproduk`
--
ALTER TABLE `daftarproduk`
  MODIFY `ID_PRODUK` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `usersprofile`
--
ALTER TABLE `usersprofile`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
