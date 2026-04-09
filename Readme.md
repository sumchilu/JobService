This is a Springboot application consist of 3 services
1) Job Service
2) Company Service
3) Review Service

######################

Job Service EndPoints

######################

GET All Jobs: http://localhost:8080/jobs/

GET Job by id: http://localhost:8080/jobs/{id}

POST Add New Job: http://localhost:8080/jobs/
````
{
"name": "Test3",
"description": "Test Job",
"status": "Active",
"startTime": "01-04-2026",
"endTime": null
}
````
PUT Update Job by Id: http://localhost:8080/jobs/{id}
````
{
    "name": "Test3",
    "description": "Test Job",
    "status": "Active",
    "startTime": "01-04-2026",
    "endTime": null
}
````
DELETE Job by Id: http://localhost:8080/{id}
######################

Company Service EndPoints

######################

GET All Companies: http://localhost:8080/company/

GET Company by id: http://localhost:8080/company/{id}

POST Add New Company: http://localhost:8080/company/
````
{
    "name" : "Test Company",
    "address" : "Test Address",
    "email" : "",
    "phone" : "",
    "website": ""
}
````
PUT Update Company by Id: http://localhost:8080/company/{id}
````
{
    "name" : "Test Company",
    "address" : "Test Address",
    "email" : "",
    "phone" : "",
    "website": ""
}
````
DELETE Company by Id: http://localhost:8080/company/{id}


######################

Review Service EndPoints

######################

GET All Jobs: http://localhost:8080/companies/{companyId}/reviews/

GET Job by id: http://localhost:8080/companies/{companyId}/reviews/{reviewId}

POST Add New Job: http://localhost:8080/companies/{companyId}/reviews/
````
{
    "title": "",
    "description": "",
    "rating": ""
}
````
PUT Update Job by Id: http://localhost:8080/companies/{companyId}/reviews/{reviewId}
````
{
    "title": "",
    "description": "",
    "rating": ""
}
````

Build a docker image using spring-boot-maven plugin

mvnw spring-boot:build-image "-Dspring-boot.build-image.imageName=<imagename>"
