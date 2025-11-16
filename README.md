# 📘 Student Record Management System (Java Lab Assignment 4)

A Java application implementing file handling, collections, sorting, and iterators.

# 📌 📄 Problem Statement

This project implements a Student Record Management System with persistent storage using File Handling and the Java Collections Framework.

The system:

Reads student records from a file (students.txt) at program start

Stores records using ArrayList

Allows adding, viewing, searching, deleting, and sorting records

Sorts students by marks using Comparator

Displays student data using Iterator

Saves updated records back to the file before exiting

Demonstrates reading/writing files using BufferedReader and BufferedWriter

Uses File class and optionally RandomAccessFile (as per assignment requirements)

# 🎯 Learning Outcomes

By completing this assignment, the student will be able to:

Implement file handling for storing and retrieving student records

Use collections (List, Map) to manage and manipulate data

Sort and display records using Comparator, Comparable, and Iterator

🏗 Class Hierarchy & Data Types
Classes

FileUtil – Handles file reading/writing

StudentManager – Manages student operations

Student – Model class for student information

Main – Entry point of the application

Data Types Used

ArrayList<Student>

BufferedReader, BufferedWriter

Comparator

Iterator

# ⭐ Features

✔ Load records from a file
✔ Add new student records
✔ View all students
✔ Search by name
✔ Delete a student
✔ Sort by marks (Descending order)
✔ Save updated records to file
✔ Iterator-based display
✔ Comparator-based sorting

# 📂 Project Structure
|-- Main.java
|-- Student.java
|-- StudentManager.java
|-- FileUtil.java
|-- students.txt
