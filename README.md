# bcrypt

**bcrypt** is an authentication app using jBCrypt

**jBCrypt** is a Java™ implementation of OpenBSD's Blowfish password hashing code,
as described in ["A Future-Adaptable Password Scheme"](http://www.openbsd.org/papers/bcrypt-paper.ps)    
by Niels Provos and David Mazières.

### Instructions

- Clone down this repository
- Open in IntelliJ IDEA or Gradle
- To build from the command line, cd into the `bcrypt` directory and run `.
  /gradlew bootRun`
- While the app is running, open `localhost:8080/signup` in the web browser. 
- Create a username and password
- On the `/login` page, enter your username and password to view a customized 
  message, and the *secret recipe*!

### Lab 14

**Resources**

[jBCrypt](https://www.mindrot.org/projects/jBCrypt/)
[CodeFellows Demo - Instructor: Alex White](https://github.com/codefellows/seattle-code-java-401d15)

**Feature Tasks**

- Create a database.
- Create a table that models users with a username, id, and hashed password.
- Create a table that models posts with a postId, userId, and text content.
- Create a table with a one-to-many relationship between users and posts.
- Authenticate the site so only logged-in users can see posts.
- Use BCrypt to hash all passwords stored on the site.

**Collaboration**
Lucy Gelderloos, Joshua Frazer