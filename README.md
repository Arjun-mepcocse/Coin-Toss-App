**Coin Toss App**

## About the Project

**Coin Toss App** is a simple Android application I developed using **Java and Android Studio**.

The idea behind the project is straightforward: when the user presses the **TOSS** button, the app randomly generates either **Heads** or **Tails** and displays the corresponding coin image.

I built this project to get more hands-on experience with Android development and to understand how Java logic can be connected with an Android user interface.

## Features

* Toss a virtual coin with a button press
* Randomly generates **Heads** or **Tails**
* Displays a different image based on the result
* Simple and easy-to-use interface
* Custom coin images and application graphics
* Supports different screen orientations

## Technologies Used

* **Java** – Application logic
* **XML** – User interface design
* **Android Studio** – Development environment
* **Gradle** – Project build system
* **Git & GitHub** – Version control and project hosting

  <img width="1920" height="1080" alt="Screenshot 2026-09-20 140349" src="https://github.com/user-attachments/assets/a04c29c8-b667-43c2-8ae5-f7686863689e" />
  <img width="1920" height="1080" alt="Screenshot 2026-09-20 135633" src="https://github.com/user-attachments/assets/2b40fbbf-3ad9-4427-a233-32c837012215" />



## How the App Works

The basic flow of the application is:

```text
Open the App
     ↓
Press the TOSS button
     ↓
Generate a random result
     ↓
 ┌─────────┐
 │         │
Heads     Tails
 │         │
 └─────────┘
     ↓
Display the corresponding coin image
```

The Java code handles the random result, while the Android UI displays the appropriate image based on that result.

## Project Structure

The main application code is organized inside the `app` module.

```text
Toss/
│
├── app/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── com/example/toss/
│           │       └── MainActivity.java
│           │
│           ├── res/
│           │   ├── drawable/
│           │   │   ├── background.jpg
│           │   │   ├── heads.png
│           │   │   ├── tails.png
│           │   │   └── logo.jpg
│           │   │
│           │   ├── layout/
│           │   │   └── activity_main.xml
│           │   │
│           │   └── values/
│           │       ├── colors.xml
│           │       ├── strings.xml
│           │       └── themes.xml
│           │
│           └── AndroidManifest.xml
│
├── build.gradle.kts
├── settings.gradle.kts
├── gradle.properties
├── gradlew
├── gradlew.bat
└── README.md
```

## Getting Started

### Requirements

To run this project, you will need:

* Android Studio
* Android SDK
* A suitable JDK configured with Android Studio
* An Android emulator or physical Android device

### Clone the Project

You can clone the repository using Git:

```bash
git clone https://github.com/Arjun-mepcocse/Coin-Toss-App.git
```

Then move into the project directory:

```bash
cd Coin-Toss-App
```

Open the project in **Android Studio**, allow Gradle to sync, connect an Android device or start an emulator, and run the application.

## Screenshots

I will add screenshots of the application here to show the main screen and the Heads/Tails results.

```text
screenshots/
├── home-screen.png
├── heads-result.png
└── tails-result.png
```

Once the screenshots are uploaded, they can be displayed in this section.

## What I Learned

While working on this project, I got practical experience with:

* Developing an Android application using Java
* Creating layouts using XML
* Handling button click events
* Generating random results in Java
* Displaying images dynamically
* Organizing Android resources
* Understanding the Android project structure
* Using Gradle for an Android project
* Using Git and GitHub to manage and host my project

This project also helped me understand the connection between the **Java backend logic and the Android user interface** in a simple, practical way.

## Future Improvements

I would like to improve the application further by adding features such as:

* Toss history
* Heads/Tails count
* Toss statistics
* Toss animation
* Sound effects
* Dark mode
* Reset option

## Repository

The source code for this project is available on GitHub:

**Coin Toss App:**
https://github.com/Arjun-mepcocse/Coin-Toss-App

## Author

**Arjun R V**

B.E. Computer Science and Engineering

GitHub:
https://github.com/Arjun-mepcocse

LinkedIn:
https://www.linkedin.com/in/arjun-r-v
