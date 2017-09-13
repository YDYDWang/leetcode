SELECT C.Name AS Customers
  FROM Customers C
  LEFT JOIN Orders O ON O.CustomerId = C.Id
 WHERE O.CustomerId IS NULL