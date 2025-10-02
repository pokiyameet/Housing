# 🏠 Housing Data REST API (Spring Boot + MySQL)

This project is a **REST API** built with **Spring Boot** that processes housing data from a JSON file (`housing_data.json`) and stores it into a **MySQL database**.  
It provides endpoints to query housing prices (average, maximum, location-based) **directly using SQL queries** instead of Java calculations.

---

## 🚀 Features / APIs

1. **Load Housing Data**
   - Reads `housing_data.json` and stores the records in MySQL.  

2. **Get Overall Average Sale Price**
   - Returns the average sale price across all houses.  

3. **Get Average Sale Price by Location**
   - Returns a grouped list of average prices per location.  

4. **Get Maximum Sale Price**
   - Returns the highest sale price from the dataset.  

5. **Get Average Price for a Given Location**
   - Takes `location` as input and returns the average price of houses in that location.  

---

## 🛠️ Tech Stack

- **Java 17+**  
- **Spring Boot 3+**  
- **Spring Data JPA** (with native SQL queries)  
- **MySQL**  
- **Maven / Gradle**  

---
