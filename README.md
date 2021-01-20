# DsDelivery API

[![Author](https://img.shields.io/badge/author-GuilhermeRodrigues-2aa889?style=flat-square)](https://github.com/iamgrodrigues)
[![Languages](https://img.shields.io/github/languages/count/iamgrodrigues/dsdelivery-api?color=2aa889&style=flat-square)](#)
[![Stars](https://img.shields.io/github/stars/iamgrodrigues/dsdelivery-api?color=2aa889&style=flat-square)](https://github.com/iamgrodrigues/dsdelivery-api/stargazers)
[![Forks](https://img.shields.io/github/forks/iamgrodrigues/dsdelivery-api?color=2aa889&style=flat-square)](https://github.com/iamgrodrigues/dsdelivery-api/network/members)
[![Contributors](https://img.shields.io/github/contributors/iamgrodrigues/dsdelivery-api?color=2aa889&style=flat-square)](https://github.com/iamgrodrigues/dsdelivery-api/graphs/contributors)

> A Rest API that helps you to manage orders on a delivery system :rocket:

<p align="center">
  <img align="center" src="https://i.ibb.co/J3pp3fx/dsdelivery-api.png" alt="dsdelivery-API" border="0">
</p>


# :pushpin: Table of Contents

* [Features](#rocket-features)
* [Requirements](#requirements)
* [Installation](#construction_worker-installation)
* [Getting Started](#runner-getting-started)
* [FAQ](#postbox-faq)
* [Found a bug? Missing a specific feature?](#bug-issues)
* [Contributing](#tada-contributing)
* [License](#closed_book-license)

# :rocket: Features

- GET List of products sorted by name in ascending order.
- GET List of orders that have the status as "PENDING" sorted by ascending order of the creation moment.
- POST Order to be delivered.
- PUT Order status from "PENDING" to "DELIVERED".

Sample Valid JSON Request Body

POST -> /orders

```json
{
	"id": 7,
	"address": "Avenida Paulista, 1500",
	"latitude": -23.56168,
	"longitude": -46.656139,
	"products": [
		{
			"id": 2
		},
		{
			"id": 5
		}
	]
}
```

[![Run in Insomnia}](https://insomnia.rest/images/run.svg)](https://insomnia.rest/run/?label=DsDeliveryAPI%20API&uri=https%3A%2F%2Fgithub.com%2Fiamgrodrigues%2Fdsdelivery-api%2Fblob%2Fmaster%2F.github%2Fdocs/dsdelivery-api)

It's important to mention that this is one of the applications from the DsDelivery System

In order to explore the others, feel free to click on the link below:

* [DsDelivery WEB](https://github.com/iamgrodrigues/dsdelivery-web)


# Requirements

For building and running the application you need:

- [JDK 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/)
- [Docker to run PostgreSQL image](https://docs.docker.com/get-docker/) or [PostgreSQL installed locally](https://www.postgresql.org/download/)

# :construction_worker: Installation

To install this application, run the following commands:

```bash
git clone https://github.com/iamgrodrigues/dsdelivery-api.git
```

If you have a SSH key registered in your Github account, clone the project using this command:

```bash
git clone git@github.com:iamgrodrigues/dsdelivery-api.git
```

# :runner: Getting Started

## Running the Application Locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.iamgrodrigues.dsdeliveryapi.DsDeliveryApiApplication` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```
After the above command, you can navigate to the following address to see the project up and runnig:

```shell
http://localhost:8080/orders
```

## Running Docker Container
> Note: Skip this part if you have PostgreSQL installed

Once you've installed Docker, run the following command: that will start up the PostgreSQL container on 5432:5432 port, set up enviroment variables for user and password, and create a database called dsdelivery.

```bash
docker run --name dsdelivery-db -d -p 5432:5432 -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=1234567 -e POSTGRES_DB=dsdelivery postgres
```

## Create Tables and Populate the Database
> Note: If you already have PostgreSQL installed on your machine, skip the docker related commands. 

Run the following command to get inside of the docker container:

```bash
docker run -it --rm --net=host postgres /bin/bash
```

Change the active profile on the `application.properties` file to `dev`, uncomment the first four lines on the `application-dev.properties` file, and then restart the application. Once the application is up, a `create.sql` file will be created on the root project folder. Copy its contents, and paste it after the following command.

```bash
psql -h localhost -U postgres dsdelivery
```
In order to populate the database, you must copy the contents of the `data.sql` file and paste it after the above command.

## Status Codes

DsDelivery returns the following status codes in its API:

| Status Code | Description |
| :--- | :--- |
| 200 | `OK` |
| 201 | `CREATED` |
| 400 | `BAD REQUEST` |
| 500 | `INTERNAL SERVER ERROR` |

> Error handling will be added soon.

# :postbox: Faq

**Question:** What are the tecnologies used in this project?

**Answer:** The tecnologies used in this project are [Java](https://www.java.com) + [Spring Boot](https://spring.io) and [PostgreSQL](https://www.postgresql.org/).

# :bug: Issues

Feel free to **file a new issue** with a respective title and description on the the [DsDelivery API](https://github.com/iamgrodrigues/dsdelivery-api/issues) repository. If you already found a solution to your problem, **I would love to review your pull request**! Have a look at our [contribution guidelines](https://github.com/iamgrodrigues/dsdelivery-api/blob/master/CONTRIBUTING.md) to find out about the coding standards.

# :tada: Contributing

Check out the [contributing](https://github.com/iamgrodrigues/dsdelivery-api/blob/master/CONTRIBUTING.md) page to see the best places to file issues, start discussions and begin contributing.

# :closed_book: License

Released in 2021.
This project is under the [MIT license](https://github.com/iamgrodrigues/dsdelivery-api/blob/master/LICENSE).

Made with love by [Guilherme Rodrigues](https://github.com/iamgrodrigues) 💚🚀
