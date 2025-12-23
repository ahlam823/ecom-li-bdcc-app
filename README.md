# 🧩 Spring Boot Microservices Application

## 📌 Description
Ce projet est une application basée sur une **architecture microservices** développée avec **Spring Boot** et **Spring Cloud**.  
Il permet la gestion des clients, des produits (inventaire) et de la facturation à travers plusieurs services indépendants communiquant via un **API Gateway**.

---

## 🏗️ Architecture du projet
L’architecture repose sur les composants suivants :

- **Config Service** : gestion centralisée de la configuration
- **Discovery Service (Eureka)** : enregistrement et découverte des microservices
- **Gateway Service** : point d’entrée unique de l’application
- **Customer Service** : gestion des clients
- **Inventory Service** : gestion des produits
- **Billing Service** : gestion des factures

<img width="566" height="572" alt="image" src="https://github.com/user-attachments/assets/cd89f47e-6c71-4684-a202-2785ad264865" />


---



---

## 🖥️ Interfaces utilisateur

### Customer Service
Interface web permettant l’affichage et la gestion des clients.
<img width="274" height="199" alt="image" src="https://github.com/user-attachments/assets/88a74f27-0787-4595-a53d-4eb7b300478e" />
<img width="1607" height="493" alt="image" src="https://github.com/user-attachments/assets/307ed448-6a12-4971-8d73-21310bd10d25" />
<img width="1442" height="314" alt="image" src="https://github.com/user-attachments/assets/fb483fca-35f0-4025-b8a9-1f335f81a89f" />
<img width="1871" height="647" alt="image" src="https://github.com/user-attachments/assets/8b2cbf58-9a5e-4763-9199-825afeac8a3d" />



---

## 🔄 Communication entre services
- Communication REST via **Spring Cloud Gateway**
- Découverte dynamique des services via **Eureka**
- Configuration externalisée via **Spring Cloud Config**

---

## 🛠️ Technologies utilisées
- Java 17
- Spring Boot
- Spring Cloud
- Spring Cloud Config
- Spring Cloud Netflix Eureka
- Spring Cloud Gateway
- Spring Data JPA
- REST API
- Maven
- Git & GitHub

---


