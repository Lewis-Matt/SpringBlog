# SpringBlog


## Setup
IntelliJ has built-in integration with the Spring Initializr, which we will be using to bootstrap our application.

1. Create a new Project in IntelliJ
2. For the project type, select "Spring Initializr"
   1. Choose Java 11 for the Project SDK
3. Project Metadata
    - Make sure "Maven Project" is selected (it should be by default).
    - For the group and package name enter com.codeup.
    - For the "Artifact" and "Name" fields enter a name for your project without spaces.
    - Choose Java 11 under the Packaging field
    - Enter a brief description of your project in the "Description" field.
4. Next we will be prompted for the dependencies of our project. 
   - For the "Spring Boot" dropdown, select version 2.6.x
   - Here we will select any dependencies that our project will have. This is just a shortcut for adding spring-boot-starter <dependency> elements to our pom.xml. If you know what pieces of the Spring framework you are going to use, you would select them here.
   - For now, open the 'Web' dropdown, and check 'Spring Web'.
5. Now we will be prompted for a project name and location. Choose whatever name you prefer (this is just how we will refer to the project on your computer).
6. Add the following line to your .gitignore file
   1. src/main/resources/application.properties
7. Create an empty file at src/main/resources/example.properties and add it to Git. We'll use this file to communicate to other developers what settings are needed to run this application, without sharing our passwords or API keys in GitHub.
8. Create a new repository locally and on GitHub for this project.
