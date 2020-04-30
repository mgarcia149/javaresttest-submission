# javaresttest-submission
Assignment for NJC Labs

This is a general database that will have an item name, description, and amount in stock. The purpose of
this program is for use with Postman to run the POST, GET, PUT, and DELETE commands to edit the mysql database.
Coded in java with use of springboot.

how to use.

MySql workbench and the server must be running so it has a database to connect to.
I assume mysql workbench is setup to have connections accepted.

create a database called 'items' within mysql workbench on a local server connection.


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

This will create the needed tables/columns within MySql workbench under the item database.
If successful, the server will respond with a message about the entry in JSON format along with the ID number, 
the ID is needed for the follow steps below...

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
