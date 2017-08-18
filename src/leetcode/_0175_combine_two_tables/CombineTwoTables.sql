package leetcode._0175_combine_two_tables;AS 'LastName', CITY AS 'City', STATE AS 'State'
  FROM PERSON P
  LEFT JOIN ADDRESS A ON A.PERSONID = P.PERSONID;