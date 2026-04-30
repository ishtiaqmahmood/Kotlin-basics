# Kotlin Basics

A comprehensive collection of Kotlin examples covering fundamental concepts and syntax. This project is ideal for beginners looking to understand the core building blocks of the Kotlin programming language.

## Table of Contents
- [Description](#description)
- [Topics Covered](#topics-covered)
- [Getting Started](#getting-started)
- [How to Run](#how-to-run)
- [License](#license)

## Description

This repository serves as a practical guide to Kotlin basics. It includes well-documented code snippets that demonstrate everything from variable declarations to basic control flow and special Kotlin types.

## Topics Covered

Each file in the `src/` directory focuses on a specific aspect of Kotlin:

- **[Hello.kt](src/Hello.kt)**: The classic "Hello World" example and basic comment syntax.
- **[Variables.kt](src/Variables.kt)**: Demonstrates mutable variables using `var`.
- **[Constants.kt](src/Constants.kt)**: Demonstrates read-only variables (constants) using `val`.
- **[Numbers.kt](src/Numbers.kt)**: Covers primitive number types like `Byte`, `Int`, `Long`, `Float`, and `Double`.
- **[Booleans.kt](src/Booleans.kt)**: Basic usage of logical `Boolean` values.
- **[Characters.kt](src/Characters.kt)**: Demonstrates the `Char` type for single characters.
- **[Strings.kt](src/Strings.kt)**: Exploration of string manipulation, concatenation, and templates.
- **[Type_conversion.kt](src/Type_conversion.kt)**: Explains explicit type casting in Kotlin.
- **[Basic_control_flow.kt](src/Basic_control_flow.kt)**: Overview of comparison and logical operators.
- **[Pairs_and_Triples.kt](src/Pairs_and_Triples.kt)**: Shows how to group multiple values into simple containers.
- **[Any_Unit_Nothing.kt](src/Any_Unit_Nothing.kt)**: Explains special Kotlin types like `Any`, `Unit`, and `Nothing`.

## Getting Started

### Prerequisites

To run these examples, you will need:
- [JDK (Java Development Kit)](https://www.oracle.com/java/technologies/downloads/) (version 8 or higher)
- [Kotlin Compiler](https://kotlinlang.org/docs/command-line.html) or an IDE like [IntelliJ IDEA](https://www.jetbrains.com/idea/)

## How to Run

### Using IntelliJ IDEA (Recommended)

1. Open IntelliJ IDEA.
2. Select **Open** and navigate to this project folder.
3. Once the project loads, open any `.kt` file in the `src/` directory.
4. Click the green **Run** button (play icon) next to the `fun main()` function.

### Using Command Line

You can compile and run any file using the Kotlin compiler:

```bash
kotlinc src/Hello.kt -include-runtime -d Hello.jar
java -jar Hello.jar
```

## License

This project is open-source and available under the [MIT License](LICENSE).
