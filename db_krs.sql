-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 14 Jan 2023 pada 10.38
-- Versi Server: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `db_krs`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_krs`
--

CREATE TABLE IF NOT EXISTS `tb_krs` (
`id` int(11) NOT NULL,
  `mata_kuliah` varchar(25) NOT NULL,
  `dosen` varchar(25) NOT NULL,
  `kelas` varchar(15) NOT NULL,
  `semester` varchar(10) NOT NULL,
  `jam` varchar(20) NOT NULL,
  `hari` varchar(10) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data untuk tabel `tb_krs`
--

INSERT INTO `tb_krs` (`id`, `mata_kuliah`, `dosen`, `kelas`, `semester`, `jam`, `hari`) VALUES
(2, 'Kecerdasan Buatan', 'Bu Mayang', '5B Reg Pagi', 'Semester 5', 'Siang 13.00 - 14.00', 'Rabu'),
(4, 'Pemrograman Web', 'Pak Dedy', '5B ', 'Semester 5', 'Pagi 8.00 - 11.15', 'Rabu');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_mhs`
--

CREATE TABLE IF NOT EXISTS `tb_mhs` (
  `npm` varchar(15) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `thn_ajaran` varchar(15) DEFAULT NULL,
  `semester` varchar(15) DEFAULT NULL,
  `role` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_mhs`
--

INSERT INTO `tb_mhs` (`npm`, `nama`, `thn_ajaran`, `semester`, `role`) VALUES
('2010010623', 'Muhammad Rizky Fadillah', '2023', 'Semester 3', '2'),
('admin', 'admin', '', '', '1');

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE IF NOT EXISTS `transaksi` (
  `id` int(15) NOT NULL,
  `semester` varchar(15) NOT NULL,
  `npm` varchar(25) NOT NULL,
  `biaya` varchar(15) NOT NULL,
  `pajak` varchar(15) NOT NULL,
  `total_keseluruhan` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`id`, `semester`, `npm`, `biaya`, `pajak`, `total_keseluruhan`) VALUES
(1, 'Semester 6', '2010010623', '4100000.0', '205000.0', '4305000.0'),
(2, 'Semester 5', '2010010623', '3600000.0', '180000.0', '3780000.0'),
(4, 'Semester 3', '2010010626', '3800000.0', '190000.0', '3990000.0');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_krs`
--
ALTER TABLE `tb_krs`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tb_mhs`
--
ALTER TABLE `tb_mhs`
 ADD PRIMARY KEY (`npm`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
 ADD PRIMARY KEY (`id`), ADD KEY `npm` (`npm`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_krs`
--
ALTER TABLE `tb_krs`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
