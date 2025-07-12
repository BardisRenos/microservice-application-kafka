# Microservices with Kafka Integration

This project demonstrates a simple microservice architecture where an **Order Service** produces messages to a Kafka topic, and a **Store Service** consumes those messages.

---

## 🚀 Services Overview

### 🟩 Order Service
- Port: `8081`
- Role: Produces `Order` events to Kafka
- Kafka Broker: `localhost:29092`
- Topic: `order.sent.to.store`

### 🟦 Store Service
- Port: `8082`
- Role: Consumes `Order` events from Kafka
- Kafka Broker: `localhost:29092`
- Topic: `order.sent.to.store`

---

## 🔄 Kafka Configuration

- Topic: `order.sent.to.store`
- Kafka Broker: `localhost:29092`
- Consumer Group IDs:
  - Order Service: `order-group`
  - Store Service: `store-group`

---

## 🧪 How to Run

### 1. Start Kafka (Example with Docker)
```bash
docker-compose up -d
```

### 2. Start the Services 

```bash
# Start Order Service
cd OrderService
./mvnw spring-boot:run

# Start Store Service
cd StoreService
./mvnw spring-boot:run

```
## 📊 Architecture Diagram

![Architecture Diagram](https://github.com/BardisRenos/microservice-application-kafka/blob/main/image/kafka-structure.png)


