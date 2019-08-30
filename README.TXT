------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: Student information system

PURPOSE OF PROJECT:this system involves many different aspects of running a school or university
registration, grades, course scheduling, billing, records and so on.

VERSION or DATE: 0.1

HOW TO START THIS PROJECT:Run the unit test

AUTHORS:Edgar Alberto Flores Wehr

USER INSTRUCTIONS:Abstraction lets you concentrate on the important issues about a problem,
discarding the details.

Modularization: Organize de problem on smalller parts

The student information system is primarily about students, so as your first task 
you will abstract that real-world concept into its object-oriented 
representation. A candidate class might be Student. Student objects should 
contain basic information about a student such as name, identification number, and grades. 
You will concentrate on an even smaller concern first: 
Create a unique student object that stores the name of the student.

Schools have courses, such as Math 101 and Engl 200, that are taught every 
semester. Basic course information, such as the department, the number, 
the number of credits, and the description of the course, generally remains
the same from semester to semester.

You will define a CourseSession class that captures both the basic course 
information and the enrollment in the session. As long as you only need to 
work with the CourseSession objects for a single semester, 
no two CourseSessions should need to refer to the same course. Once two CourseSession 
objects must exist for the same course, having the basic course information 
stored in both CourseSession objects is redundant. For now, multiple sessions 
is not a consideration; later you will clean up 
the design to support multiple sessions for a single course.



