DELETE FROM CUSTOMER;
DELETE FROM PHONE;

INSERT INTO PHONE (id, description, number, phone_type)
VALUES (1, 'vodafone', '066-284-02-50', 'MOBILE');

INSERT INTO PHONE (id, description, number, phone_type)
VALUES (2, 'LIFE', '093-975-01-74', 'MOBILE');

INSERT INTO CUSTOMER (name, patronymic, surname, phone_id)
VALUES ('Boris', 'Ivanovich', 'Petrov', 1);

INSERT INTO CUSTOMER (name, patronymic, surname, phone_id)
VALUES ('Alex', 'Ivanovich', 'Vasechkin', 2);




