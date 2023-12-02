# Spring Boot REST API: Secure User Authentication and Pet Data Management with Spring Security

## Overview
This document provides an overview of the REST API built using Java 17 and Spring Boot, implementing Spring Security with an H2 database for user data storage. The API manages user data and pet information in a secure manner.

## Features
- User registration and management
- Secure authentication with Spring Security
- Pet information retrieval

## Prerequisites
- Java 17
- Gradle (for dependency management and running the application)

## Installation & Running the API
Follow these instructions to set up and run the API:

```bash
# Clone the repository
git clone [repository-url]

# Navigate to the project directory
cd [project-directory]

# Build the project and run the application
./gradlew bootRun
```

## API Endpoints
### User Registration
Create a new user.

```bash
curl --location --request POST 'localhost:8080/user' \
--header 'Content-Type: application/json' \
--data-raw '{
"username": "YOUR_USERNAME",
"password": "YOUR_PASSWORD"
}'
```

### List pets
List pets.

```bash
curl --location --request GET 'localhost:8080/pet' \
--header 'Content-Type: application/json' \
--header 'Authorization: Basic [credentials]' \
--data-raw ''
```

Authorization: Basic [credentials]: This is a Base64-encoded string that represents the username and password for basic authentication. 