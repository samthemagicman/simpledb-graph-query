Project: Implement Graph Queries in Relational Database

Requirment: 
1. This projects uses Postgres Database running on local host port 5432. 
2. This project connects to a Database name: graphs (Make sure a database with this name exists).


Steps to Run: 



Different modules: 

src/Client: 
- app.java: reads the input cypher queries and writes the output in the output.txt file. 
- client.java: parses cypher queries using the src/graph and execute their SQL equivalent using src/db.


src/db: 
- DBConnector.java: Creates a connection to Postgres Database with the username and password. It is used by other functions/classes. 
- CreateData.java: This class connects to the graphs database and creates example data to work with.
- DBHelper.java: runs various SQL queries based on Graph query methods and returns the data. 


src/graph:  
- grammar: 
- visitor: 


src/model: 
- Node: 
- Relationship: 