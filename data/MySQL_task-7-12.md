
7. 
    * CREATE DATABASE friends_human;
8. 
    * CREATE TABLE `friends_human`.`animal` ( `id` INT(11) NOT NULL AUTO_INCREMENT , `pid` VARCHAR(100) NOT NULL , `name` VARCHAR(100) NOT NULL , `birthday` DATE NULL , `comands` JSON NULL , PRIMARY KEY (`id`)) ENGINE = InnoDB;
    * INSERT INTO `animal` (`id`, `pid`, `name`) VALUES (NULL, 'root', 'Животные');
    * CREATE TABLE `friends_human`.`pet` ( `id` INT(11) NOT NULL AUTO_INCREMENT , `pid` VARCHAR(100) NOT NULL , `name` VARCHAR(100) NOT NULL , PRIMARY KEY (`id`)) ENGINE = InnoDB;
    * INSERT INTO `pet` (`id`, `pid`, `name`) VALUES (NULL, 'animal', 'Домашние животные');
    * CREATE TABLE `friends_human`.`pack_animal` ( `id` INT(11) NOT NULL AUTO_INCREMENT , `pid` VARCHAR(100) NOT NULL , `name` VARCHAR(100) NOT NULL , PRIMARY KEY (`id`)) ENGINE = InnoDB;
    * INSERT INTO `pack_animal` (`id`, `pid`, `name`) VALUES (NULL, 'animal', 'Вьючные животные');
    * CREATE TABLE `friends_human`.`dog` ( `id` INT(11) NOT NULL AUTO_INCREMENT , `pid` VARCHAR(100) NOT NULL  , `name` VARCHAR(100) NOT NULL , `birthday` DATE NULL , `comands` JSON NULL , PRIMARY KEY (`id`)) ENGINE = InnoDB;
    * CREATE TABLE `friends_human`.`cat` ( `id` INT(11) NOT NULL AUTO_INCREMENT , `pid` VARCHAR(100) NOT NULL  , `name` VARCHAR(100) NOT NULL , `birthday` DATE NULL , `comands` JSON NULL , PRIMARY KEY (`id`)) ENGINE = InnoDB;
    * CREATE TABLE `friends_human`.`hamster` ( `id` INT(11) NOT NULL AUTO_INCREMENT , `pid` VARCHAR(100) NOT NULL  , `name` VARCHAR(100) NOT NULL , `birthday` DATE NULL , `comands` JSON NULL , PRIMARY KEY (`id`)) ENGINE = InnoDB;
    * CREATE TABLE `friends_human`.`horse` ( `id` INT(11) NOT NULL AUTO_INCREMENT , `pid` VARCHAR(100) NOT NULL  , `name` VARCHAR(100) NOT NULL , `birthday` DATE NULL , `comands` JSON NULL , PRIMARY KEY (`id`)) ENGINE = InnoDB;
    * CREATE TABLE `friends_human`.`camel` ( `id` INT(11) NOT NULL AUTO_INCREMENT , `pid` VARCHAR(100) NOT NULL  , `name` VARCHAR(100) NOT NULL , `birthday` DATE NULL , `comands` JSON NULL , PRIMARY KEY (`id`)) ENGINE = InnoDB;
    * CREATE TABLE `friends_human`.`donkey` ( `id` INT(11) NOT NULL AUTO_INCREMENT , `pid` VARCHAR(100) NOT NULL  , `name` VARCHAR(100) NOT NULL , `birthday` DATE NULL , `comands` JSON NULL , PRIMARY KEY (`id`)) ENGINE = InnoDB;

9. 
    * INSERT INTO `horse` (`id`, `pid`, `name`, `birthday`, `comands`) VALUES (NULL, 'pack_animal', 'Петея', '2015-10-15', '[\"Везти груз\"]'), (NULL, 'pack_animal', 'Вася', '2015-10-14', '[\"Везти груз\"]');
    * INSERT INTO `donkey` (`id`, `pid`, `name`, `birthday`, `comands`) VALUES (NULL, 'pack_animal', 'Китаец', '2015-10-15', '[\"Везти груз\"]'), (NULL, 'pack_animal', 'Валера', '2015-10-14', '[\"Везти груз\"]');
    * INSERT INTO `camel` (`id`, `pid`, `name`, `birthday`, `comands`) VALUES (NULL, 'pack_animal', 'Мореход', '2015-10-15', '[\"Везти груз\"]'), (NULL, 'pack_animal', 'Заяц', '2015-10-14', '[\"Везти груз\"]');
    * INSERT INTO `cat` (`id`, `pid`, `name`, `birthday`, `comands`) VALUES (NULL, 'pet', 'Барсик', '2015-10-15', NULL), (NULL, 'pet', 'Брынза', '2015-10-14', NULL);
    * INSERT INTO `dog` (`id`, `pid`, `name`, `birthday`, `comands`) VALUES (NULL, 'pet', 'Борис', '2015-10-15', NULL), (NULL, 'pet', 'Собакен', '2015-10-14', NULL);
    * INSERT INTO `hamster` (`id`, `pid`, `name`, `birthday`, `comands`) VALUES (NULL, 'pet', 'Дарт Вейдр', '2019-10-15', NULL), (NULL, 'pet', 'Дарт Вейдр', '2019-10-14', NULL);

10. 
    * DROP TABLE camel;
    * INSERT INTO horse (pid, name, birthday, comands) SELECT pid, name, birthday, comands FROM donkey;

11. 
    * CREATE TABLE `friends_human`.`young_animals` ( `id_animal` INT(11) NOT NULL , `age_month` DATE NOT NULL ) ENGINE = InnoDB;

12. 
    * ALTER TABLE cat ADD COLUMN animal_type VARCHAR(50) NOT NULL;
    * ALTER TABLE dog ADD COLUMN animal_type VARCHAR(50) NOT NULL;
    * ALTER TABLE hamster ADD COLUMN animal_type VARCHAR(50) NOT NULL;
    * ALTER TABLE horse ADD COLUMN animal_type VARCHAR(50) NOT NULL;
    * INSERT INTO all_animals (pid, animal_type, name, birthday, comands) SELECT id, animal_type, name, birthday, comands FROM cat;
    * INSERT INTO all_animals (pid, animal_type, name, birthday, comands) SELECT id, animal_type, name, birthday, comands FROM dog;
    * INSERT INTO all_animals (pid, animal_type, name, birthday, comands) SELECT id, animal_type, name, birthday, comands FROM hamster;
    * INSERT INTO all_animals (pid, animal_type, name, birthday, comands) SELECT id, animal_type, name, birthday, comands FROM horse;



