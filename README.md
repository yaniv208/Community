<div id="top"></div>

<!-- PROJECT SHIELDS -->
[![GitHub repo size][reposize-shield]](#)
[![GitHub language count][languagescount-shield]](#)
[![Contributors][contributors-shield]][contributors-url]
[![Stargazers][stars-shield]][stars-url]
[![MIT License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]
[![Gmail][gmail-shield]][gmail-url]

<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://github.com/Yaniv208/Community">
    <img src="https://user-images.githubusercontent.com/62435713/180641299-4ac4fa48-1f9d-406a-a23d-0e4acf05b915.png"
	alt="Logo" width="160" height="160">
  </a>

<h3 align="center">Final Project Developing Open Source Based Server-Side Applications: "Community"</h3>

  <p align="center">
       A web application project that was developed using Spring Boot framework, and supplies various RESTful API services to users, using various libraries such as Jackson, Spring HATEOAS, Swagger UI, Data REST. 
    <br />
</div>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
    </li>
    <li>
      <a href="#libraries-used-during-development">Libraries Used During Development</a>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contributors">Contributors</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>


<!-- ABOUT THE PROJECT -->
## About The Project

![image](https://user-images.githubusercontent.com/62435713/180650348-9a4fe5b3-909a-4f98-a26d-983e8d4ba55a.png)

This project was developed fully in Java language, using Spring Boot framework. <br>
In this project we implemented a system that manages users and offers a wide variety of functionalities. The user is offered not only the basic CRUD functionality, but rather get data about users using complex queries and conditions.<br>

Throughout the whole project, RESTful representations were also implemented using HATEOAS library,
Async programming was also used in this project by using CompletableFuture class,
and data was fetched from 3 different API resources and mapped into POJOs using both RestTemplate and ObjectMapper.

In this project, one can create, get, edit and delete users, cell phone companies and/or perform manipulations with the data stored in the database.

Also, In this project you may find several subjects implementations throughout the code, such as: <br>
1. Multithreading and Java Streams. <br>
2. Concurrent Design Patterns and algorithms. <br>
4. Spring Framework: IoC and Dependency Injection. <br>
5. Spring Boot and Web API development, Custom Exceptions and Handlers. <br>
6. Spring MVC: Beans, JPA, Hibernate, Lombok, Swagger and MVC Controllers. <br>
7. Spring Boot and RESTful representations using HATEOAS library Async programming using CompletableFuture\<V>. <br>
8. RESTful API development and advanced HTTP response manipulation and Spring Data REST. <br>
9. Advanced Hibernate relations and RESTful representations assemblers. <br>
10. DAO/DTO using Jackson and JSON properties. <br>
11. Spring @Service and async tasks, in addition to various annotations used <br>
<p align="right">(<a href="#top">Back to top</a>)</p>


## Some of the libraries used during development

1. Swagger UI – A library that allows us to visualize and interact with the APIs resources, expanding about each and every endpoint available.
2. commons-io - A library of utilities to assist with developing IO functionality. We used this library in order to fetch a random user from external API.
3. org.json – A library that contains JSON encoders/decoders implemented in Java, and allows us to convert JSON data to Java concrete data types, and much more..
4. Lombok – A library that helps us to prevent boilerplate code in projects by using its annotations.
5. jackson-databind – A library that offers the general-purpose data-binding functionality. In this project, we used Jackson ObjectMapper.
6. H2 database  - A library that allows us to use the H2 database functionality.

<p align="right">(<a href="#top">Back to top</a>)</p>

<!-- GETTING STARTED -->
## Getting Started

Follow these simple steps:

1. Clone the repo
   ```sh
   git clone https://github.com/Yaniv208/Community.git
   ```
2. Run the program
   ```sh
   Press Shift+F10 or press the "Run WebappApplication" button
   ```
   ![image](https://user-images.githubusercontent.com/62435713/180663523-ff46d032-416e-48c3-b20e-943338671ea9.png) 
3. Import requests to Postman using this link:<br>
https://www.getpostman.com/collections/3ae56741681d12e2a393

4. You may enter to H2 DB UI using this link:<br>
http://localhost:8080/h2

5. You may enter to Swagger-UI using this link:<br>
http://localhost:8080/swagger-ui/index.html
<p align="right">(<a href="#top">Back to top</a>)</p>

<!-- USAGE EXAMPLES -->
## Usage

### Demo Video:
[![IMAGE ALT TEXT HERE](https://img.youtube.com/vi/HOo1qsXnqFU/0.jpg)](https://www.youtube.com/watch?v=HOo1qsXnqFU) <br>
** Increasing the speed of the video is recommended. <br>



_For more examples, please refer to the [project appendencies](https://github.com/Yaniv208/Community/raw/readme/Project%20Appendices.zip)_

<p align="right">(<a href="#top">Back to top</a>)</p>

<!-- LICENSE -->
## License

Distributed under the MIT License. See [`LICENSE.txt`](https://github.com/RamMichaeli17/Community/blob/main/LICENSE.txt) for more information.

<p align="right">(<a href="#top">Back to top</a>)</p>



## Contributors
<table>
  <tr>
    <td align="center">
      <a href="https://github.com/RamMichaeli17">
        <img src="https://avatars.githubusercontent.com/u/62435713?v=4" width="100px;"/><br>
        <sub>
          <b>Ram Michaeli</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/yaniv208">
        <img src="https://avatars.githubusercontent.com/u/64155615?v=4" width="100px;"/><br>
        <sub>
          <b>Yaniv Levi</b>
        </sub>
      </a>
    </td>
        <td align="center">
      <a href="https://github.com/talbeno10">
        <img src="https://avatars.githubusercontent.com/u/62500706?v=4" width="100px;"/><br>
        <sub>
          <b>Tal Beno</b>
        </sub>
      </a>
    </td>
  </tr>
</table>

<!-- CONTACT -->
## Contact

Yaniv Levi - Yaniv208@gmail.com

Project Link: [https://github.com/yaniv208/Community](https://github.com/RamMichaeli17/Community)

<a href="mailto:Yaniv208@gmail.com"><img src="https://img.shields.io/twitter/url?label=Gmail%3A%20Yaniv208%40gmail.com&logo=gmail&style=social&url=https%3A%2F%2Fmailto%3AYaniv208%40gmail.com"/></a>
<a href="https://linkedin.com/in/Yaniv208"><img src="https://img.shields.io/twitter/url?label=Yaniv%20Levi&logo=linkedin&style=social&url=https%3A%2F%2Fmailto%3AYaniv208%40gmail.com"/></a>
<p align="right">(<a href="#top">Back to top</a>)</p>

<!-- MARKDOWN LINKS & IMAGES -->
[reposize-shield]: https://img.shields.io/github/repo-size/Yaniv208/Community?style=for-the-badge

[languagescount-shield]: https://img.shields.io/github/languages/count/Yaniv208/Community?style=for-the-badge

[contributors-shield]: https://img.shields.io/github/contributors/Yaniv208/Community.svg?style=for-the-badge

[contributors-url]: https://github.com/Yaniv208/Community/graphs/contributors

[stars-shield]: https://img.shields.io/github/stars/Yaniv208/Community.svg?style=for-the-badge

[stars-url]: https://github.com/Yaniv208/Community/stargazers

[license-shield]: https://img.shields.io/github/license/Yaniv208/Community?style=for-the-badge

[license-url]: https://github.com/Yaniv208/Community/blob/master/LICENSE.txt

[linkedin-shield]: https://img.shields.io/badge/linkedin-%230077B5.svg?style=for-the-badge&logo=linkedin&logoColor=white

[linkedin-url]: https://linkedin.com/in/Yaniv208

[gmail-shield]: https://img.shields.io/badge/Yaniv208@gmail.com-D14836?style=for-the-badge&logo=gmail&logoColor=white

[gmail-url]: mailto:Yaniv208@gmail.com