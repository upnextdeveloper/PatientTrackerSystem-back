use pts;

create table if not exists feedback(
    feedback_id INT NOT NULL auto_increment,
    feedback_desc VARCHAR(25) NOT NULL,
    appointment_id INT UNIQUE NOT NULL,
    primary key(feedback_id),
    foreign key(appointment_id) references appointment(appointment_id)
);

insert into pts.feedback(
    feedback_desc,appointment_id)
    values("SATISFIED",1),
    ("SATISFIED",2),
    ("SATISFIED",4),
    ("VERY_SATISFIED",8),
    ("NEUTRAL",14),
    ("NEUTRAL",15),
    ("NEUTRAL",20),
    ("UNSATISFIED",7),
    ("UNSATISFIED",9),
    ("VERY_UNSATISFIED",19)
;