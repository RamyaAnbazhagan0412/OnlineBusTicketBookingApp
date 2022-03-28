DROP TABLE bus_ticket_booking_app_display;
CREATE TABLE bus_ticket_booking_app_display
(
bus_id INT PRIMARY KEY AUTO_INCREMENT,
bus_name VARCHAR(100)NOT NULL UNIQUE,
bus_from VARCHAR(100)NOT NULL,
bus_to VARCHAR(100)NOT NULL,
bus_date DATE NOT NULL,
bus_timing VARCHAR(10),
bus_tickets INT NOT NULL,
bus_ticket_price INT NOT NULL
);
INSERT INTO bus_ticket_booking_app_display (bus_name,bus_from,bus_to,bus_date,bus_timing,bus_tickets,bus_ticket_price)VALUES('kumaran bus services','chengalpattu','mathurantagam',NOW(),'5:00 am',50,150),
('PKR travels','chengalpattu','mathurantagam',NOW(),'6:00 pm',60,120),
('Diya','chengalpattu','mathurantagam',NOW(),'5:30 am',40,150),
('Blue bus services','chengalpattu','mathurantagam',NOW(),'7:00 am',50,130),
('Sundhara Travels','chengalpattu','mathurantagam',NOW(),'8:00 pm',40,150),
('Mayilvaganan','chengalpattu','mathurantagam',NOW(),'7:30 am',60,120),
('Sithivinayagar','chengalpattu','mathurantagam',NOW(),'8:30 am',40,130),
('vetri vel','chengalpattu','mathurantagam',NOW(),'5:30 pm',50,120),
('Jegan services','chengalpattu','mathurantagam',NOW(),'6:00 am',60,100),
('Pratheep travels','chengalpattu','mathurantagam',NOW(),'6:30 pm',40,130),
('V travels','chengalpattu','mathurantagam',NOW(),'7:00 am',50,140);
SELECT *FROM bus_ticket_booking_app_display;
SELECT *FROM bus_ticket_booking_app_display WHERE bus_from = 'chengalpattu';