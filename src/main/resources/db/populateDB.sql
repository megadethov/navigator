DELETE FROM CUSTOMER;
DELETE FROM PHONE;

INSERT INTO Phone (id, description, number, phoneType)
VALUES (1, 'vodafone', '066-284-02-50', 'MOBILE');

INSERT INTO Phone (id, description, number, phoneType)
VALUES (2, 'LIFE', '093-975-01-74', 'MOBILE');

INSERT INTO Customer (id, name, patronymic, phone_id, surname)
VALUES (1, 'Boris', 'Ivanovich', 1, 'Petrov');

INSERT INTO Customer (id, name, patronymic, phone_id, surname)
VALUES (2, 'Alex', 'Ivanovich', 2, 'Vasechkin');


