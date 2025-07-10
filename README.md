# Java Multithreading Beispiele

Diese Applikation wurde im Verlauf einer Bachelorarbeit an der Hochschule Landshut erstellt. Sie dient dazu, anhand verscheidener Bespeiele eine Einführung in das Multithreading zu gebeb. 

## Project Structure

```
src/main/java/com/multithreading/
├── MultithreadingMain.java          # Main application entry point
└── examples/
    ├── BasicThreadExample.java      # Basic thread creation methods
    ├── ThreadExample.java           # Simple thread example
    ├── Thread_Beispiel.java         # German thread example
    ├── ThreadPoolExample.java       # Thread pool demonstrations
    ├── SynchronizationExample.java  # Synchronization mechanisms
    ├── ProducerConsumerExample.java # Producer-Consumer pattern
    └── ConcurrentCollectionsExample.java # Thread-safe collections
```

## Features

### 1. Basic Thread Creation
- Extending Thread class
- Implementing Runnable interface
- Using lambda expressions
- Thread lifecycle management

### 2. Thread Pools
- Fixed thread pools
- Cached thread pools
- Single thread executors
- Scheduled executors

### 3. Synchronization
- Race condition demonstration
- Synchronized methods and blocks
- Volatile keyword usage
- Lock mechanisms

### 4. Producer-Consumer Pattern
- BlockingQueue implementation
- Multiple producers and consumers
- Thread coordination

### 5. Concurrent Collections
- ConcurrentHashMap
- CopyOnWriteArrayList
- Various BlockingQueue implementations

## How to Run

### Compile the project:
```bash
javac -d . src/main/java/com/multithreading/**/*.java
```

### Run the main application:
```bash
java com.multithreading.MultithreadingMain
```

### Run individual examples:
```bash
java com.multithreading.examples.ThreadExample
java com.multithreading.examples.Thread_Beispiel
```

## Requirements

- Java 8 or higher
- No external dependencies required

## Learning Objectives

This project helps understand:
- Thread creation and management
- Thread safety and synchronization
- Performance considerations in multithreading
- Common threading patterns and best practices
- Java concurrency utilities

## Notes

- All examples include proper exception handling
- Comments are provided in both German and English
- Code demonstrates both basic and advanced threading concepts
- Examples are designed to be educational and easy to understand
