# Spring WebFlux Reactive Application

# 

# Overview

# 

# This project demonstrates a basic Reactive REST API built using Spring Boot WebFlux and Project Reactor. It provides endpoints for fetching all products and a single product by ID using Flux and Mono types for reactive, non-blocking data handling.

# 

# 

# ---

# 

# Objective

# 

# To build a reactive web application using Spring WebFlux that handles asynchronous REST APIs for multiple and single data responses.

# 

# 

# ---

# 

# Technologies Used

# 

# Java 17

# 

# Spring Boot 3.x

# 

# Spring WebFlux

# 

# Project Reactor

# 

# Maven

# 

# Lombok

# 

# 

# 

# ---

# 

# API Endpoints

# 

# Endpoint	Method	Description	Return Type

# 

# /products	GET	Fetch all products	Flux<Product>

# /products/{id}	GET	Fetch a single product by ID	Mono<Product>

# 

# 

# 

# ---

# 

# How to Run

# 

# 1\. Ensure Java 17+ and Maven are installed.

# 

# 

# 2\. Navigate to the project directory.

# 

# 

# 3\. Run the application:

# 

# mvn spring-boot:run

# 

# 

# 4\. Access the endpoints:

# 

# http://localhost:8080/products

# 

# http://localhost:8080/products/1

# 

# 

# 

# 

# 

# ---

# 

# Project Structure

# 

# src/main/java/com/example/reactivedemo/

# &nbsp;├── model/Product.java

# &nbsp;├── service/ProductService.java

# &nbsp;└── controller/ProductController.java

# 

# 

# ---

# 

# Summary

# 

# Flux handles a stream of multiple elements.

# 

# Mono handles a single element or no element.

# 

# Spring WebFlux enables non-blocking, event-driven APIs that are scalable and efficient.

# 

# 

# 

# ---

# 

# Conclusion

# 

# This project showcases how to use Spring WebFlux and Project Reactor to develop lightweight, reactive, and scalable REST APIs. It efficiently manages concurrent requests while maintaining responsiveness.

