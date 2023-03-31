ALTER TABLE patients ADD active TINYINT;
UPDATE patients SET active = 1;
ALTER TABLE patients MODIFY active TINYINT NOT NULL;
