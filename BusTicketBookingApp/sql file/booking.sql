CREATE TABLE bus_booking
(
booking_id INT AUTO_INCREMENT PRIMARY KEY,
bus_name VARCHAR(100) NOT NULL,
bus_from VARCHAR(100) NOT NULL,
bus_to VARCHAR(100) NOT NULL,
pick_up location  VARCHAR(100) NOT NULL,
drop_off location VARCHAR(100) NOT NULL
);
SELECT *FROM bus_booking;