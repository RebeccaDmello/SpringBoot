Video : 
https://user-images.githubusercontent.com/32956051/108618830-1821dc80-73d6-11eb-93e4-72f1770f9819.mp4

SpringBoot application which performs CRUD operations on MongoDB

```HTML
Database name : springbootCRUD
Collection: Book
```

Initial Data that can be added into the table:


```HTML
{
"Title":"Data Strcutures",
"Author":"Rebecca Moses Dmello"
}
```

Postman Software can be used to check the REST API

Links to Check the working of application in Postman or on the browser are:

@GetMapping
localhost:8080/books

@PostMapping
localhost:8080/books

and provide body to perform post routine in postman as follows:
```HTML
{
"title":"Data Strcutures",
"author":"Rebecca Moses Dmello"
}
```
@PutMapping
localhost:8080/books/id
Note: Replace id with your record present in MongoDB eg."653268"

and provide body to perform put routine in postman as follows:
```HTML
{
"title":"Data Strcutures",
"author":"Rebecca Moses Dmello"
}
```


@DeleteMapping
localhost:8080/books/id
Note: Replace id with your record present in MongoDB eg."653268"





