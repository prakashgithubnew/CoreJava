**What is JDBCTemplate**
--------------------------

JdbcTemplate is a class provided by the Spring JDBC module that simplifies database 
interaction by handling the complexities of JDBC (Java Database Connectivity),
such as resource management, connection handling, and exception translation.

jdbcTemplate.update(sql, id, name, dept); //for insert and update

jdbcTemplate.query(sql, new EmployeeRowMapper());//query


**Find average from one of the column in the table**
----------------------------------------------------

SELECT AVG(column_name)
FROM table_name;

**Find second highest in SQL**
-------------------------------

SELECT MAX(salary) AS second_highest_salary
FROM employees
WHERE salary < (SELECT MAX(salary) FROM employees);


**Find the third highest in SQL**
---------------------------------

SELECT salary FROM employees ORDER BY salary DESC LIMIT 1 OFFSET 2;

This query orders the salary column in descending order, skips the first two highest values 
(using OFFSET 2),and retrieves the third highest.


**How do you count the number of records in a table without using COUNT(*)**
----------------------------------------------------------------------------
SELECT COUNT(id) FROM your_table;

**Difference between Count(*) and count() in oracle**
-----------------------------------------------------
Count * counts null also

**What is the difference between DELETE and TRUNCATE?**
-------------------------------------------------------
delete can delete the records using where clause where as truncate can delete all records at one go.

Truncate is faster than delete.








