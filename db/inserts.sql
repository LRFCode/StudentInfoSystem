INSERT INTO Student (StudentId, studentName) values(1, 'Jeff Winger');
INSERT INTO Student (StudentId, studentName) values(2, 'Britta Perry');
INSERT INTO Student (StudentId, studentName) values(3, 'Abed Nadir');
INSERT INTO Student (StudentId, studentName) values(4, 'Troy Barnes');
INSERT INTO Student (StudentId, studentName) values(5, 'Annine Edison');
INSERT INTO Student (StudentId, studentName) values(6, 'Shirley Bennett');
INSERT INTO Student (StudentId, studentName) values(7, 'Pierce Hawthorne');
INSERT INTO Student (StudentId, studentName) values(8, 'Craig Pelton');
INSERT INTO Student (StudentId, studentName) values(9, 'Ben Chang');
INSERT INTO Student (StudentId, studentName) values(10, 'Richard Hendricks');
INSERT INTO Student (StudentId, studentName) values(11, 'Erlich Bachman');
INSERT INTO Student (StudentId, studentName) values(12, 'Jìng-Yáng');
INSERT INTO Student (StudentId, studentName) values(13, 'Bertram Gilfoyle');
INSERT INTO Student (StudentId, studentName) values(14, 'Jared Dunn');
INSERT INTO Student (StudentId, studentName) values(15, 'Anthony Scothorne');
INSERT INTO Student (StudentId, studentName) values(16, 'Monica Hall');
INSERT INTO Student (StudentId, studentName) values(17, 'Dinesh Chugtai');
INSERT INTO Student (StudentId, studentName) values(18, 'Laurie Bream');
INSERT INTO Student (StudentId, studentName) values(19, 'Carla Walton');
INSERT INTO Student (StudentId, studentName) values(20, 'Nelson Bighetti');
INSERT INTO Student (StudentId, studentName) values(21, 'Lucas Liddell');
INSERT INTO Student (StudentId, studentName) values(22, 'Caleb Stovall');
INSERT INTO Student (StudentId, studentName) values(23, 'Indigo Anderson-Moore');
INSERT INTO Student (StudentId, studentName) values(24, 'Ashley Ferguson');
INSERT INTO Student (StudentId, studentName) values(25, 'Rachel Larson');
INSERT INTO Student (StudentId, studentName) values(26, 'Mike Judge');
INSERT INTO Student (StudentId, studentName) values(27, 'Annie Kim');
INSERT INTO Student (StudentId, studentName) values(28, 'Vaughn Miller');
INSERT INTO Student (StudentId, studentName) values(29, 'Rich Stephenson');
INSERT INTO Student (StudentId, studentName) values(30, 'Dan Harmon');

INSERT INTO Teacher (TeacherId, teacherName) values(1, 'Allison Rubio');
INSERT INTO Teacher (TeacherId, teacherName) values(2, 'Louis Frederick');
INSERT INTO Teacher (TeacherId, teacherName) values(3, 'Mary Condit');
INSERT INTO Teacher (TeacherId, teacherName) values(4, 'Gavin Belson');
INSERT INTO Teacher (TeacherId, teacherName) values(5, 'Peter Gregory');

INSERT INTO Course (CourseId, courseName, teacherId) values (1, 'The Art of Discourse', 3);
INSERT INTO Course (CourseId, courseName, teacherId) values (2, 'Wedding Videography', 4);
INSERT INTO Course (CourseId, courseName, teacherId) values (3, 'Paradigms of Human Memory', 5);
INSERT INTO Course (CourseId, courseName, teacherId) values (4, 'Geography of Global Conflict', 5);
INSERT INTO Course (CourseId, courseName, teacherId) values (5, 'Remedial Chaos Theory', 3);
INSERT INTO Course (CourseId, courseName, teacherId) values (6, 'Competitive Ecology', 1);
INSERT INTO Course (CourseId, courseName, teacherId) values (7, 'To Build a Better Beta', 2);
INSERT INTO Course (CourseId, courseName, teacherId) values (8, 'Minimum Viable Product', 2);
INSERT INTO Course (CourseId, courseName, teacherId) values (9, 'Introduction to Finality', 4);
INSERT INTO Course (CourseId, courseName, teacherId) values (10, 'Paranormal Parentage', 1);
INSERT INTO Course (CourseId, courseName, teacherId) values (11, 'Conventions of Space and Time', 5);
INSERT INTO Course (CourseId, courseName, teacherId) values (12, 'Economics of Marine Biology', 4);
INSERT INTO Course (CourseId, courseName, teacherId) values (13, 'Maleant Data Systems Solutions', 2);
INSERT INTO Course (CourseId, courseName, teacherId) values (14, 'Heroic Origins', 1);
INSERT INTO Course (CourseId, courseName, teacherId) values (15, 'Advanced Introduction to Finality', 5);
INSERT INTO Course (CourseId, courseName, teacherId) values (16, 'Cooperative Polygraphy', 1);
INSERT INTO Course (CourseId, courseName, teacherId) values (17, 'Analysis of Cork-Based Networking', 3);
INSERT INTO Course (CourseId, courseName, teacherId) values (18, 'App Development and Condiments', 3);
INSERT INTO Course (CourseId, courseName, teacherId) values (19, 'Law of Robotics and Party Rights', 4);
INSERT INTO Course (CourseId, courseName, teacherId) values (20, 'Advanced Safety Features', 2);

--course values 1 - xx increment
--student values = 1 - 30
--courseid values = 1 - 20

--first class
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (1, 1, 1, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (2, 2, 2, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (3, 3, 3, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (4, 4, 4, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (5, 5, 5, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (6, 6, 6, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (7, 7, 7, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (8, 8, 8, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (9, 9, 9, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (10, 10, 10, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (11, 11, 11, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (12, 12, 12, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (13, 13, 13, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (14, 14, 14, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (15, 15, 15, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (16, 16, 16, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (17, 17, 17, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (18, 18, 18, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (19, 19, 19, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (20, 20, 20, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (21, 21, 1, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (22, 22, 2, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (23, 23, 3, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (24, 24, 4, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (25, 25, 5, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (26, 26, 6, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (27, 27, 7, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (28, 28, 8, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (29, 29, 9, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (30, 30, 10, 70);

--second class
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (1, 1, 11, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (2, 2, 12, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (3, 3, 13, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (4, 4, 14, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (5, 5, 15, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (6, 6, 16, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (7, 7, 17, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (8, 8, 18, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (9, 9, 19, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (10, 10, 20, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (11, 11, 1, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (12, 12, 2, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (13, 13, 3, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (14, 14, 4, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (15, 15, 5, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (16, 16, 6, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (17, 17, 7, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (18, 18, 8, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (19, 19, 9, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (20, 20, 10, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (21, 21, 11, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (22, 22, 12, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (23, 23, 13, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (24, 24, 14, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (25, 25, 15, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (26, 26, 16, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (27, 27, 17, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (28, 28, 18, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (29, 29, 19, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (30, 30, 20, 70);



INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (31, 31, 1, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (32, 1, 1, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (33, 1, 1, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (34, 1, 1, 70);
INSERT INTO Student Course(studentcourseId, studentid, courseid, 80)
VALUES (35, 1, 1, 70);



