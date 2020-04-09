Goal of the project
This is a POC to show how to fetch multiple rows in database by Quering on a set of database

For Example, Table has the following structure

Table Name: CASE_INFORMATION
Column Name:
1. CASE_ID
2. CASE_NAME
3. CASE_DESC
4. Entity_ID
primary key: CASE_ID+ENTITY_ID
ForeignKey: ENTITY_ID

Table Name: ENTITY_INFORMATION
Column Name:
1. ENTITY_ID
2. ENTITY_NAME
3. ENTITY_DESC
primary key: ENTITY_ID

Goal1: Create a rest interface to set the values
Goal2: Create a Model class to set these values
Goal3: Create Hibernate Capabilities to add these properties