 Simple CRUD API
-------------------------------
It is a CRUD API made with a simple model with username and password. All GET, POST, PUT, and DELETE functions were implemented. The API was tested using POSTMan.

## Used technique 
 Kotlin + JPA + Spring boot + MySQL + gradle

## Web address
1. POST  
add a new user  
`http://localhost:8080/demo/user`  
write information of user write in a body  
{  
   "username" : "write username",  
   "password" : "write password"  
}
2. GET 
   - get all users  
     `http://localhost:8080/demo/users`
   - get user with id  
     `http://localhost:8080/demo/user/{id}`
   - get user with username  
     `http://localhost:8080/demo/user`
   
3. PUT  
update the user information  
   `http://localhost:8080/demo/user/{id}`
write new information of user in a body  
{  
"id" : 1,  
"username" : "write username".  
"password" : "write password"  
}
4. DELETE  
delete user information with id  
`http://localhost:8080/demo/user/{id}`