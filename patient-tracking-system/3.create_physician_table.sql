use pts;

create table if not exists physician(
    physician_id INT NOT NULL auto_increment,
    physician_fname VARCHAR(20) NOT NULL,
    physician_mi VARCHAR(2),
    physician_lname VARCHAR(30) NOT NULL,
    physician_dob DATETIME NOT NULL,
    physician_phone VARCHAR(11) unique NOT NULL,
    physician_email VARCHAR(100) unique,
    date_licensed DATETIME NOT NULL,
    speciality VARCHAR(20) NOT NULL,
    speciality2 VARCHAR(20),
    license_exp_date DATETIME NOT NULL,
    primary key(physician_id)
);

insert into pts.physician(
    physician_fname,physician_mi,physician_lname,physician_dob,physician_phone,physician_email,date_licensed,
    speciality,speciality2,license_exp_date)
    Values
    ("Peter","W","West","1991-6-07","5553585555","pwwestdoc@email.com","2020-05-30","SURGERY","","2025-05-30"),
    ("Mary","T","Sanchez","1975-9-24","5558825555","marytsz@email.com","2001-01-12","WELLNESS","ORTHOPAEDICS","2023-05-26")
;