# Full-Stack-Chat-Application

💬 Chat Application – Real-Time Messaging with Spring Boot, WebSocket & MySQL
This project is a real-time chat application built using Spring Boot, WebSocket (STOMP + SockJS), and MySQL. It allows multiple users to send and receive messages instantly over a web interface. All messages are stored in a MySQL database for persistence and future retrieval.

🔧 Key Features
✅ Real-time chat using WebSocket (STOMP protocol)
✅ Responsive UI with HTML, Bootstrap 5 & CSS
✅ Message sender and content display with auto-scroll
✅ Message persistence in MySQL database
✅ Backend developed with Spring Boot & REST
✅ Easy database integration and export via .sql file

📦 Technologies Used
Frontend	              HTML, CSS, Bootstrap 5
WebSocket	              STOMP.js, SockJS
Backend               	Java, Spring Boot
Database              	MySQL
Build Tool            	Maven

📁 Project Structure
chat-application/
├── src/
│   ├── main/
│   │   ├── java/ (Controllers, Services, Models)
│   │   └── resources/
│   │       ├── static/ (HTML, CSS, JS)
│   │       └── application.properties
├── chat_app.sql        <-- MySQL database dump
├── pom.xml
├── README.md
