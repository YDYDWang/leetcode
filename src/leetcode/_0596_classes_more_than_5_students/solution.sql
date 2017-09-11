SELECT class FROM (
    SELECT student, class
      FROM courses
     GROUP BY student, class
 ) C
 GROUP BY class
HAVING COUNT(student) >= 5
