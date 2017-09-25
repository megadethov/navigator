DELETE FROM CUSTOMER;
DELETE FROM PHONE;

INSERT INTO PHONE (id, description, number, phone_type)
VALUES (100000, 'vodafone', '066-284-02-50', 'MOBILE');

INSERT INTO PHONE (id, description, number, phone_type)
VALUES (200000, 'LIFE', '093-975-01-74', 'MOBILE');

INSERT INTO CUSTOMER (id, name, patronymic, surname, phone_id)
VALUES (100000, 'Boris', 'Ivanovich', 'Petrov', 100000);

INSERT INTO CUSTOMER (id, name, patronymic, surname, phone_id)
VALUES (200000, 'Alex', 'Ivanovich', 'Vasechkin', 200000);




