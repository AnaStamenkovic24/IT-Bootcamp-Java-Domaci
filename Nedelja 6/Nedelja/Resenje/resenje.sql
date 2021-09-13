/*
	Resenja za Nedelju
Primetimo da kljucna rec AS ne mora da se navodi
*/


--1. Zadatak

--I nacin: Inner join
-- primetiti da inner join = join
SELECT email, phone_number FROM employees e
JOIN departments d ON e.department_id = d.department_id
JOIN locations l ON d.location_id = l.location_id
JOIN countries co ON l.country_id = co.country_id
JOIN regions r ON co.region_id = r.region_id
WHERE r.region_name = 'Europe' AND phone_number IS NOT NULL;


--II nacin: IN
SELECT email, phone_number FROM employees e
WHERE phone_number IS NOT NULL AND e.department_id IN (
	SELECT department_id from departments d
  	WHERE d.location_id IN (
    	SELECT location_id FROM locations l
      	WHERE l.country_id IN (
        	SELECT country_id FROM countries co
          	WHERE co.region_id IN (
            	SELECT region_id FROM regions
              	WHERE region_name = 'Europe'
            )
        )
    )
);

--III nacin: EXISTS
SELECT email, phone_number FROM employees e
WHERE phone_number IS NOT NULL AND EXISTS(
	SELECT department_id FROM departments d
  	WHERE e.department_id = d.department_id AND EXISTS(
    	SELECT location_id FROM locations l
      	WHERE d.location_id = l.location_id AND EXISTS(
        	SELECT country_id FROM countries co
          	WHERE l.country_id = co.country_id AND EXISTS(
            	SELECT region_id FROM regions r
              	WHERE co.region_id = r.region_id AND region_name = 'Europe'
            )
        )
    )
);


--2. Zadatak

SELECT first_name, last_name FROM dependents
WHERE relationship = 'Child' AND employee_id IN(
	SELECT employee_id FROM employees
  	WHERE salary = (
    	SELECT MAX(salary) FROM employees
    )
);


--3. Zadatak
-- Primetimo kako inner join je uvek najlaski nacin da se nesto izvodji.
-- S druge strane on je i najneefikasniji jer svaki put kada hocemo da izdvojimo par kolona
-- moramo da napravimo celu tabelu, dok oni nacini sa IN, EXISTS, ALL ... ne prave nove tabele
-- vec samo izdvajaju odgovarajuce kolone. Zato su one uvek mnogo bolja opcija od JOIN operacija!

SELECT country_name, SUM(salary) FROM countries co
JOIN locations l ON l.country_id = co.country_id
JOIN departments d ON d.location_id = l.location_id
JOIN employees e ON e.department_id = d.department_id
GROUP BY co.country_name
ORDER BY SUM(e.salary) DESC;
