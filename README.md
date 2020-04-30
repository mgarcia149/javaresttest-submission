# javaresttest-submission
Assignment for NJC Labs

how to use.

MySql workbench and the server must be running so it has a database to connect to.
I assume mysql workbench is setup to have connections accepted.

create a database called 'items'


Open project in eclipse 
open the application.properties and edit the login to match your mql server's login info
 
Open src/main/java
Open javaresttest.springboot

assuming you have the springboot plugin installed on ecpilse, if not it can be installed
by opening the esclipes market under the 'help' tab, searching springboot and installing the
fist result.

right click JavaRestTestApplication.java and run as springboot

springboot should be booting...

Open postman and type 'http://localhost:8080/api/item' in the address bar
click the body tab
JSON is used with POST to send info.
have 'raw' selected and the format being JSON

The format is as followed for POST:

{
   "itemName": "Laptop Computer",
    "itemDesc": "Dual core laptop with windows 10",
    "amount": "12"
}

for GET

'http://localhost:8080/api/item/1'   where the '1' is the id.

to PUT (edit an entry)

'http://localhost:8080/api/item/1'   where the '1' is the id.

{
   "itemName": "Gaming Laptop Computer",
    "itemDesc": "Quad core laptop with windows 10",
    "amount": "5"
}

This entry above will change the entry with ID of '1'
changes in the database reflect this.

to DELETE 

'http://localhost:8080/api/item/1'   where the '1' is the id.

This will delete the first entry in the database that has the id of 1.
