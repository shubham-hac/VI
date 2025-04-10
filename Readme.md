[03/04, 12:12] Renu N TCS: Your task is to design a system to manage record in the library. The system should involve two classes Author and Book. Author can have multiple books. Your task is to implement a solution that will maintain a list of Book objects within Author class and perform specific operations.

Class Author:

Attributes:

authorld (int)

authorName: (String)

nationality: (String)

books: (List of Book objects)

Class Book:

Attributes:

bookld: (int)

title: (String)

publishedYear: (int)

Methods:

getUniquePublished Year()

This method identifies and returns all the unique years (in Ascending Order) in which books were published by a particular author, ensuring that no duplicate years are included. This method takes two arguments: First argument is list of author

and second argument is authorld.

If no author is found then primessage that "Author Not Found"

getBooksByNationality()

This method retrieves all books written by authors of a specific nationality and returns a list of book titles.

This method takes two arguments: First argument is List of author objects and a Nationality.

If no books are found then print message that "Books Not Found".

These methods should be called from the main method.

Note:

You can use/refer the below given sample input and output to

verify your solution. Write the code for accepting the inputs and printing the outputs.

Don't use any static test or formatting for printing the result. Just invoke the method and print the result. (Refer Sample Test Case)

Consider below sample input and output to test your code:

Sample Input 1:

3

101

Yashwant

Indian

3

5001

Let Us C

2002

5002

Let Us Python

2019

5003

Let Us C Solution

2002

102

George Orwell

British

1

5004

Animal Farm

1945

103

Reema Thareja

Indian

2

5005

Programming in C

2011

5006

Data Structure using C

2012

101

Indian

Sample Output 1:

2002

2019

Let Us C

Let Us Python

Let Us C Solution

Programming in C

Data Structure using C

Sample Input 2:

0

1001

American

Sample Output 2: Author Not Found Books Not Found
[03/04, 12:12] Renu N TCS: Create a class called Employee with the below attributes:

employeeld - int
name - String
branch - String
rating - double
company Transport - boolean
The above attributes should be private. write getters, setters and parameterized constructor as required.

Create class MyClass with main method.
Implement two static methods findCountOfEmployeesUsingCompTransport and findEmployeeWithSecondHighestRating
in MyClass class.

findCountOfEmployeesUsingCompTransport method: 
----------------------------------------------
This method will take an array of Employee object and a String parameter as input parameters. 
This method will calculate and return the count of Employees who are all using company transport 
in the given branch (String parameter passed).
If no Employee in the given branch using company transport in the array of Employee objects, then 
the method should return 0.

findEmployeeWithSecondHighestRating method: 
--------------------------------------------
This method will take an array of Employee objects as an input parameter. This method will return 
the object of the second highest rating employee from the array of Employee objects who are not using 
company transport.
If all Employees using company transport in the array of Employee objects, then the method should return null.

Note: All the searches should be case sensitive, companyTransport and rating combination of each Employee 
is unique.
For findCountOfEmployeesUsingCompTransport method, The main method should print the returned count as it 
is if the returned value is greater than 0, else it should print "No such Employees".
Ex: 2 , where 2 is the count
For findEmployeeWithSecondHighestRating method: The main method should print the employeeld and name from 
the returned object if the returned value is not null. If the returned value is null, then it should 
print "All Employees using company transport".
Ex: 1003
    Uma
where 1003 is the employeeld and Uma is the name.
Before calling these static methods in main, use Scanner object to read the values of four Employee 
objects referring attributes in the above mentioned attributes sequence. Next, read the value of String
parameter for capturing branch.

Input : 

1001
Ashwa
IT
5
true
1002
Preeti
IT
4
true
1003
Uma
Admin
3
false
1004
Akash
Hardware
4.5
false
IT



Output : 

2
1003
Uma
[03/04, 12:12] Renu N TCS: Problem Statement:

Your task is to design a system to manage the records in a music library. The system should involve two classes: Artist and Album. An Artist can have multiple Albums. Your task is to implement a solution that will maintain a list of Album objects within the Artist class and perform specific operations.

Class Definitions:
Class Artist:

Attributes:

artistId: (int)
artistName: (String)
genre: (String)
albums: (List of Album objects)
Class Album:

Attributes:

albumId: (int)
albumTitle: (String)
releaseYear: (int)
Methods:
1. getAlbumsByYearRange()

This method retrieves all album titles released by a particular artist within a specified range of years (inclusive).

Parameters:

artists: List of Artist objects.
artistId: The ID of the artist for whom to retrieve albums.
startYear: The starting year of the range.
endYear: The ending year of the range.
Output:

Returns a list of album titles released within the specified year range.
If no albums are found within the range, print the message "No Albums Found in the Specified Year Range".
If no artist is found, print the message "Artist Not Found".
2. getGenresWithMostAlbums()

This method identifies and returns the genre that has the most albums released across all artists.

Parameters:

artists: List of Artist objects.
Output:

Returns the genre with the most albums.
If no albums are found, print the message "No Albums Found".
These methods should be called from the main method.

Sample Input 1:
yaml
Copy code
3
201
Adele
Pop
3
1001
21
2011
1002
25
2015
1003
30
2021
202
Taylor Swift
Pop
2
1004
1989
2014
1005
Red
2012
203
Linkin Park
Rock
2
1006
Hybrid Theory
2000
1007
Meteora
2003
201
2010
2020
Sample Output 1:
21
25
Red
------------
Pop
------------
Sample Input 2:
2
301
Jazz
Sample Output 2:
Artist Not Found
No Albums Found
[03/04, 12:12] Renu N TCS: Problem Statement: Phone Book Management System
You are required to implement a phone book management system that allows users to store, retrieve, and manage contacts. Each contact has a name, phone number, and email address.

Class Definitions:
Contact:

Attributes:
contactId (int): Unique ID for each contact.
name (String): The name of the contact.
phoneNumber (String): The phone number of the contact.
email (String): The email address of the contact.
PhoneBook:

Contains a list of contacts and supports the following operations:
Methods:
searchByName():

This method takes the name of the contact and searches for all contacts with a matching name (case-insensitive). If no contact is found, print "No contact found with the given name."
Parameters:
name (String): Name of the contact to search.
Output:
Returns a list of contacts with matching names or a message if no contacts are found.
addContact():

This method adds a new contact to the phone book. If a contact with the same phone number already exists, the contact is not added, and a message "Duplicate phone number found" is printed.
Parameters:
Contact object: Contact to be added.
Output:
The method prints "Contact added successfully" or "Duplicate phone number found."
deleteContact():

This method deletes a contact by the phone number. If the contact is not found, print "Contact not found."
Parameters:
phoneNumber (String): The phone number of the contact to be deleted.
Output:
The method prints "Contact deleted successfully" or "Contact not found."
sortContactsByName():

This method sorts all contacts alphabetically by their names.
Output:
The sorted list of contacts, with each contact's name, phone number, and email.
Example Input:
perl
Copy code
addContact(1, "Alice", "1234567890", "alice@gmail.com")
addContact(2, "Bob", "0987654321", "bob@gmail.com")
addContact(3, "Alice", "1122334455", "alice123@yahoo.com")
searchByName("Alice")
deleteContact("1234567890")
sortContactsByName()
Example Output:
yaml
Copy code
Contact added successfully
Contact added successfully
Contact added successfully
Found contacts:
Name: Alice, Phone: 1234567890, Email: alice@gmail.com
Name: Alice, Phone: 1122334455, Email: alice123@yahoo.com
Contact deleted successfully
Sorted contacts:
Name: Alice, Phone: 1122334455, Email: alice123@yahoo.com
Name: Bob, Phone: 0987654321, Email: bob@gmail.com
Constraints:
The phone number is assumed to be unique for each contact.
The phone book can contain a maximum of 100 contacts.
[03/04, 12:12] Renu N TCS: Question 1: Hospital Management System
Design a system to manage records of doctors and patients in a hospital. The system should involve two classes: Doctor and Patient. A doctor can have multiple patients. Your task is to implement a solution that will maintain a list of Patient objects within the Doctor class and perform specific operations.

Class Doctor:
Attributes:

doctorId (int)
doctorName (String)
specialization (String)
patients (List of Patient objects)
Class Patient:
Attributes:

patientId (int)
patientName (String)
illness (String)
Methods in Doctor Class:
getUniqueIllnesses()

This method identifies and returns all unique illnesses that patients of a particular doctor are suffering from, sorted alphabetically. It takes two arguments: a list of doctor objects and doctorId. If no doctor is found, print "Doctor Not Found".
getDoctorsBySpecialization()

This method retrieves all doctors with a specific specialization and returns a list of their names. It takes two arguments: a list of doctor objects and the specialization. If no doctors are found, print "No Doctors Found".
Sample Input 1:

plaintext
Copy code
2
101
Dr. Smith
Cardiology
3
201
Alice
Heart Disease
202
Bob
Arrhythmia
203
Charlie
Heart Disease
102
Dr. Jones
Neurology
2
204
David
Migraine
205
Eve
Seizure
101
Cardiology
Sample Output 1:

plaintext
Copy code
Arrhythmia
Heart Disease
Dr. Smith
Sample Input 2:

plaintext
Copy code
1
103
Dr. Adams
Pediatrics
1
206
Frank
Asthma
104
Orthopedics
Sample Output 2:

plaintext
Copy code
Doctor Not Found
No Doctors Found
[03/04, 12:12] Renu N TCS: Class Customer:
Attributes:

customerId (int)
customerName (String)
email (String)
orders (List of Order objects)
Class Order:
Attributes:

orderId (int)
productName (String)
quantity (int)
Methods in Customer Class:
getTotalOrderCount()

This method calculates and returns the total number of unique orders placed by a customer. It takes two arguments: a list of customer objects and customerId. If no customer is found, print "Customer Not Found".
getCustomersByProduct()

This method retrieves all customers who have ordered a specific product and returns a list of their names. It takes two arguments: a list of customer objects and the product name. If no customers are found, print "No Customers Found".
Sample Input 1:
2
201
Alice
alice@example.com
2
101
Laptop
1
102
Mouse
2
202
Bob
bob@example.com
3
103
Keyboard
1
104
Monitor
2
105
Laptop
1
201
Laptop
Sample Output 1:
2
Alice
Bob
Sample Input 2:
1
203
Charlie
charlie@example.com
1
106
Printer
3
201
Tablet
Sample Output 2:
Customer Not Found
No Customers Found
*/
[03/04, 12:12] Renu N TCS: Question 3: Library Management System with Genre
Design a system to manage records of books and genres in a library. The system should involve two classes: Genre and Book. A genre can have multiple books. Your task is to implement a solution that will maintain a list of Book objects within the Genre class and perform specific operations.

Class Genre:
Attributes:

genreId (int)
genreName (String)
books (Map of book ID to Book objects)
Class Book:
Attributes:

bookId (int)
title (String)
authorName (String)
Methods in Genre Class:
getBooksByAuthor()

This method retrieves and returns a list of book titles written by a specific author within a genre, sorted alphabetically. It takes three arguments: a list of genre objects, genreId, and the authorName. If no genre is found, print "Genre Not Found". If no books are found by the author, print "No Books Found".
getGenresByBookId()

This method finds all genres that contain a specific book ID and returns a list of genre names. It takes two arguments: a list of genre objects and the bookId. If no genres are found containing the book, print "No Genres Found".
Sample Input 1:
2
101
Fiction
3
501
The Great Gatsby
F. Scott Fitzgerald
502
1984
George Orwell
503
To Kill a Mockingbird
Harper Lee
102
Non-Fiction
2
504
Sapiens
Yuval Noah Harari
505
Educated
Tara Westover
101
F. Scott Fitzgerald
502
Sample Output 1:
The Great Gatsby
Fiction

Sample Input 2:
1
103
Science Fiction
1
506
Dune
Frank Herbert
507

Sample Output 2:
Genre Not Found
No Genres Found
*/
[03/04, 12:12] Renu N TCS: Class student 
Attributes
Id,name,subject,grade
Method 1 - studentswithAverageaboveThreshold - return list of students with average grade higher than average
2. Students with maximum unique grades
Take students list as argument for both methods
Return studetns with maximum unique grades

Imput 
3
101
Abc
2
Physics
78
Maths
99
102
Xyz
3
Chem
80
Maths
80
Physics
73
103
Dfg
4
Physics
67
Chem
67
Maths
67
PRA1
67
70
Output
Abc,xyz
Abc,xyz
[03/04, 12:12] Renu N TCS: Here’s a different scenario that still involves Java classes, methods, and collections, but in a new context:

---

### Problem Statement:

**Library Management System**

Design a `Book` class that keeps track of each book's ISBN (International Standard Book Number), title, author, and the list of reviews given by readers. Implement two methods in the `Library` class to process books:

1. **booksWithAverageReviewAboveThreshold(List<Book> books, double threshold)**:
   - This method should return a list of book titles whose average review rating is greater than the specified threshold.
  
2. **booksWithMostUniqueReviewers(List<Book> books)**:
   - This method should return a list of book titles that have been reviewed by the highest number of unique reviewers.
  
Your program should:
- Accept input for a list of books, each having an ISBN, title, author, and multiple reviews.
- For each book, reviews consist of the reviewer’s name and the review rating they give (1-5).
- The program should then ask for a threshold value to return the list of books with an average review rating above this threshold.
- It should also return the list of books with the highest number of unique reviewers.

**Input**:
- The first line contains an integer `n`, the number of books.
- For each book:
    - A string `ISBN`.
    - A string `title`.
    - A string `author`.
    - An integer `m` representing the number of reviews the book has received.
    - For the next `m` lines, a string `reviewerName` and an integer `reviewRating` (1-5).
- The next line contains a double `threshold`, representing the average review threshold.

**Output**:
- List of book titles with average review ratings above the threshold.
- List of book titles with the highest number of unique reviewers.

---

### Example:

**Input**:
```
3
978-3-16-148410-0
The Great Adventure
John Smith
3
Alice
5
Bob
4
Alice
3
978-1-86197-876-9
Mystery in the Night
Jane Doe
2
Carol
5
Dave
4
978-0-14-044913-6
The Art of War
Sun Tzu
3
Eve
4
Alice
4
Frank
5
4.0
```

**Output**:
```
Books with average review rating above threshold:
Mystery in the Night
The Art of War

Books with the most unique reviewers:
The Art of War
```

**Explanation**:
- "The Great Adventure" has reviews by Alice (twice) and Bob, but only Bob's review is unique. Its average review rating is (5 + 4 + 3) / 3 = 4.0, so it’s equal to the threshold.
- "Mystery in the Night" has reviews by Carol and Dave with an average of (5 + 4) / 2 = 4.5, which is above the threshold.
- "The Art of War" has reviews by Eve, Alice, and Frank, with an average of (4 + 4 + 5) / 3 = 4.33, which is also above the threshold and has the most unique reviewers.

---

### Problem Focus:
This problem emphasizes:
- Handling a `Book` class with attributes like ISBN, title, author, and a list of reviews.
- Managing collections (using `HashMap`, `List`, and `Set`).
- Working with reviewer names to find unique reviewers and calculating averages.
[03/04, 12:12] Renu N TCS: *
Class Flight:
Attributes:

flightId (int)
flightNumber (String)
destination (String)
passengers (List of Passenger objects)
Class Passenger:
Attributes:

passengerId (int)
passengerName (String)
seatNumber (String)

Methods in Flight Class:
getPassengerNames()

This method retrieves and returns a sorted list of passenger names on a flight. It takes two arguments: a list of flight objects and flightId. If no flight is found, print "Flight Not Found".
getFlightsByDestination()

This method retrieves all flights going to a specific destination and returns a list of their flight numbers. It takes two arguments: a list of flight objects and the destination. If no flights are found, print "No Flights Found".
Sample Input 1:
2
301
Flight001
New York
2
401
John Doe
12A
402
Jane Doe
12B
302
Flight002
Los Angeles
1
403
Alice Smith
14C
301
New York
Sample Output 1:
Jane Doe
John Doe
Flight001
Sample Input 2:
1
303
Flight003
Chicago
1
404
Bob Brown
16D
304
Miami
Sample Output 2:
Flight Not Found
No Flights Found
*/
[03/04, 12:12] Renu N TCS: Problem 2: Student Course Enrollment
Objective: Create a system to manage student course enrollments in a university. The system should involve two classes: Course and University. A University can have multiple Course objects stored in a HashMap where the key is the course code, and the value is a Course object.

Classes:

Class Course:
Attributes:
courseCode (String)
courseName (String)
instructor (String)
enrolledStudents (HashSet of student names)
Class University:
Attributes:
universityName (String)
courses (HashMap of course codes to Course objects)
Methods:
getCoursesByInstructor(String instructor): Retrieve a HashSet of course names taught by a given instructor.
getStudentsEnrolledInCourse(String courseCode): Retrieve a HashSet of student names enrolled in a given course.
getCoursesWithStudentCount(): Retrieve a HashMap where each key is a course name and the value is the number of students enrolled.
Example Input:

University name: "Tech University"
Courses:
CourseCode: "CS101", CourseName: "Introduction to Computer Science", Instructor: "Dr. Smith", EnrolledStudents: {"Alice", "Bob", "Charlie"}
CourseCode: "MA102", CourseName: "Calculus I", Instructor: "Dr. Jones", EnrolledStudents: {"Alice", "David"}
CourseCode: "CS102", CourseName: "Data Structures", Instructor: "Dr. Smith", EnrolledStudents: {"Charlie", "Eve"}
[03/04, 12:12] Renu N TCS: Create a class named "Employee" with the following attributes:

id (int)
name (String)
designation (String)
salary (double)

The above attributes should be private, and the class should have a parameterized constructor to initialize them.

Implement the following methods in the Employee class:

getSalary(): This method should return the salary of the employee.
getDesignation(): This method should return the designation of the employee.

Create a class named "Company" with the following attributes:

companyName (String)
employees (Employee array)
numEmployees (int)

The above attributes should be private, and the class should have a parameterized constructor to initialize them.

Implement the following methods in the Company class:

getAverageSalary(): This method should return the average salary of all the employees in the company.
getMaxSalary(): This method should return the highest salary of all the employees in the company.
getEmployeesByDesignation(String designation): This method should return an array of all employees with the given designation.

In the main method, use a Scanner object to read the values of the company name, number of employees, and the employee details 
(id, name, designation, and salary) in a loop. Once all employee details have been read, create a Company object and pass the 
appropriate parameters. Finally, call the three methods mentioned above and print the output.

Note:

All searches should be case-insensitive.
You may assume that the input is valid and in the correct format.

Sample input:
---------------------
Enter company name: ABC Company
Enter number of employees: 3
Enter employee details:
Employee 1:
Enter id: 101
Enter name: John Smith
Enter designation: Manager
Enter salary: 5000
Employee 2:
Enter id: 102
Enter name: Jane Doe
Enter designation: Engineer
Enter salary: 4000
Employee 3:
Enter id: 103
Enter name: Bob Johnson
Enter designation: Engineer
Enter salary: 4500

Sample Output:
--------------------
Average salary: 4500.0
Max salary: 5000.0
Employees with designation: Engineer
ID: 102, Name: Jane Doe, Designation: Engineer, Salary: 4000.0
ID: 103, Name: Bob Johnson, Designation: Engineer, Salary: 4500.0
[03/04, 12:12] Renu N TCS: Here’s a similar problem with a focus on a **Gym Membership Management System** using a similar structure to the "Student Course Enrollment" system you described.

---

### **Problem 2: Gym Membership Management**
**Objective**: Design and implement a system to manage gym memberships and track class enrollments. The system should involve two main classes: **GymClass** and **Gym**. A Gym can have multiple GymClass objects stored in a `HashMap`, where the key is the class code and the value is a GymClass object.

---

### **Classes**:

#### **Class GymClass**:
**Attributes**:
- `String classCode`: The unique code for the gym class.
- `String className`: The name of the gym class (e.g., "Yoga", "Strength Training").
- `String instructor`: The name of the instructor teaching the class.
- `HashSet<String> enrolledMembers`: A set of gym member names who are enrolled in the class.

#### **Class Gym**:
**Attributes**:
- `String gymName`: The name of the gym.
- `HashMap<String, GymClass> gymClasses`: Stores the gym classes, where the key is the class code and the value is a `GymClass` object.

**Methods**:
- `HashSet<String> getClassesByInstructor(String instructor)`: Retrieve a `HashSet` of class names taught by a given instructor.
- `HashSet<String> getMembersEnrolledInClass(String classCode)`: Retrieve a `HashSet` of gym member names enrolled in a given class.
- `HashMap<String, Integer> getClassEnrollmentCount()`: Retrieve a `HashMap` where each key is a class name, and the value is the number of members enrolled.

---

### **Example Input**:

**Gym name**: "FitLife Gym"

**Gym Classes**:
1. **ClassCode**: "Y101", **ClassName**: "Yoga", **Instructor**: "John Doe", **EnrolledMembers**: {"Emily", "Mike", "Sara"}
2. **ClassCode**: "ST102", **ClassName**: "Strength Training", **Instructor**: "Jane Smith", **EnrolledMembers**: {"Sara", "Jake"}
3. **ClassCode**: "Z103", **ClassName**: "Zumba", **Instructor**: "John Doe", **EnrolledMembers**: {"Emily", "Lucy", "Jake"}

---

### **Expected Operations**:

- Retrieve all classes taught by a specific instructor, e.g., all classes taught by "John Doe".
- Retrieve the list of gym members enrolled in a specific class, e.g., members in the "Yoga" class.
- Retrieve a summary of classes with the number of enrolled members for each class.

---

### **Example Output**:

```java
// Classes taught by "John Doe":
Classes taught by John Doe: Yoga, Zumba

// Members enrolled in "Yoga" class:
Members in Yoga class: Emily, Mike, Sara

// Class enrollment count:
Yoga: 3 members
Strength Training: 2 members
Zumba: 3 members
```

---

### **Guidelines**:
- Use `HashSet` to store gym members enrolled in each class to avoid duplicate enrollments.
- Use `HashMap` to store the collection of `GymClass` objects in the `Gym`.
- Implement the methods to retrieve classes by instructor, enrolled members, and class enrollment counts.
[03/04, 12:12] Renu N TCS: Here’s a different scenario that still involves Java classes, methods, and collections, but in a new context:

---

### Problem Statement:

**Library Management System**

Design a `Book` class that keeps track of each book's ISBN (International Standard Book Number), title, author, and the list of reviews given by readers. Implement two methods in the `Library` class to process books:

1. **booksWithAverageReviewAboveThreshold(List<Book> books, double threshold)**:
   - This method should return a list of book titles whose average review rating is greater than the specified threshold.
  
2. **booksWithMostUniqueReviewers(List<Book> books)**:
   - This method should return a list of book titles that have been reviewed by the highest number of unique reviewers.
  
Your program should:
- Accept input for a list of books, each having an ISBN, title, author, and multiple reviews.
- For each book, reviews consist of the reviewer’s name and the review rating they give (1-5).
- The program should then ask for a threshold value to return the list of books with an average review rating above this threshold.
- It should also return the list of books with the highest number of unique reviewers.

**Input**:
- The first line contains an integer `n`, the number of books.
- For each book:
    - A string `ISBN`.
    - A string `title`.
    - A string `author`.
    - An integer `m` representing the number of reviews the book has received.
    - For the next `m` lines, a string `reviewerName` and an integer `reviewRating` (1-5).
- The next line contains a double `threshold`, representing the average review threshold.

**Output**:
- List of book titles with average review ratings above the threshold.
- List of book titles with the highest number of unique reviewers.

---

### Example:

**Input**:
```
3
978-3-16-148410-0
The Great Adventure
John Smith
3
Alice
5
Bob
4
Alice
3
978-1-86197-876-9
Mystery in the Night
Jane Doe
2
Carol
5
Dave
4
978-0-14-044913-6
The Art of War
Sun Tzu
3
Eve
4
Alice
4
Frank
5
4.0
```

**Output**:
```
Books with average review rating above threshold:
Mystery in the Night
The Art of War

Books with the most unique reviewers:
The Art of War
```

**Explanation**:
- "The Great Adventure" has reviews by Alice (twice) and Bob, but only Bob's review is unique. Its average review rating is (5 + 4 + 3) / 3 = 4.0, so it’s equal to the threshold.
- "Mystery in the Night" has reviews by Carol and Dave with an average of (5 + 4) / 2 = 4.5, which is above the threshold.
- "The Art of War" has reviews by Eve, Alice, and Frank, with an average of (4 + 4 + 5) / 3 = 4.33, which is also above the threshold and has the most unique reviewers.

---

### Problem Focus:
This problem emphasizes:
- Handling a `Book` class with attributes like ISBN, title, author, and a list of reviews.
- Managing collections (using `HashMap`, `List`, and `Set`).
- Working with reviewer names to find unique reviewers and calculating averages.
[03/04, 12:12] Renu N TCS: 2. Associate - Collections

Create a class Associate with the following private attributes

empid-int

name-String

experience-int

salary-double

Include a constructor and required getter and setter methods.

In a separate Solution class with the main method, implement the following static methods

SearchAssociatesByName:

This method should take collection of Associate objects and name (String) as parameters and returns a collection of Associate objects if the associates are found with the given name.

If the returning collection is not empty then return collection of Associate objects or else, return null

getAverage SalaryByExperience:

This method should take collection of Associate objects and experience (int) as parameters and returns double value of average of employee salaries with given experience.

if no associate found with the given experience, then return 0

The above static methods should be called from the main method.

For SearchAssociatesByName: This main method should print the collection of Associate objects (empid, name, experience, salary) if returned collection is not null or else, print "No associate found with given name.



For getAverageSalaryByExperience: This main method should print the average value of salaries if returned double value is not equals to 0 or else, print "No associate found with given experience".

Before calling the static methods in the main method, use the scanner object to read value for no.of

Associate objects to be created, then read empid, name, experience, salary for each Associate object. Next, read one String and Integer values for capturing the name and experience of associate.

Constraints:

• Duplicate Associate objects are allowed and should follow insertion order.

String search should be in case-insensitive
[03/04, 12:12] Renu N TCS: You are tasked with designing a system to manage and
analyze employee performance data in a company. The
system involves two classes:
Class Employee:
Attributes:
- employeeld (int)
- employeeName (String)
- companyName (String)
- projectCount (int)
- projectList (List of Project objects)
Class Project:
Attributes:
- projectName (String): Name of the project.
- rating (int): Employee Rating for that project.
Task-1:
Write a method that identifies and returns all unique
ratings that an employee has received, ensuring that no
duplicate ratings are included.
This method takes two arguments: a list of Employees and
employeeld as an argument and returns the distinct
project ratings received by the employee, eliminating any
duplicates.
If the employeeld does not exist, the method should print
"No Employee Found."
Task-2:
This method calculates the average project ratings for each
employee and identifies those whose average is above a
given threshold.
This method takes two arguments: a list of Employees and
an integer threshold.
The method should return a list of employee names who
have an average rating above the specified threshold.
If no such employees exist, the method should print "No
Employee Found."
Note:
You can use/refer to the below-given sample input and
output to verify your solution.
Write the code for accepting the inputs and printing the
outputs. Don't use any static test or formatting for printing
the result. Just invoke the method and print the result.

Sample Input 1:
2
1001
John
Google
3
Search
88
Ads
92
Maps
88
1002
Alice
Amazon
1
AWS
93
1001
88
90

Sample Output 1:
88
92
John
Alice

Sample Input 2:
2
1001
Raj
TCS
2
Al
80
CRM
85
1002
Meera
Infosys
Marketing
75
10001
90
Sample Output 2:
No Employee Found
No Employee Found
[09/04, 14:10] kaustubh Jagtap TCS: Class student 
Attributes
Id,name,subject,grade
Method 1 - studentswithAverageaboveThreshold - return list of students with average grade higher than average
2. Students with maximum unique grades
Take students list as argument for both methods
Return studetns with maximum unique grades

Imput 
3
101
Abc
2
Physics
78
Maths
99
102
Xyz
3
Chem
80
Maths
80
Physics
73
103
Dfg
4
Physics
67
Chem
67
Maths
67
PRA1
67
70
Output
Abc,xyz
Abc,xyz
[09/04, 14:10] kaustubh Jagtap TCS: Problem Statement: Phone Book Management System
You are required to implement a phone book management system that allows users to store, retrieve, and manage contacts. Each contact has a name, phone number, and email address.

Class Definitions:
Contact:

Attributes:
contactId (int): Unique ID for each contact.
name (String): The name of the contact.
phoneNumber (String): The phone number of the contact.
email (String): The email address of the contact.
PhoneBook:

Contains a list of contacts and supports the following operations:
Methods:
searchByName():

This method takes the name of the contact and searches for all contacts with a matching name (case-insensitive). If no contact is found, print "No contact found with the given name."
Parameters:
name (String): Name of the contact to search.
Output:
Returns a list of contacts with matching names or a message if no contacts are found.
addContact():

This method adds a new contact to the phone book. If a contact with the same phone number already exists, the contact is not added, and a message "Duplicate phone number found" is printed.
Parameters:
Contact object: Contact to be added.
Output:
The method prints "Contact added successfully" or "Duplicate phone number found."
deleteContact():

This method deletes a contact by the phone number. If the contact is not found, print "Contact not found."
Parameters:
phoneNumber (String): The phone number of the contact to be deleted.
Output:
The method prints "Contact deleted successfully" or "Contact not found."
sortContactsByName():

This method sorts all contacts alphabetically by their names.
Output:
The sorted list of contacts, with each contact's name, phone number, and email.
Example Input:
perl
Copy code
addContact(1, "Alice", "1234567890", "alice@gmail.com")
addContact(2, "Bob", "0987654321", "bob@gmail.com")
addContact(3, "Alice", "1122334455", "alice123@yahoo.com")
searchByName("Alice")
deleteContact("1234567890")
sortContactsByName()
Example Output:
yaml
Copy code
Contact added successfully
Contact added successfully
Contact added successfully
Found contacts:
Name: Alice, Phone: 1234567890, Email: alice@gmail.com
Name: Alice, Phone: 1122334455, Email: alice123@yahoo.com
Contact deleted successfully
Sorted contacts:
Name: Alice, Phone: 1122334455, Email: alice123@yahoo.com
Name: Bob, Phone: 0987654321, Email: bob@gmail.com
Constraints:
The phone number is assumed to be unique for each contact.
The phone book can contain a maximum of 100 contacts.
[09/04, 14:10] kaustubh Jagtap TCS: Your task is to design a system to manage record in the library. The system should involve two classes Author and Book. Author can have multiple books. Your task is to implement a solution that will maintain a list of Book objects within Author class and perform specific operations.

Class Author:

Attributes:

authorld (int)

authorName: (String)

nationality: (String)

books: (List of Book objects)

Class Book:

Attributes:

bookld: (int)

title: (String)

publishedYear: (int)

Methods:

getUniquePublished Year()

This method identifies and returns all the unique years (in Ascending Order) in which books were published by a particular author, ensuring that no duplicate years are included. This method takes two arguments: First argument is list of author

and second argument is authorld.

If no author is found then primessage that "Author Not Found"

getBooksByNationality()

This method retrieves all books written by authors of a specific nationality and returns a list of book titles.

This method takes two arguments: First argument is List of author objects and a Nationality.

If no books are found then print message that "Books Not Found".

These methods should be called from the main method.

Note:

You can use/refer the below given sample input and output to

verify your solution. Write the code for accepting the inputs and printing the outputs.

Don't use any static test or formatting for printing the result. Just invoke the method and print the result. (Refer Sample Test Case)

Consider below sample input and output to test your code:

Sample Input 1:

3

101

Yashwant

Indian

3

5001

Let Us C

2002

5002

Let Us Python

2019

5003

Let Us C Solution

2002

102

George Orwell

British

1

5004

Animal Farm

1945

103

Reema Thareja

Indian

2

5005

Programming in C

2011

5006

Data Structure using C

2012

101

Indian

Sample Output 1:

2002

2019

Let Us C

Let Us Python

Let Us C Solution

Programming in C

Data Structure using C

Sample Input 2:

0

1001

American

Sample Output 2: Author Not Found Books Not Found
[09/04, 14:10] kaustubh Jagtap TCS: Create a class called Employee with the below attributes:

employeeld - int
name - String
branch - String
rating - double
company Transport - boolean
The above attributes should be private. write getters, setters and parameterized constructor as required.

Create class MyClass with main method.
Implement two static methods findCountOfEmployeesUsingCompTransport and findEmployeeWithSecondHighestRating
in MyClass class.

findCountOfEmployeesUsingCompTransport method: 
----------------------------------------------
This method will take an array of Employee object and a String parameter as input parameters. 
This method will calculate and return the count of Employees who are all using company transport 
in the given branch (String parameter passed).
If no Employee in the given branch using company transport in the array of Employee objects, then 
the method should return 0.

findEmployeeWithSecondHighestRating method: 
--------------------------------------------
This method will take an array of Employee objects as an input parameter. This method will return 
the object of the second highest rating employee from the array of Employee objects who are not using 
company transport.
If all Employees using company transport in the array of Employee objects, then the method should return null.

Note: All the searches should be case sensitive, companyTransport and rating combination of each Employee 
is unique.
For findCountOfEmployeesUsingCompTransport method, The main method should print the returned count as it 
is if the returned value is greater than 0, else it should print "No such Employees".
Ex: 2 , where 2 is the count
For findEmployeeWithSecondHighestRating method: The main method should print the employeeld and name from 
the returned object if the returned value is not null. If the returned value is null, then it should 
print "All Employees using company transport".
Ex: 1003
    Uma
where 1003 is the employeeld and Uma is the name.
Before calling these static methods in main, use Scanner object to read the values of four Employee 
objects referring attributes in the above mentioned attributes sequence. Next, read the value of String
parameter for capturing branch.

Input : 

1001
Ashwa
IT
5
true
1002
Preeti
IT
4
true
1003
Uma
Admin
3
false
1004
Akash
Hardware
4.5
false
IT



Output : 

2
1003
Uma
[09/04, 14:11] kaustubh Jagtap TCS: *
Class Flight:
Attributes:

flightId (int)
flightNumber (String)
destination (String)
passengers (List of Passenger objects)
Class Passenger:
Attributes:

passengerId (int)
passengerName (String)
seatNumber (String)

Methods in Flight Class:
getPassengerNames()

This method retrieves and returns a sorted list of passenger names on a flight. It takes two arguments: a list of flight objects and flightId. If no flight is found, print "Flight Not Found".
getFlightsByDestination()

This method retrieves all flights going to a specific destination and returns a list of their flight numbers. It takes two arguments: a list of flight objects and the destination. If no flights are found, print "No Flights Found".
Sample Input 1:
2
301
Flight001
New York
2
401
John Doe
12A
402
Jane Doe
12B
302
Flight002
Los Angeles
1
403
Alice Smith
14C
301
New York
Sample Output 1:
Jane Doe
John Doe
Flight001
Sample Input 2:
1
303
Flight003
Chicago
1
404
Bob Brown
16D
304
Miami
Sample Output 2:
Flight Not Found
No Flights Found
*/
[09/04, 14:11] kaustubh Jagtap TCS: Question 3: Library Management System with Genre
Design a system to manage records of books and genres in a library. The system should involve two classes: Genre and Book. A genre can have multiple books. Your task is to implement a solution that will maintain a list of Book objects within the Genre class and perform specific operations.

Class Genre:
Attributes:

genreId (int)
genreName (String)
books (Map of book ID to Book objects)
Class Book:
Attributes:

bookId (int)
title (String)
authorName (String)
Methods in Genre Class:
getBooksByAuthor()

This method retrieves and returns a list of book titles written by a specific author within a genre, sorted alphabetically. It takes three arguments: a list of genre objects, genreId, and the authorName. If no genre is found, print "Genre Not Found". If no books are found by the author, print "No Books Found".
getGenresByBookId()

This method finds all genres that contain a specific book ID and returns a list of genre names. It takes two arguments: a list of genre objects and the bookId. If no genres are found containing the book, print "No Genres Found".
Sample Input 1:
2
101
Fiction
3
501
The Great Gatsby
F. Scott Fitzgerald
502
1984
George Orwell
503
To Kill a Mockingbird
Harper Lee
102
Non-Fiction
2
504
Sapiens
Yuval Noah Harari
505
Educated
Tara Westover
101
F. Scott Fitzgerald
502
Sample Output 1:
The Great Gatsby
Fiction

Sample Input 2:
1
103
Science Fiction
1
506
Dune
Frank Herbert
507

Sample Output 2:
Genre Not Found
No Genres Found
*/
[09/04, 14:11] kaustubh Jagtap TCS: Problem Statement:

Your task is to design a system to manage the records in a music library. The system should involve two classes: Artist and Album. An Artist can have multiple Albums. Your task is to implement a solution that will maintain a list of Album objects within the Artist class and perform specific operations.

Class Definitions:
Class Artist:

Attributes:

artistId: (int)
artistName: (String)
genre: (String)
albums: (List of Album objects)
Class Album:

Attributes:

albumId: (int)
albumTitle: (String)
releaseYear: (int)
Methods:
1. getAlbumsByYearRange()

This method retrieves all album titles released by a particular artist within a specified range of years (inclusive).

Parameters:

artists: List of Artist objects.
artistId: The ID of the artist for whom to retrieve albums.
startYear: The starting year of the range.
endYear: The ending year of the range.
Output:

Returns a list of album titles released within the specified year range.
If no albums are found within the range, print the message "No Albums Found in the Specified Year Range".
If no artist is found, print the message "Artist Not Found".
2. getGenresWithMostAlbums()

This method identifies and returns the genre that has the most albums released across all artists.

Parameters:

artists: List of Artist objects.
Output:

Returns the genre with the most albums.
If no albums are found, print the message "No Albums Found".
These methods should be called from the main method.

Sample Input 1:
yaml
Copy code
3
201
Adele
Pop
3
1001
21
2011
1002
25
2015
1003
30
2021
202
Taylor Swift
Pop
2
1004
1989
2014
1005
Red
2012
203
Linkin Park
Rock
2
1006
Hybrid Theory
2000
1007
Meteora
2003
201
2010
2020
Sample Output 1:
21
25
Red
------------
Pop
------------
Sample Input 2:
2
301
Jazz
Sample Output 2:
Artist Not Found
No Albums Found
[09/04, 14:11] kaustubh Jagtap TCS: Here’s a similar problem with a focus on a **Gym Membership Management System** using a similar structure to the "Student Course Enrollment" system you described.

---

### **Problem 2: Gym Membership Management**
**Objective**: Design and implement a system to manage gym memberships and track class enrollments. The system should involve two main classes: **GymClass** and **Gym**. A Gym can have multiple GymClass objects stored in a `HashMap`, where the key is the class code and the value is a GymClass object.

---

### **Classes**:

#### **Class GymClass**:
**Attributes**:
- `String classCode`: The unique code for the gym class.
- `String className`: The name of the gym class (e.g., "Yoga", "Strength Training").
- `String instructor`: The name of the instructor teaching the class.
- `HashSet<String> enrolledMembers`: A set of gym member names who are enrolled in the class.

#### **Class Gym**:
**Attributes**:
- `String gymName`: The name of the gym.
- `HashMap<String, GymClass> gymClasses`: Stores the gym classes, where the key is the class code and the value is a `GymClass` object.

**Methods**:
- `HashSet<String> getClassesByInstructor(String instructor)`: Retrieve a `HashSet` of class names taught by a given instructor.
- `HashSet<String> getMembersEnrolledInClass(String classCode)`: Retrieve a `HashSet` of gym member names enrolled in a given class.
- `HashMap<String, Integer> getClassEnrollmentCount()`: Retrieve a `HashMap` where each key is a class name, and the value is the number of members enrolled.

---

### **Example Input**:

**Gym name**: "FitLife Gym"

**Gym Classes**:
1. **ClassCode**: "Y101", **ClassName**: "Yoga", **Instructor**: "John Doe", **EnrolledMembers**: {"Emily", "Mike", "Sara"}
2. **ClassCode**: "ST102", **ClassName**: "Strength Training", **Instructor**: "Jane Smith", **EnrolledMembers**: {"Sara", "Jake"}
3. **ClassCode**: "Z103", **ClassName**: "Zumba", **Instructor**: "John Doe", **EnrolledMembers**: {"Emily", "Lucy", "Jake"}

---

### **Expected Operations**:

- Retrieve all classes taught by a specific instructor, e.g., all classes taught by "John Doe".
- Retrieve the list of gym members enrolled in a specific class, e.g., members in the "Yoga" class.
- Retrieve a summary of classes with the number of enrolled members for each class.

---

### **Example Output**:

```java
// Classes taught by "John Doe":
Classes taught by John Doe: Yoga, Zumba

// Members enrolled in "Yoga" class:
Members in Yoga class: Emily, Mike, Sara

// Class enrollment count:
Yoga: 3 members
Strength Training: 2 members
Zumba: 3 members
```

---

### **Guidelines**:
- Use `HashSet` to store gym members enrolled in each class to avoid duplicate enrollments.
- Use `HashMap` to store the collection of `GymClass` objects in the `Gym`.
- Implement the methods to retrieve classes by instructor, enrolled members, and class enrollment counts.
[09/04, 14:11] kaustubh Jagtap TCS: Class student 
Attributes
Id,name,subject,grade
Method 1 - studentswithAverageaboveThreshold - return list of students with average grade higher than average
2. Students with maximum unique grades
Take students list as argument for both methods
Return studetns with maximum unique grades

Imput 
3
101
Abc
2
Physics
78
Maths
99
102
Xyz
3
Chem
80
Maths
80
Physics
73
103
Dfg
4
Physics
67
Chem
67
Maths
67
PRA1
67
70
Output
Abc,xyz
Abc,xyz
[09/04, 14:11] kaustubh Jagtap TCS: 2. Associate - Collections

Create a class Associate with the following private attributes

empid-int

name-String

experience-int

salary-double

Include a constructor and required getter and setter methods.

In a separate Solution class with the main method, implement the following static methods

SearchAssociatesByName:

This method should take collection of Associate objects and name (String) as parameters and returns a collection of Associate objects if the associates are found with the given name.

If the returning collection is not empty then return collection of Associate objects or else, return null

getAverage SalaryByExperience:

This method should take collection of Associate objects and experience (int) as parameters and returns double value of average of employee salaries with given experience.

if no associate found with the given experience, then return 0

The above static methods should be called from the main method.

For SearchAssociatesByName: This main method should print the collection of Associate objects (empid, name, experience, salary) if returned collection is not null or else, print "No associate found with given name.



For getAverageSalaryByExperience: This main method should print the average value of salaries if returned double value is not equals to 0 or else, print "No associate found with given experience".

Before calling the static methods in the main method, use the scanner object to read value for no.of

Associate objects to be created, then read empid, name, experience, salary for each Associate object. Next, read one String and Integer values for capturing the name and experience of associate.

Constraints:

• Duplicate Associate objects are allowed and should follow insertion order.

String search should be in case-insensitive
[09/04, 14:11] kaustubh Jagtap TCS: Problem 2: Student Course Enrollment
Objective: Create a system to manage student course enrollments in a university. The system should involve two classes: Course and University. A University can have multiple Course objects stored in a HashMap where the key is the course code, and the value is a Course object.

Classes:

Class Course:
Attributes:
courseCode (String)
courseName (String)
instructor (String)
enrolledStudents (HashSet of student names)
Class University:
Attributes:
universityName (String)
courses (HashMap of course codes to Course objects)
Methods:
getCoursesByInstructor(String instructor): Retrieve a HashSet of course names taught by a given instructor.
getStudentsEnrolledInCourse(String courseCode): Retrieve a HashSet of student names enrolled in a given course.
getCoursesWithStudentCount(): Retrieve a HashMap where each key is a course name and the value is the number of students enrolled.
Example Input:

University name: "Tech University"
Courses:
CourseCode: "CS101", CourseName: "Introduction to Computer Science", Instructor: "Dr. Smith", EnrolledStudents: {"Alice", "Bob", "Charlie"}
CourseCode: "MA102", CourseName: "Calculus I", Instructor: "Dr. Jones", EnrolledStudents: {"Alice", "David"}
CourseCode: "CS102", CourseName: "Data Structures", Instructor: "Dr. Smith", EnrolledStudents: {"Charlie", "Eve"}
[09/04, 14:11] kaustubh Jagtap TCS: Create a class named "Employee" with the following attributes:

id (int)
name (String)
designation (String)
salary (double)

The above attributes should be private, and the class should have a parameterized constructor to initialize them.

Implement the following methods in the Employee class:

getSalary(): This method should return the salary of the employee.
getDesignation(): This method should return the designation of the employee.

Create a class named "Company" with the following attributes:

companyName (String)
employees (Employee array)
numEmployees (int)

The above attributes should be private, and the class should have a parameterized constructor to initialize them.

Implement the following methods in the Company class:

getAverageSalary(): This method should return the average salary of all the employees in the company.
getMaxSalary(): This method should return the highest salary of all the employees in the company.
getEmployeesByDesignation(String designation): This method should return an array of all employees with the given designation.

In the main method, use a Scanner object to read the values of the company name, number of employees, and the employee details 
(id, name, designation, and salary) in a loop. Once all employee details have been read, create a Company object and pass the 
appropriate parameters. Finally, call the three methods mentioned above and print the output.

Note:

All searches should be case-insensitive.
You may assume that the input is valid and in the correct format.

Sample input:
---------------------
Enter company name: ABC Company
Enter number of employees: 3
Enter employee details:
Employee 1:
Enter id: 101
Enter name: John Smith
Enter designation: Manager
Enter salary: 5000
Employee 2:
Enter id: 102
Enter name: Jane Doe
Enter designation: Engineer
Enter salary: 4000
Employee 3:
Enter id: 103
Enter name: Bob Johnson
Enter designation: Engineer
Enter salary: 4500

Sample Output:
--------------------
Average salary: 4500.0
Max salary: 5000.0
Employees with designation: Engineer
ID: 102, Name: Jane Doe, Designation: Engineer, Salary: 4000.0
ID: 103, Name: Bob Johnson, Designation: Engineer, Salary: 4500.0
[09/04, 14:11] kaustubh Jagtap TCS: Question 1: Hospital Management System
Design a system to manage records of doctors and patients in a hospital. The system should involve two classes: Doctor and Patient. A doctor can have multiple patients. Your task is to implement a solution that will maintain a list of Patient objects within the Doctor class and perform specific operations.

Class Doctor:
Attributes:

doctorId (int)
doctorName (String)
specialization (String)
patients (List of Patient objects)
Class Patient:
Attributes:

patientId (int)
patientName (String)
illness (String)
Methods in Doctor Class:
getUniqueIllnesses()

This method identifies and returns all unique illnesses that patients of a particular doctor are suffering from, sorted alphabetically. It takes two arguments: a list of doctor objects and doctorId. If no doctor is found, print "Doctor Not Found".
getDoctorsBySpecialization()

This method retrieves all doctors with a specific specialization and returns a list of their names. It takes two arguments: a list of doctor objects and the specialization. If no doctors are found, print "No Doctors Found".
Sample Input 1:

plaintext
Copy code
2
101
Dr. Smith
Cardiology
3
201
Alice
Heart Disease
202
Bob
Arrhythmia
203
Charlie
Heart Disease
102
Dr. Jones
Neurology
2
204
David
Migraine
205
Eve
Seizure
101
Cardiology
Sample Output 1:

plaintext
Copy code
Arrhythmia
Heart Disease
Dr. Smith
Sample Input 2:

plaintext
Copy code
1
103
Dr. Adams
Pediatrics
1
206
Frank
Asthma
104
Orthopedics
Sample Output 2:

plaintext
Copy code
Doctor Not Found
No Doctors Found
[09/04, 14:11] kaustubh Jagtap TCS: Here’s a different scenario that still involves Java classes, methods, and collections, but in a new context:

---

### Problem Statement:

**Library Management System**

Design a `Book` class that keeps track of each book's ISBN (International Standard Book Number), title, author, and the list of reviews given by readers. Implement two methods in the `Library` class to process books:

1. **booksWithAverageReviewAboveThreshold(List<Book> books, double threshold)**:
   - This method should return a list of book titles whose average review rating is greater than the specified threshold.
  
2. **booksWithMostUniqueReviewers(List<Book> books)**:
   - This method should return a list of book titles that have been reviewed by the highest number of unique reviewers.
  
Your program should:
- Accept input for a list of books, each having an ISBN, title, author, and multiple reviews.
- For each book, reviews consist of the reviewer’s name and the review rating they give (1-5).
- The program should then ask for a threshold value to return the list of books with an average review rating above this threshold.
- It should also return the list of books with the highest number of unique reviewers.

**Input**:
- The first line contains an integer `n`, the number of books.
- For each book:
    - A string `ISBN`.
    - A string `title`.
    - A string `author`.
    - An integer `m` representing the number of reviews the book has received.
    - For the next `m` lines, a string `reviewerName` and an integer `reviewRating` (1-5).
- The next line contains a double `threshold`, representing the average review threshold.

**Output**:
- List of book titles with average review ratings above the threshold.
- List of book titles with the highest number of unique reviewers.

---

### Example:

**Input**:
```
3
978-3-16-148410-0
The Great Adventure
John Smith
3
Alice
5
Bob
4
Alice
3
978-1-86197-876-9
Mystery in the Night
Jane Doe
2
Carol
5
Dave
4
978-0-14-044913-6
The Art of War
Sun Tzu
3
Eve
4
Alice
4
Frank
5
4.0
```

**Output**:
```
Books with average review rating above threshold:
Mystery in the Night
The Art of War

Books with the most unique reviewers:
The Art of War
```

**Explanation**:
- "The Great Adventure" has reviews by Alice (twice) and Bob, but only Bob's review is unique. Its average review rating is (5 + 4 + 3) / 3 = 4.0, so it’s equal to the threshold.
- "Mystery in the Night" has reviews by Carol and Dave with an average of (5 + 4) / 2 = 4.5, which is above the threshold.
- "The Art of War" has reviews by Eve, Alice, and Frank, with an average of (4 + 4 + 5) / 3 = 4.33, which is also above the threshold and has the most unique reviewers.

---

### Problem Focus:
This problem emphasizes:
- Handling a `Book` class with attributes like ISBN, title, author, and a list of reviews.
- Managing collections (using `HashMap`, `List`, and `Set`).
- Working with reviewer names to find unique reviewers and calculating averages.