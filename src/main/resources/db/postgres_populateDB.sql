DELETE FROM CUSTOMER;
DELETE FROM PHONE;

INSERT INTO PHONE (id, description, number, phone_type)
VALUES (100001, 'vodafone', '066-284-02-50', 'MOBILE');

INSERT INTO PHONE (id, description, number, phone_type)
VALUES (100002, 'LIFE', '093-975-01-74', 'MOBILE');

INSERT INTO PHONE (id, description, number, phone_type)
VALUES (100003, 'autoresponder', '975-01-74', 'HOME');

INSERT INTO PHONE (id, description, number, phone_type)
VALUES (100004, 'autoresponder', '823-12-91', 'HOME');

INSERT INTO PHONE (id, description, number, phone_type)
VALUES (100005, 'autoresponder', '910-81-92', 'HOME');

INSERT INTO PHONE (id, description, number, phone_type)
VALUES (100006, 'autoresponder', '921-74-10', 'UNDEFINED');

INSERT INTO PHONE (id, description, number, phone_type)
VALUES (100007, 'autoresponder', '027-83-74', 'HOME');

INSERT INTO PHONE (id, description, number, phone_type)
VALUES (100008, 'autoresponder', '028-39-47', 'HOME');

INSERT INTO PHONE (id, description, number, phone_type)
VALUES (100009, 'autoresponder', '345-48-24', 'UNDEFINED');

INSERT INTO PHONE (id, description, number, phone_type)
VALUES (100010, 'autoresponder', '923-47-38', 'HOME');


INSERT INTO CUSTOMER (id, surname, name, patronymic, phone_id)
VALUES (100001, 'Першин', 'Семен', 'Семенович', 100001);

INSERT INTO CUSTOMER (id, name, patronymic, surname, phone_id)
VALUES (100002, 'Князева', 'Оксана', 'Викторовна', 100002);

INSERT INTO CUSTOMER (id, name, patronymic, surname, phone_id)
VALUES (100003, 'Болдырев', 'Игорь', 'Александрович', 100003);

INSERT INTO CUSTOMER (id, name, patronymic, surname, phone_id)
VALUES (100004, 'Гармашов', 'Сергей', 'Владимирович', 100004);

INSERT INTO CUSTOMER (id, name, patronymic, surname, phone_id)
VALUES (100005, 'Сотникова', 'Надежда', 'Андреевна', 100005);

INSERT INTO CUSTOMER (id, name, patronymic, surname, phone_id)
VALUES (100006, 'Шапошников', 'Павел', 'Викторович', 100006);

INSERT INTO CUSTOMER (id, name, patronymic, surname, phone_id)
VALUES (100007, 'Муковнин', 'Олег', 'Николаевич', 100007);

INSERT INTO CUSTOMER (id, name, patronymic, surname, phone_id)
VALUES (100008, 'Капустин', 'Сергей', 'Иванович', 100008);

INSERT INTO CUSTOMER (id, name, patronymic, surname, phone_id)
VALUES (100009, 'Крахмалев', 'Николай', 'Петрович', 100009);

INSERT INTO CUSTOMER (id, name, patronymic, surname, phone_id)
VALUES (100010, 'Пелипенко', 'Сергей', 'Николаевич', 100010);



