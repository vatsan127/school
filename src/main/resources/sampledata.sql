INSERT INTO professor_info (professor_name, professor_domain)
VALUES ('Professor Smith', 'Computer Science'),
       ('Professor Johnson', 'Mathematics'),
       ('Professor Williams', 'Physics');


INSERT INTO student_info (id,name, age, degree, branch, address) VALUES (1,'SRIVATSAN', 22, 'B.Tech', 'ECE', '{"city": "TIRUVALLUR", "zip": "602001"}') ON CONFLICT DO NOTHING;
INSERT INTO student_info (id,name, age, degree, branch, address) VALUES (2,'HARISH', 22, 'B.Tech', 'CSE', '{"city": "TIRUVALLUR", "zip": "602001"}') ON CONFLICT DO NOTHING;
INSERT INTO student_info (id,name, age, degree, branch, address) VALUES (3,'VISHAL', 22, 'B.Tech', 'CIVIL', '{"city": "TIRUVALLUR", "zip": "602001"}') ON CONFLICT DO NOTHING;
INSERT INTO student_info (id,name, age, degree, branch, address) VALUES (4,'ROHITH', 22, 'B.Tech', 'EEE', '{"city": "TIRUVALLUR", "zip": "602001"}') ON CONFLICT DO NOTHING;
INSERT INTO student_info (id,name, age, degree, branch, address) VALUES (5,'SHAFI', 22, 'B.Tech', 'DATA SCIENCE', '{"city": "SALEM", "zip": "636061"}') ON CONFLICT DO NOTHING;
INSERT INTO student_info (id,name, age, degree, branch, address) VALUES (6,'SURIYA', 22, 'B.Tech', 'AI ML', '{"city": "TRICHY", "zip": "620001"}') ON CONFLICT DO NOTHING;

