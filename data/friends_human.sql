SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;


CREATE TABLE `all_animals` (
  `id` int(11) NOT NULL,
  `pid` int(11) NOT NULL,
  `animal_type` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `birthday` date DEFAULT NULL,
  `comands` json DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `all_animals` (`id`, `pid`, `animal_type`, `name`, `birthday`, `comands`) VALUES
(1, 1, 'cat', 'Барсик', '2015-10-15', NULL),
(2, 2, 'cat', 'Брынза', '2015-10-14', NULL),
(4, 1, 'dog', 'Борис', '2015-10-15', NULL),
(5, 2, 'dog', 'Собакен', '2015-10-14', NULL),
(7, 1, 'hamster', 'Дарт Вейдр', '2019-10-15', NULL),
(8, 2, 'hamster', 'Дарт Вейдр', '2019-10-14', NULL),
(10, 1, 'horse', 'Петея', '2015-10-15', '[\"Везти груз\"]'),
(11, 2, 'horse', 'Вася', '2015-10-14', '[\"Везти груз\"]'),
(12, 7, 'horse', 'Китаец', '2015-10-15', '[\"Везти груз\"]'),
(13, 8, 'horse', 'Валера', '2015-10-14', '[\"Везти груз\"]');

CREATE TABLE `animal` (
  `id` int(11) NOT NULL,
  `pid` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(100) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `animal` (`id`, `pid`, `name`) VALUES
(1, 'root', 'Животные');

CREATE TABLE `cat` (
  `id` int(11) NOT NULL,
  `pid` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `birthday` date DEFAULT NULL,
  `comands` json DEFAULT NULL,
  `animal_type` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `cat` (`id`, `pid`, `name`, `birthday`, `comands`, `animal_type`) VALUES
(1, 'pet', 'Барсик', '2015-10-15', NULL, 'cat'),
(2, 'pet', 'Брынза', '2015-10-14', NULL, 'cat');

CREATE TABLE `dog` (
  `id` int(11) NOT NULL,
  `pid` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `birthday` date DEFAULT NULL,
  `comands` json DEFAULT NULL,
  `animal_type` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `dog` (`id`, `pid`, `name`, `birthday`, `comands`, `animal_type`) VALUES
(1, 'pet', 'Борис', '2015-10-15', NULL, 'dog'),
(2, 'pet', 'Собакен', '2015-10-14', NULL, 'dog');

CREATE TABLE `hamster` (
  `id` int(11) NOT NULL,
  `pid` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `birthday` date DEFAULT NULL,
  `comands` json DEFAULT NULL,
  `animal_type` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `hamster` (`id`, `pid`, `name`, `birthday`, `comands`, `animal_type`) VALUES
(1, 'pet', 'Дарт Вейдр', '2019-10-15', NULL, 'hamster'),
(2, 'pet', 'Дарт Вейдр', '2019-10-14', NULL, 'hamster');

CREATE TABLE `horse` (
  `id` int(11) NOT NULL,
  `pid` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `birthday` date DEFAULT NULL,
  `comands` json DEFAULT NULL,
  `animal_type` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `horse` (`id`, `pid`, `name`, `birthday`, `comands`, `animal_type`) VALUES
(1, 'pack_animal', 'Петея', '2015-10-15', '[\"Везти груз\"]', 'horse'),
(2, 'pack_animal', 'Вася', '2015-10-14', '[\"Везти груз\"]', 'horse'),
(7, 'pack_animal', 'Китаец', '2015-10-15', '[\"Везти груз\"]', 'horse'),
(8, 'pack_animal', 'Валера', '2015-10-14', '[\"Везти груз\"]', 'horse');

CREATE TABLE `pack_animal` (
  `id` int(11) NOT NULL,
  `pid` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(100) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `pack_animal` (`id`, `pid`, `name`) VALUES
(1, 'animal', 'Вьючные животные');

CREATE TABLE `pet` (
  `id` int(11) NOT NULL,
  `pid` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(100) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `pet` (`id`, `pid`, `name`) VALUES
(1, 'animal', 'Домашние животные');

CREATE TABLE `young_animals` (
  `id_animal` int(11) NOT NULL,
  `age_month` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;


ALTER TABLE `all_animals`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `animal`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `cat`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `dog`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `hamster`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `horse`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `pack_animal`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `pet`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `young_animals`
  ADD PRIMARY KEY (`id_animal`);


ALTER TABLE `all_animals`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

ALTER TABLE `animal`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

ALTER TABLE `cat`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

ALTER TABLE `dog`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

ALTER TABLE `hamster`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

ALTER TABLE `horse`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

ALTER TABLE `pack_animal`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

ALTER TABLE `pet`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
