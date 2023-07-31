Use univeducation;

INSERT INTO `univeducation`.`departments`
(dept_name, dept_code, programs_offered, time_of_foundation, 
research_areas,
num_of_students, num_of_teaching_staffs, num_of_non_teaching_stf)
VALUES
('Computer Science & Engineering',
'CS',
'BTech, MTech, Dual Degree, PhD, MS',
'1989-12-12',
'Artificial Intelligence, Machine Learning, Game Theory Application, High Performance Computer Architecture',
450, 40, 80);


Insert into `students` (
  roll_number, student_name, date_of_birth, dept_code, govt_id_number,
  home_address,
  hostel_address,
  phone_number, parent_name, par_contact_num )
Values (
    '01CS3002', 'Jayanta Mandal', '1982-10-16', 'CS', '120012008799',
    'Bagan Bari, Ranaghat, West Bengal',
    'RP Hall, Room D-336, Kharagpur',
    '9871368947', 'Mr Jitendra Nath', '03473211120'
);

Insert into `students` (
  roll_number, student_name, date_of_birth, dept_code, govt_id_number,
  home_address,
  hostel_address,
  phone_number, parent_name, par_contact_num )
Values (
    '01CS3003', 'Rahul Dev Singh', '1983-05-13', 'CS', '561290878799',
    'Bhillai, Chhattisgarh',
    'RP Hall, Room C-305, Kharagpur',
    '78713342247', 'Mr Birbal', '065621212'
);
