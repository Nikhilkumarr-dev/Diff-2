## Web Movie Tracker - Built with Scala 3 & Laminar


### Overview
Web Movie Tracker is a simple movie watchlist application built using Scala 3 and Laminar.This project demonstrates how to create a reactive UI with Scala.js and Laminar


### Features
1.Add  movies with a title and release year
2.Mark movies at watched/unwatched
3.Remove movies from list
4.Reactive UI powered by laminar
5.Built with Scala.js for the frontend

### Project Structure
Diff-2/
├── build.sbt                       # SBT build definition
├── project/                        # SBT project settings
├── src/
│   ├── main/
│   │   ├── scala/
│   │   │   ├── MainApp.scala      # Main Scala.js application file
│   │   ├── resources/
│   │   │   ├── index.html         # HTML file for app rendering
│   ├── test/
│       ├── scala/
│       │   ├── MainAppTest.scala  # Tests 
├── .gitignore                     # Ignored files for Git
├── README.md                      # Project Summarization



### Installation & Setup
#### Prerequisites
Before running the project,ensure you have the following installed
1.Java 11+
2.Scala 3
3.SBT(Scala Build Tool)

### Steps to clone the Respository
git clone Diff-2
cd Diff-2

### build the Project
sbt compile
-->Compilation of Scala 3 project.

### Run the Application
sbt fastLinkJS
-->This will generate Javascript files that can be used in an HTML file.

###  Start a Local Server
#### use a simple HTTP server to serve the generated files
npx serve target/scala-3.3.1




