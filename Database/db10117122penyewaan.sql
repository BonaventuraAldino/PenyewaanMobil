-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 12, 2021 at 04:48 PM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.4.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db10117122penyewaan`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id_customer` char(8) NOT NULL,
  `nama_customer` varchar(50) DEFAULT NULL,
  `alamat_customer` varchar(50) DEFAULT NULL,
  `kota_customer` varchar(50) DEFAULT NULL,
  `telepon_customer` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id_customer`, `nama_customer`, `alamat_customer`, `kota_customer`, `telepon_customer`) VALUES
('CS01', 'Aldi Lesmana', 'JL. Dipatiukur', 'Bandung', '089934239992'),
('CS02', 'Bonaventura', 'Jl. A H Nasution No.14', 'Bandung', '087765439932'),
('CS03', 'Andi Ahmad', 'Jl. Sukajadi No. 50', 'Bandung', '081293489244'),
('CS04', 'Linggar Pranata', 'Jl. Gatot Subroto IV No.10', 'Jakarta', '085712387219'),
('CS05', 'Sarah Vira', 'Jl. Kayakan No. 197', 'Bandung', '081293384891'),
('CS06', 'Maria Vania', 'Jl. Margahayu No. 2', 'Bandung', '085928119210'),
('CS07', 'Setiyadi Mahmud', 'Jl. Gumuruh No. 100', 'Jakarta', '081229485160'),
('CS08', 'Riyani Agustin', 'Jl. Sukarasa No.07', 'Bandung', '081129381821'),
('CS09', 'Rizal Adi Pratama', 'Jl. Gatot Subroto No. 28', 'Bandung', '081392112291'),
('CS10', 'Intan Ayu', 'Jl. Merak Merah No. 102', 'Jakarta', '081928113218'),
('CS11', 'Riyadi', 'Jl. Pancasila No. 09', 'Bandung', '083982213770'),
('CS12', 'Egga', 'Jl. Gumuruh No. 201', 'Bandung', '085828190210'),
('CS13', 'Dewi Agustin', 'Jl. Setiabudi No. 20', 'Bandung', '081322913812'),
('CS14', 'Febrianto', 'Jl. Venus No. 02', 'Bandung', '081392019202'),
('CS15', 'Agus Sulistyo', 'Jl. Gatot Subroto No. 107', 'Jakarta', '081129387578'),
('CS16', 'Sarah Amira', 'Jl. Guntur No. 50', 'Jakarta', '081230924450'),
('CS17', 'Amiza', 'Jl. Pancasila No. 19', 'Jakarta', '085617280192'),
('CS18', 'Nandang Herman', 'Jl. Sumantri No. 07', 'Bandung', '081314928102'),
('CS19', 'Zain Malik', 'Jl. Pelajar Pejuang No. 45', 'Bandung', '081120931090'),
('CS20', 'Ronaldo Wati', 'Jl. Bandung Raya', 'Bandung', '081920319230'),
('CS21', 'Bayu Prawitasari', 'Jl. Babakan Sari No. 117 Bandung', 'Bandung', '082198888762'),
('CS22', 'Crescento Hermawan', 'Jl. Talaga Bodas No.35 Bandung', 'Bandung', '089998788821'),
('CS23', 'Dwiarti Widiyani', 'Jl. Pasir Impun No. 33A Kota Bandung', 'Bandung', '081331113131'),
('CS24', 'Eddi Sugiardi', 'Jl. Soekarno Hatta KM 12,5 Bandung', 'Bandung', '088163456222'),
('CS25', 'Fahmi Babra', 'Jl. Santosa Asih No.17 Bandung', 'Bandung', '081211421121');

-- --------------------------------------------------------

--
-- Table structure for table `depot`
--

CREATE TABLE `depot` (
  `id_depot` char(8) NOT NULL,
  `nama_depot` varchar(50) DEFAULT NULL,
  `alamat_depot` varchar(50) DEFAULT NULL,
  `kota_depot` varchar(50) DEFAULT NULL,
  `telepon_depot` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `depot`
--

INSERT INTO `depot` (`id_depot`, `nama_depot`, `alamat_depot`, `kota_depot`, `telepon_depot`) VALUES
('DP01', 'Beo', 'Jl. Srigunting Raya No.1 Bandung', 'Bandung', '089934239992'),
('DP02', 'Cenderawasih', 'Jl. A H Nasution No. 14 Bandung', 'Bandung', '087765439932'),
('DP03', 'Elang', 'Jl. Mars No. 10', 'Bandung', '081928391821'),
('DP04', 'Gajah', 'Jl. Gatot Subroto No. 12', 'Bandung', '081928393810'),
('DP05', 'Merpati', 'Jl. Panyileukan No. 10', 'Bandung', '081120931021'),
('DP06', 'Merak', 'Jl. Merak No. 09', 'Jakarta', '082129035739'),
('DP07', 'Semut', 'Jl. Setrasari No. 100', 'Bandung', '085717239572'),
('DP08', 'Persia', 'Jl. Bumi No. 10', 'Bandung', '08119482746'),
('DP09', 'Flaming', 'Jl. Pungkur No. 10', 'Jakarta', '08219487652'),
('DP10', 'Sissy', 'Jl. Punduk Unta No. 40', 'Jakarta', '081157623849'),
('DP11', 'Harimau', 'Jl. Sudirman No. 29', 'Bandung', '08571928319'),
('DP12', 'Pipit', 'Jl. Suryalaya No. 02', 'Bandung', '085920139212'),
('DP13', 'Singa', 'Jl. Sulatri No. 102', 'Bandung', '081239291038'),
('DP14', 'Buaya', 'Jl. Pasteur No. 201', 'Bandung', '083984716472'),
('DP15', 'Paus', 'Jl. Pancasila No. 200', 'Bandung', '082919371271'),
('DP16', 'Matahari', 'Jl. Cileunyi No. 10', 'Bandung', '085983910293'),
('DP17', 'Bulan', 'Jl. Buah Batu No. 100', 'Bandung', '08398271289'),
('DP18', 'Rakun', 'Jl. Angklung No. 04', 'Bandung', '08930192938'),
('DP19', 'Tapir', 'Jl. Perancangan No. 20', 'Jakarta', '083902919302'),
('DP20', 'Sungkan', 'Jl. Santun No. 01', 'Bandung', '081392832918'),
('DP21', 'Bangau', 'Jl. Lombok No.6 Bandung', 'Bandung', '087665443221'),
('DP22', 'Monkey', 'Jl. Sukamulya No.4', 'Bandung', '081232323144'),
('DP23', 'Manu', 'Jl. Denki No. 54', 'Bandung', '085455411232'),
('DP24', 'Lako', 'Jl. Santosa Asih No.17', 'Bandung', '081123432121'),
('DP25', 'Bandi', 'Jl. Babakan Sari No.117', 'Bandung', '081112321212');

-- --------------------------------------------------------

--
-- Table structure for table `hirepoint`
--

CREATE TABLE `hirepoint` (
  `id_hirePoint` char(8) NOT NULL,
  `nama_hirePoint` varchar(50) DEFAULT NULL,
  `alamat_hirePoint` varchar(50) DEFAULT NULL,
  `kota_hirePoint` varchar(50) DEFAULT NULL,
  `telepon_hirePoint` varchar(13) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hirepoint`
--

INSERT INTO `hirepoint` (`id_hirePoint`, `nama_hirePoint`, `alamat_hirePoint`, `kota_hirePoint`, `telepon_hirePoint`) VALUES
('HP01', 'Alpukat', 'Jl. Srigunting Raya No.1 Bandung', 'Bandung', '089934239992'),
('HP02', 'Apel', 'Jl. A H Nasution No. 14 Bandung', 'Bandung', '087765439932'),
('HP03', 'Pisang', 'Jl. Suryalaya No. 10', 'Bandung', '081329102911'),
('HP04', 'Ceri', 'Jl. Argus No. 03', 'Bandung', '081329381928'),
('HP05', 'Anggur', 'Jl. Sempit No. 10', 'Jakarta', '082918298123'),
('HP06', 'Semangka', 'Jl. Bersih No. 05', 'Bandung', '082198239102'),
('HP07', 'Batu', 'Jl. Lengkah No. 10', 'Bandung', '085921298301'),
('HP08', 'Beri', 'Jl. Sono No. 201', 'Bandung', '08123092189'),
('HP09', 'Lemon', 'Jl. Suhendra No. 101', 'Jakarta', '081329184710'),
('HP10', 'Durian', 'Jl. Sembako No. 09', 'Jakarta', '08398129830'),
('HP11', 'Lengkeng', 'Jl. Leuwi Panjang No. 10', 'Bandung', '08120930192'),
('HP12', 'Sirup', 'Jl. Mars No.109', 'Bandung', '08123091292'),
('HP13', 'Mekar', 'Jl. Taman Ismail No.10', 'Jakarta', '08192840912'),
('HP14', 'Mangga', 'Jl. Kebun Raya No. 10', 'Bandung', '081239328164'),
('HP15', 'Stroberi', 'Jl. Eka Nusa No. 102', 'Jakarta', '083919231057'),
('HP16', 'Bengkoang', 'Jl. Rumasa No. 10', 'Bandung', '08129319213'),
('HP17', 'Cabai', 'Jl. Urung Udun No. 10', 'Bandung', '082130912394'),
('HP18', 'Naga', 'Jl. Penangkaran Timur No. 09', 'Jakarta', '08123094187'),
('HP19', 'Jeruk', 'Jl. Salendro No. 09', 'Bandung', '085712831029'),
('HP20', 'Bali', 'Jl. Keistanaan No.20', 'Jakarta', '081204817749'),
('HP21', 'Ular', 'Jl. HR Rasuna Said', 'Jakarta', '087112226787'),
('HP22', 'Lembang', 'Jl. Hayam Wuruk No.2', 'Jakarta', '089976765444'),
('HP23', 'Hijau', 'Jl. Jaksa No.1', 'Jakarta', '089771232344'),
('HP24', 'Kemanggi', 'Jl. Hayam Wuruk', 'Bandung', '088787675677'),
('HP25', 'Bojomu', 'Jl. Aceh No.1', 'Bandung ', '089898797231');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` char(8) NOT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `username`, `password`) VALUES
('AD001', 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `mobil`
--

CREATE TABLE `mobil` (
  `id_mobil` char(8) NOT NULL,
  `id_depot` char(8) DEFAULT NULL,
  `no_polisi` varchar(10) DEFAULT NULL,
  `merk` varchar(30) DEFAULT NULL,
  `tahun_buat` date DEFAULT NULL,
  `isi_silinder` varchar(10) DEFAULT NULL,
  `warna` varchar(10) DEFAULT NULL,
  `bahan_bakar` varchar(10) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  `harga_sewa` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mobil`
--

INSERT INTO `mobil` (`id_mobil`, `id_depot`, `no_polisi`, `merk`, `tahun_buat`, `isi_silinder`, `warna`, `bahan_bakar`, `status`, `harga_sewa`) VALUES
('ML01', 'DP01', 'D 8767 BC', 'Yamaha', '2021-08-11', '2', 'Putih', 'Solar', 'Pinjam', 100000),
('ML02', 'DP02', 'EB 1101 RE', 'Mitshubishi', '2014-08-08', '2', 'Putih', 'Premium', 'Bebas', 100000),
('ML03', 'DP17', 'D 1212 ED', 'Toyota', '2021-08-12', '3', 'Putih', 'Premium', 'Pinjam', 200000),
('ML04', 'DP02', 'D 1920 AE', 'Toyota', '2018-08-02', '3', 'Putih', 'Premium', 'Pinjam', 150000),
('ML05', 'DP14', 'B 017 AB', 'Toyota', '2021-08-11', '2', 'Hitam', 'Premium', 'Bebas', 100000),
('ML06', 'DP16', 'B 0291 EE', 'Honda', '2017-08-03', '3', 'Hitam', 'Pertamax', 'Pinjam', 250000),
('ML07', 'DP04', 'B 1334', 'Honda', '2018-08-15', '3', 'Putih', 'Pertamax', 'Bebas', 300000),
('ML08', 'DP09', 'B 1033 AR', 'Nissan', '2017-08-05', '2', 'Hitam', 'Premium', 'Pinjam', 200000),
('ML09', 'DP20', 'D 2021 AR', 'Nissan', '2021-10-04', '2', 'Hitam', 'Pertamax', 'Bebas', 250000),
('ML10', 'DP05', 'D 5302 AD', 'Honda', '2016-09-16', '3', 'Merah', 'Pertamax', 'Pinjam', 200000),
('ML11', 'DP15', 'D 5302 AD', 'Honda', '2016-09-23', '2', 'Merah', 'Pertamax', 'Pinjam', 150000),
('ML12', 'DP20', 'D 2033 AR', 'Nissan', '2019-10-03', '2', 'Hitam', 'Pertamax', 'Bebas', 200000),
('ML13', 'DP05', 'D 8799 BC', 'Yamaha', '2010-05-10', '2', 'Putih', 'Premium', 'Pinjam', 100000),
('ML14', 'DP05', 'B 1078 RE', 'Mitshubishi', '2016-08-18', '2', 'Putih', 'Premium', 'Bebas', 150000),
('ML15', 'DP17', 'D 1212 ED', 'Toyota', '2017-08-03', '3', 'Merah', 'Premium', 'Pinjam', 200000),
('ML16', 'DP13', 'D 2000 AE', 'Toyota', '2018-08-15', '3', 'Putih', 'Pertamax', 'Pinjam', 100000),
('ML17', 'DP14', 'B 0120 AB', 'Toyota', '2015-08-13', '2', 'Hitam', 'Premium', 'Bebas', 100000),
('ML18', 'DP08', 'B 0294 EF', 'Honda', '2017-08-03', '3', 'Hitam', 'Pertamax', 'Pinjam', 250000),
('ML19', 'DP10', 'B 1980 AA', 'Honda', '2018-08-01', '3', 'Putih', 'Pertamax', 'Bebas', 260000),
('ML20', 'DP03', 'B 1033 AR', 'Nissan', '2017-08-23', '2', 'Hitam', 'Premium', 'Bebas', 200000),
('ML21', 'DP04', 'D 2011 AR', 'Nissan', '2021-10-04', '2', 'Hitam', 'Pertamax', 'Bebas', 250000),
('ML22', 'DP15', 'D 5442 AD', 'Honda', '2016-09-16', '3', 'Merah', 'Pertamax', 'Pinjam', 150000),
('ML23', 'DP09', 'D 2302 AD', 'Honda', '2016-09-23', '2', 'Merah', 'Pertamax', 'Pinjam', 150000),
('ML24', 'DP20', 'D 2013 AR', 'Nissan', '2018-10-02', '2', 'Hitam', 'Pertamax', 'Bebas', 200000),
('ML25', 'DP14', 'D 2553 AR', 'Honda', '2017-10-10', '3', 'Hitam', 'Premium', 'Bebas', 200000),
('ML26', 'DP14', 'D 1211 Z', 'Toyota', '2011-08-11', '2', 'Biru', 'Solar', 'Bebas', 200000);

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `no_nota` char(8) NOT NULL,
  `id_hirePoint` char(8) DEFAULT NULL,
  `id_customer` char(8) DEFAULT NULL,
  `id_mobil` char(8) DEFAULT NULL,
  `tgl_pinjam` date DEFAULT NULL,
  `tgl_kembali` date DEFAULT NULL,
  `total_bayar` int(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`no_nota`, `id_hirePoint`, `id_customer`, `id_mobil`, `tgl_pinjam`, `tgl_kembali`, `total_bayar`) VALUES
('NO01', 'HP01', 'CS01', 'ML01', '2021-07-19', '2021-07-20', 200000),
('NO02', 'HP01', 'CS15', 'ML01', '2021-08-18', '2021-08-19', 100000),
('NO04', 'HP02', 'CS03', 'ML09', '2021-08-01', '2021-08-10', 2250000),
('NO05', 'HP07', 'CS17', 'ML08', '2021-07-01', '2021-07-04', 600000),
('NO06', 'HP13', 'CS02', 'ML06', '2021-08-03', '2021-08-07', 1000000),
('NO07', 'HP07', 'CS24', 'ML01', '2021-08-19', '2021-08-21', 200000),
('NO08', 'HP11', 'CS11', 'ML10', '2021-08-05', '2021-08-14', 1800000),
('NO09', 'HP14', 'CS12', 'ML05', '2021-08-15', '2021-08-18', 300000),
('NO10', 'HP05', 'CS03', 'ML05', '2021-08-03', '2021-08-06', 300000),
('NO11', 'HP06', 'CS13', 'ML10', '2021-07-05', '2021-07-06', 100000),
('NO12', 'HP07', 'CS03', 'ML15', '2021-08-03', '2021-08-06', 600000),
('NO13', 'HP10', 'CS01', 'ML05', '2021-08-11', '2021-08-12', 100000),
('NO14', 'HP05', 'CS04', 'ML16', '2021-08-02', '2021-08-05', 450000),
('NO15', 'HP06', 'CS08', 'ML15', '2021-07-01', '2021-07-05', 600000),
('NO16', 'HP06', 'CS18', 'ML06', '2021-08-12', '2021-08-13', 200000),
('NO17', 'HP05', 'CS19', 'ML12', '2021-08-20', '2021-08-23', 300000),
('NO18', 'HP16', 'CS14', 'ML17', '2021-08-10', '2021-08-14', 800000),
('NO19', 'HP17', 'CS17', 'ML14', '2021-08-12', '2021-08-16', 400000),
('NO20', 'HP10', 'CS19', 'ML08', '2021-08-04', '2021-08-10', 750000),
('NO21', 'HP10', 'CS09', 'ML09', '2021-07-02', '2021-07-04', 200000),
('NO22', 'HP14', 'CS16', 'ML14', '2021-08-04', '2021-08-06', 200000),
('NO23', 'HP13', 'CS20', 'ML05', '2021-08-15', '2021-08-17', 300000),
('NO24', 'HP09', 'CS17', 'ML12', '2021-08-13', '2021-08-15', 300000),
('NO25', 'HP06', 'CS08', 'ML05', '2021-08-19', '2021-08-23', 600000),
('NO26', 'HP01', 'CS15', 'ML17', '2021-08-11', '2021-08-12', 100000),
('NO27', 'HP01', 'CS15', 'ML17', '2021-08-06', '2021-08-10', 400000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id_customer`);

--
-- Indexes for table `depot`
--
ALTER TABLE `depot`
  ADD PRIMARY KEY (`id_depot`);

--
-- Indexes for table `hirepoint`
--
ALTER TABLE `hirepoint`
  ADD PRIMARY KEY (`id_hirePoint`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `mobil`
--
ALTER TABLE `mobil`
  ADD PRIMARY KEY (`id_mobil`),
  ADD KEY `fk_depot` (`id_depot`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`no_nota`),
  ADD KEY `fk_hirepoint` (`id_hirePoint`),
  ADD KEY `fk_customer` (`id_customer`),
  ADD KEY `fk_mobil` (`id_mobil`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `mobil`
--
ALTER TABLE `mobil`
  ADD CONSTRAINT `fk_depot` FOREIGN KEY (`id_depot`) REFERENCES `depot` (`id_depot`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `fk_customer` FOREIGN KEY (`id_customer`) REFERENCES `customer` (`id_customer`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_hirepoint` FOREIGN KEY (`id_hirePoint`) REFERENCES `hirepoint` (`id_hirePoint`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_mobil` FOREIGN KEY (`id_mobil`) REFERENCES `mobil` (`id_mobil`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
