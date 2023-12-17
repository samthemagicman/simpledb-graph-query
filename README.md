### Project: Implement Graph Queries in Relational Database 

#### Property graph model: 
- Nodes represent entities, and edges represent relationships between these entities.
- Both nodes and edges can have associated properties (key-value pairs).
- Used in graph databases like Neo4j and Amazon Neptune.

---

#### Requirement: 
1. This project uses Postgres Database running on local host port 5432. 
2. This project connects to a Database name: graphs (Make sure a database with this name exists).

---

#### Steps to Run: 
<!-- Add the steps to run here -->

---

#### Different modules: 

##### src/Client: 
- app.java: reads the input Cypher queries and writes the output in the output.txt file. 
- client.java: parses Cypher queries using the src/graph and executes their SQL equivalent using src/db.

##### src/db: 
- DBConnector.java: Creates a connection to the Postgres Database with the username and password. It is used by other functions/classes. 
- CreateData.java: This class connects to the "graphs" database and creates example data to work with.
- DBHelper.java: runs various SQL queries based on Graph query methods and returns the data. 

##### src/graph:  
- grammar: 
- visitor: 

##### src/model: 
- Node: 
- Relationship:
  
---

#### Contribution: 

