# Real-Time Event Ticketing System

A JavaFX application implementing a Producer-Consumer pattern to simulate a real-time ticket distribution system. The system manages concurrent ticket releases by vendors and purchases by customers while maintaining data integrity

## Prerequisites

- Java Development Kit (JDK) 21 or later
- Apache Maven 3.8.x or later
- IntelliJ IDEA 

## Setup Instructions

1. Download the source code
2. Open IntelliJ IDEA
3. Select "Open" and navigate to the project directory
4. Wait for Maven to download dependencies
5. Build the project using Build → Build Project

## Running the Application

1. Navigate to src/main/java/com/example/eventticketingsystem/Main.java
2. Right-click and select Run Main.main()

## Usage Instructions

### Configuration Screen

Enter the following parameters:
- Total Tickets: Total number of tickets available
- Ticket Release Rate (ms): How frequently vendors release tickets
- Customer Retrieval Rate (ms): How often customers attempt to purchase tickets
- Max Ticket Capacity: Maximum number of tickets that can be in the pool

### Main Screen Controls

- Start: Begins the ticket distribution simulation
- Stop: Pauses the simulation
- Reset: Stops the simulation and returns to configuration screen

The status display shows:
- Current system status (Running/Stopped)
- Number of available tickets
- Real-time log of all system activities

## System Features

- Multithreaded ticket distribution system
- Real-time monitoring of ticket availability
- JSON-based configuration storage
- Live logging of all transactions
- Thread-safe ticket pool management

