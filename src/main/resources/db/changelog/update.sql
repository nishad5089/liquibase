-- *********************************************************************
-- SQL to roll back currently unexecuted changes
-- *********************************************************************
-- Change Log: D:/Java Projects/Liquebase/src/main/resources/db/changelog/master.xml
-- Ran at: 5/6/21, 1:18 PM
-- Against: postgres@jdbc:postgresql://localhost:5432/liquibase
-- Liquibase version: 3.10.3
-- *********************************************************************

SET SEARCH_PATH TO public;

-- Lock Database
UPDATE public.databasechangeloglock SET LOCKED = TRUE, LOCKEDBY = 'BS-590 (172.25.240.1)', LOCKGRANTED = '2021-05-06 13:18:45.295' WHERE ID = 1 AND LOCKED = FALSE;

SET SEARCH_PATH TO public;

SET SEARCH_PATH TO public;

-- Rolling Back ChangeSet: D:/Java Projects/Liquebase/src/main/resources/db/changelog/create-books-and-author-schema-v1.2.xml::tag-1.2::nishad
DELETE FROM public.databasechangelog WHERE ID = 'tag-1.2' AND AUTHOR = 'nishad' AND FILENAME = 'D:/Java Projects/Liquebase/src/main/resources/db/changelog/create-books-and-author-schema-v1.2.xml';

-- Rolling Back ChangeSet: D:/Java Projects/Liquebase/src/main/resources/db/changelog/create-books-and-author-schema-v1.2.xml::07::nishad
ALTER TABLE public.authors RENAME COLUMN author_name1 TO author_name;

DELETE FROM public.databasechangelog WHERE ID = '07' AND AUTHOR = 'nishad' AND FILENAME = 'D:/Java Projects/Liquebase/src/main/resources/db/changelog/create-books-and-author-schema-v1.2.xml';

-- Rolling Back ChangeSet: D:/Java Projects/Liquebase/src/main/resources/db/changelog/create-books-and-author-schema-v1.1.xml::tag-1.1::nishad
DELETE FROM public.databasechangelog WHERE ID = 'tag-1.1' AND AUTHOR = 'nishad' AND FILENAME = 'D:/Java Projects/Liquebase/src/main/resources/db/changelog/create-books-and-author-schema-v1.1.xml';

-- Rolling Back ChangeSet: D:/Java Projects/Liquebase/src/main/resources/db/changelog/insert-data-books-v1.0.xml::10::nishad
DELETE FROM public.books WHERE name = 'book_01_a_10';

DELETE FROM public.databasechangelog WHERE ID = '10' AND AUTHOR = 'nishad' AND FILENAME = 'D:/Java Projects/Liquebase/src/main/resources/db/changelog/insert-data-books-v1.0.xml';

-- Release Database Lock
SET SEARCH_PATH TO public;

UPDATE public.databasechangeloglock SET LOCKED = FALSE, LOCKEDBY = NULL, LOCKGRANTED = NULL WHERE ID = 1;

SET SEARCH_PATH TO public;

