# Insurance-Policy-Management

## Introduction

This software is designed to facilitate a Policy Management Web Application for an Insurance Company

## Installation

To run the program, the software uses an Apache Tomcat server instance.

## Overview

The application Insurance Management System intends to create a platform on the web from which Agents and Admins can access all details pertaining to their customers, policy and the policy holder records. Admins will have full access to CRUD (create, read, update, delete) these details, whilst Agents will only have the ability to Read details that concern them. 
The application has a login page that is used to differentiate an Agent from an Admin and thus will be able to translate that into each user’s specific availabilities.
The different data sources that will be accessed will need to be stored within SQL which will act as the database keep. Without SQL, the data will be lost upon exiting of the page that is displaying the data. 
The data will be displayed to the user in a vision-friendly manner, with buttons that are clear and concise about their exact function. As this is an application that is being used to fit business needs, the manner in which it will be displayed to the user must be extremely efficient and understandable. 

## User Stories

As an agent, I want to be able to view my customer’s details, so that I can offer them the best insurance rates.
As an agent, I want to be able to easily navigate to my desired page, so that I can efficiently move on with my workday.
As an agent, I want to be able to view policy’s, so that I can educate new customers about policy’s that would suit them best.
As an agent, I want to be able to see the terms of policy for a particular customer, so that I can find what best suits their needs.

As an admin, I want to be able to edit policy’s, so that I can update policy’s to better suit the evolving economic climate.
As an admin, I want to be able to create new policy’s, so that I can create policy’s that may better suit the needs of the business.
As an admin, I want to be able to create new customer’s, so that I can add new customer’s to the database when they choose our business for their insurance needs. 
As an admin, I want to be able to see which customer’s have which policy’s, so that I can gather an idea of the demographic best suited for each policy.

As a user I want to know that my login credentials are incorrect, so that I can correct the error and input the correct credentials.
As a user, I want to know what web page each link is going to take me to, so that I can efficiently move through the web application.

## Usability Design Review

A clear and logical login Page, that differentiates user from admin. The login page displays what information is to be passed in it besides each subsequent box. If password or username credentials are incorrect, an error message will be displayed identifying the problem.
An admin can perform CRUD (Create, Read, Update, Delete) on all entities present within the application.
The links that will take you to your desired pages are colored blue and underlined to provide a clear mode of transport to subsequent pages. These links are also named with the title of the page that they will be transporting the user to, for effective movement around the website.
For each database table, there are clearly and concisely named buttons that instruct the user on what pressing them will do, for example submit, save, edit, delete.
Separate pages have been created and designed for the actions of searching a database, creating a new entry in a database and editing an already existing entry in the database. These separate pages have been designed so that the UI encountered by the user is not overwhelming and decisions can be made with ease regarding each database.
