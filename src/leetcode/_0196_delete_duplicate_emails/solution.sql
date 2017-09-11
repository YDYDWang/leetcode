DELETE FROM Person
  WHERE ID NOT IN (
    SELECT * FROM (SELECT MIN(ID) 
      FROM Person 
     GROUP BY Email) AS P
  )
