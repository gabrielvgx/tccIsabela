/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  GVGX
 * Created: 26/10/2017
 */
/*
Created: 26/10/2017
Modified: 26/10/2017
Model: MySQL 5.6
Database: MySQL 5.6
*/


-- Create tables section -------------------------------------------------

-- Table Item

CREATE TABLE Item
(
  id_item Serial NOT NULL,
  desc_item Char(30),
  actionItem Char(20),
  FK_id_item Serial
)
;

CREATE INDEX IX_Relationship1 ON Item (FK_id_item)
;

ALTER TABLE Item ADD  PRIMARY KEY (id_item)
;

-- Create relationships section ------------------------------------------------- 

ALTER TABLE Item ADD CONSTRAINT Relationship1 FOREIGN KEY (FK_id_item) REFERENCES Item (id_item) ON DELETE RESTRICT ON UPDATE RESTRICT
;


