CREATE database if not exists pts;

use pts;

CREATE TABLE if not exists patient(
	patient_id INT NOT NULL auto_increment,
    first_name VARCHAR(50) NOT NULL,
    mi VARCHAR(1),
    last_name VARCHAR(50) NOT NULL,
    gender VARCHAR(8) NOT NULL,
    dob DATETIME NOT NULL,
    phone VARCHAR(11) unique NOT NULL,
    email VARCHAR(100) unique,
    is_Active boolean NOT NULL default 1,
    primary key(patient_id)
);

CREATE TABLE if not exists appointment (
	appointment_id INT NOT NULL auto_increment,
    appointment_datetime datetime not null,
    appointment_status varchar(30) not null,
    appointment_specialization varchar(40) not null,
    patient_id int not null,
    primary key(appointment_id),
    foreign key(patient_id) references patient(patient_id)
);

insert into pts.patient(
	first_name,mi,last_name,gender,dob,phone,email)
    Values
    ("John","T","Doe","M","1997-5-25","1234567890","test@gmail.com"
);

-- Adding in Patients
insert into pts.patient(
	first_name,mi,last_name,gender,dob,phone,email)
    Values
    ("Donald","S","Peters","M","1985-10-26","2131235578","donalds@yahoo.com"),
    ("Paula","K","Smith","F","1978-11-10","4588887896","paulasmith@aol.com")
;

insert into pts.patient(
	first_name,mi,last_name,gender,dob,phone,email)
    Values
    ("Louie","T","Yields","M","1996-09-09","7855522212","louiet@email.com"),
    ("Matthew","S","Bins","M","2006-05-07","5322252211","matthewbinss@email.com"),
    ("Samantha","N","Jazmine","F","2000-08-01","4578875566","snje@gmail.com"),
    ("David","P","Peter","M","2003-08-09","5563321120","dpp@yahoo.com"),
    ("Kate","O","Oliver","F","1995-07-25","2025528874","koliver@gmail.com"),
    ("Tracy","N","Wrong","F","2008-09-30","1009929921","tracyn@gmail.com"),
    ("Paul","J","Teter","M","1992-06-09","6577177765","pauljteter@gmail.com")
;

insert into pts.patient(
	first_name,last_name,gender,dob,phone,email)
    Values
    ("Udon","Lee","M","1992-05-23","4553322288","udonlee@gmail.com"),
    ("Kendra","Shake","F","1973-02-28","4431122211","kendras@yahoo.com"),
    ("Oliver","Mash","M","1993-01-01","3322217783","olivermash@gmail.com"),
    ("Sarah","Teal","F","1920-02-04","7171171188","sarahteal@aol.com"),
    ("Lisa","Simpson","F","1989-05-03","2827738822","lisasimpson@email.com")
;

insert into pts.patient(
	first_name,last_name,gender,dob,phone)
    Values
    ("Agot","Serene","F","1993-07-12","8890090022")
;

-- Adding in Appointments
insert into pts.appointment(
	appointment_datetime,appointment_status,appointment_specialization,patient_id)
	Values
    ("2024-4-01 12:00:00","SCHEDULED","WELLNESS",2),
    ("2024-3-19 15:00:00","SCHEDULED","ORTHOPAEDICS",16),
    ("2024-3-19 11:00:00","CANCELLED","SURGERY",15),
    ("2024-3-19 08:00:00","SCHEDULED","CARDIOLOGY",1),
    ("2024-3-19 11:00:00","SCHEDULED","CARDIOLOGY",16),
    ("2024-3-19 09:00:00","SCHEDULED","SURGERY",13),
    ("2024-3-19 08:00:00","SCHEDULED","WELLNESS",7),
    ("2024-3-19 16:00:00","SCHEDULED","DERMATOLOGY",15),
    ("2024-3-19 13:00:00","SCHEDULED","DERMATOLOGY",14),
    ("2024-3-19 10:00:00","SCHEDULED","SURGERY",12),
    ("2024-3-19 12:00:00","SCHEDULED","DERMATOLOGY",8),
    ("2024-3-19 15:00:00","SCHEDULED","DERMATOLOGY",9),
    ("2024-3-19 13:00:00","CANCELLED","NEUROLOGY",10),
    ("2024-3-19 10:00:00","SCHEDULED","SURGERY",11),
    ("2024-3-19 09:00:00","SCHEDULED","WELLNESS",12),
    ("2024-3-19 08:00:00","SCHEDULED","SURGERY",15),
    ("2024-3-19 15:00:00","SCHEDULED","WELLNESS",14),
    ("2024-3-19 16:00:00","SCHEDULED","ORTHOPAEDICS",7),
    ("2024-3-19 15:00:00","SCHEDULED","CARDIOLOGY",8),
    ("2024-3-19 09:00:00","SCHEDULED","ORTHOPAEDICS",9),
    ("2024-3-19 11:00:00","SCHEDULED","DERMATOLOGY",15)
    ;
