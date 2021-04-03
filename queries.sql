## Part 1: Test it with SQL
--id: int
--employer: varchar(255)
--name: varchar(255)
--skills: varchar(255)

## Part 2: Test it with SQL

SELECT name
FROM employer
WHERE location = "St. Louis City"

## Part 3: Test it with SQL

DROP TABLE job;

## Part 4: Test it with SQL

SELECT skill.name, skill.description
FROM skill
WHERE
ORDER BY skill.name;

--OR

SELECT skill.name, skill.description, job.name
FROM skill
LEFT OUTER JOIN job_skills ON skill.id = job_skills.skills_id
INNER JOIN job ON job_skills.jobs_id = job.id
ORDER BY job.name, skill.name;

