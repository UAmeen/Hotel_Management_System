# Hotel Management System

## Brief Introduction

The **Hotel Management System** is a Java-based desktop application developed using **Java Swing**. The project provides a simple graphical user interface where hotel staff can reserve rooms, check room availability, and cancel reservations.

The system stores customer details such as name, CNIC, phone number, number of days, and room number. Room reservation records are managed during runtime using Java's `HashMap`.

---

## Project Details

This project is designed to manage basic hotel room reservations.

### Main Features

1. **Reserve Room**  
   The user can enter customer details and reserve a room if it is available.

2. **Check Availability**  
   The user can check whether a room is available or already reserved.

3. **Cancel Reservation**  
   The user can cancel an existing room reservation by entering the room number.

4. **Customer Information Storage**  
   Customer data is stored using a `Customer` class, and room reservations are managed using a `HashMap`.

5. **Graphical User Interface**  
   The project uses Java Swing components such as `JFrame`, `JLabel`, `JTextField`, `JButton`, `JTextArea`, and `JPanel`.

---

## Technologies Used

- Programming Language: **Java**
- GUI Framework: **Java Swing**
- Data Structure Used: **HashMap**
- IDE Supported: NetBeans, IntelliJ IDEA, Eclipse, VS Code

---

## Repository Structure

```text
Hotel_Management_System/
│
├── src/
│   └── HotelManagementSystem.java
│
├── zip_file/
│   └── HotelManagementSystem_SourceCode.zip
│
└── README.md
```

---

## Explanation of Source Code

The project mainly contains two classes:

### 1. Customer Class

The `Customer` class stores customer information.

It includes:

- Customer name
- CNIC
- Phone number
- Number of staying days

This class helps organize customer data in a clean structure.

### 2. HotelManagementSystem Class

The `HotelManagementSystem` class is the main class of the project. It extends `JFrame` and implements `ActionListener`.

It handles:

- Creating the GUI window
- Taking input from the user
- Reserving rooms
- Checking room availability
- Cancelling room reservations
- Displaying reservation status

The system uses a `HashMap<Integer, Customer>` where the room number is stored as the key and customer details are stored as the value.

---

## Project Members

### 1. Yasir Nasir  
**Roll Number:** 25FA-061-SE  
**Role:** GUI Designer and Layout Manager  

Yasir Nasir worked on the visual interface of the project. His role included designing the form layout, labels, buttons, text fields, and overall user-friendly appearance of the hotel management system.

### 2. Umer  
**Roll Number:** 25FA-062-SE  
**Role:** Reservation Logic Developer  

Umer handled the main reservation functionality of the project. His role included implementing room reservation, checking whether a room is already booked, and managing room data using the `HashMap`.

### 3. Ameen Usmani  
**Roll Number:** 25FA-025-SE  
**Role:** Testing and Validation Handler  

Ameen Usmani worked on testing the project and checking input validation. His role included testing room availability, reservation cancellation, numeric input validation, and ensuring the system displays proper messages.

---

## How to Run the Project

### Step 1: Open the Project

Open the project folder in any Java-supported IDE such as:

- NetBeans
- IntelliJ IDEA
- Eclipse
- VS Code

### Step 2: Compile the Java File

Go to the `src` folder and compile the file:

```bash
javac HotelManagementSystem.java
```

### Step 3: Run the Program

Run the project using:

```bash
java HotelManagementSystem
```

---

## User Instructions

1. Enter customer name.
2. Enter CNIC number.
3. Enter phone number.
4. Enter number of days.
5. Enter room number.
6. Click **Reserve Room** to book the room.
7. Click **Check Availability** to check room status.
8. Click **Cancel Reservation** to remove a booking.

---

## Brief Project Report

### Objective

The objective of this project is to create a simple hotel room reservation system using Java. The system allows users to manage room bookings through an easy graphical interface.

### Problem Statement

Manual hotel room reservation can lead to errors such as double booking, missing customer information, or confusion about room availability. This project solves the issue by providing a computerized reservation system.

### Scope

The system is suitable for small hotel reservation management. It can store room reservations temporarily while the program is running.

### Working

The user enters customer and room details. When the reserve button is clicked, the system checks whether the room is already reserved. If the room is free, the customer data is stored. If the room is already booked, the system shows a message. The user can also check availability and cancel reservations.

### Limitations

- Data is not permanently stored after closing the program.
- No database is connected.
- No login system is included.
- No billing or payment feature is included.

### Future Improvements

The project can be improved by adding:

- Database connectivity
- Login system for admin
- Billing system
- Room categories
- Permanent customer records
- Search and filter options
- Receipt generation

---

## Conclusion

The Hotel Management System is a simple and useful Java Swing project for managing hotel room reservations. It demonstrates basic object-oriented programming, GUI development, event handling, and data management using `HashMap`.

This project is suitable for beginners and students because it is easy to understand, practical, and can be expanded with advanced features in the future.
