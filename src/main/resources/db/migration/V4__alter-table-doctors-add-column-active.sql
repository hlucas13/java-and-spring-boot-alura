ALTER TABLE doctors ADD active TINYINT;
UPDATE doctors SET active = 1;
ALTER TABLE doctors MODIFY active TINYINT NOT NULL;
