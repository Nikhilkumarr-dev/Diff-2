# Web Movie Tracker

Web Movie Tracker is a simple movie watchlist application built using Scala 3 and Laminar. This project demonstrates how to create a reactive UI with Scala.js and Laminar.

## Features
- Add movies with a title and release year
- Mark movies as watched/unwatched
- Remove movies from the list
- Reactive UI powered by Laminar
- Built with Scala.js for the frontend

## Project Structure
```
Diff-2/
├── build.sbt                       # SBT build definition
├── project/                        # SBT project settings
├── src/
│   ├── main/
│   │   ├── scala/
│   │   │   ├── MainApp.scala       # Main Scala.js application file
│   │   ├── resources/
│   │   │   ├── index.html          # HTML file for app rendering
│   ├── test/
│   │   ├── scala/
│   │   │   ├── MainAppTest.scala   # Tests
├── .gitignore                      # Ignored files for Git
├── README.md                       # Project summarization
```

## Installation & Setup

### Prerequisites
Before running the project, ensure you have the following installed:
1. Java 11+
2. Scala 3
3. SBT (Scala Build Tool)

### Steps to Clone the Repository
```sh
git clone <clone_link>
cd Diff-2
```

### Build the Project
```sh
sbt compile  # Compilation of Scala 3 project
```

### Run the Application
```sh
sbt fastLinkJS  # Generates JavaScript files to be used in the HTML file
```

### Start a Local Server
Use a simple HTTP server to serve the generated files:
```sh
npx serve target/scala-3.3.1
```


