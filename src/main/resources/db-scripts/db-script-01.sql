Create Database `UnivEducation`;

Use `UnivEducation`;

Create Table If Not Exists `Students` (
	student_id		int not null auto_increment,
    roll_number		varchar(12) not null,
    student_name	varchar(50) not null,
    date_of_birth	date not null,
    dept_code		varchar(2) not null,
    govt_id_number	varchar(16) not null,
    home_address	varchar(1000),
    hostel_address	varchar(250),
    phone_number	varchar(15) not null,
    parent_name		varchar(50),
    par_contact_num	varchar(15) not null,
    Primary Key (`student_id`)
);

Create Table If Not Exists `Departments` (
	dept_id					int auto_increment not null,
    dept_name				varchar(60) not null,
    dept_code				varchar(2) not null,
    programs_offered		varchar(1500) not null,
    time_of_foundation		date,
    research_areas			varchar(1500) not null,
    num_of_students			int not null,
    num_of_teaching_staffs	int not null,
    num_of_non_teaching_stf	int not null,
    Primary Key (`dept_id`)
);
    
Create Table If Not Exists `Accounts` (
	user_id			int auto_increment not null,
    user_name		varchar(15) not null,
    user_role		varchar(15) not null,
    Primary Key (`user_id`)
);

Create Table If Not Exists `Courses` (
	course_id		int auto_increment not null,
    course_code		varchar(10) not null,
    course_name		varchar(50) not null,
    course_credit	int not null,
    course_details	varchar(8000),
    dept_code		varchar(2) not null,
    semester_name	varchar(8),
    faculty_name	varchar(25) not null,
    Primary Key (`course_id`)
);

Create Table If Not Exists `ResearchAreas` (
	research_id			int auto_increment not null,
    res_code			varchar(6) not null,
    research_field		varchar(50) not null,
    dept_associated		varchar(100) not null,
    pub_this_year		int not null default 0,
    pub_last_year		int not null default 0,
    Primary Key (`research_id`)
);

Create Table If Not Exists `Publications` (
	publication_id	int auto_increment not null,
    pub_type		varchar(20) not null,
    journal_name	varchar(20) not null,
    pub_year		int not null,
    authors			varchar(100) not null,
    pub_extract		varchar(8000),
    web_link		varchar(100),
    res_code		varchar(6) not null,
    Primary Key (`publication_id`)
);

Alter table `students`
	Add CONSTRAINT `UNQ_ROLL_NO` UNIQUE (roll_number);
    
Alter table `departments`
	Add CONSTRAINT `UNQ_DEP_CODE` UNIQUE (dept_code);

Alter table `courses`
	Add CONSTRAINT `UNQ_COURSE_CODE` UNIQUE (course_code);

Alter table `students`
	Add CONSTRAINT `FK_DEP_CODE` FOREIGN KEY (dept_code)
    References `departments` (dept_code)
    On delete No action
    On Update No action ;
    
Alter table `publications`
	Add CONSTRAINT `FK_RES_CODE` FOREIGN KEY (res_code)
    References `ResearchAreas` (res_code);
