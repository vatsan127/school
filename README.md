School management app using Streams | JDBC | Spring Data Jpa | Postgres

URI paths :
Admin details : http://localhost:8080/api/v1/management/admin/
Get Student : http://localhost:8080/api/v1/management/students/1
Get All Students : http://localhost:8080/api/v1/management/students/
Add new Student : http://localhost:8080/api/v1/management/students/create
Delete student : http://localhost:8080/api/v1/management/students/delete/1

Sample Input Request:
{
    "name": "SRIVATSAN",
    "age": 22,
    "degree": "B.Tech",
    "branch": "ECE",
    "address": {
        "city": "TIRUVALLUR",
        "state": "TN"
    },
    "classInCharge": 0
}

Sample Input Response:
[
    {
        "id": 1,
        "name": "SRIVATSAN",
        "age": 22,
        "degree": "B.Tech",
        "branch": "ECE",
        "address": {
            "city": "TIRUVALLUR",
            "state": "TN"
        },
        "classInCharge": 0
    }
]