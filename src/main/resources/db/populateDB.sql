DELETE FROM CUSTOMER;
DELETE FROM PHONE;

INSERT INTO Phone (id, description, number, phone_type)
VALUES (10001, 'vodafone', '066-284-02-50', 'MOBILE');

INSERT INTO Phone (id, description, number, phone_type)
VALUES (10002, 'LIFE', '093-975-01-74', 'MOBILE');

INSERT INTO Customer (id, name, patronymic, phone_id, surname)
VALUES (10001, 'Boris', 'Ivanovich', 10001, 'Petrov');

INSERT INTO Customer (id, name, patronymic, phone_id, surname)
VALUES (10002, 'Alex', 'Ivanovich', 10002, 'Vasechkin');


