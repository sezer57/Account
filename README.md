# Account Api

This is Spring Boot application that performs financial transactions. It includes information about a customer, customer accounts, and a transaction data.

# Dependencies 
Lombok
H2Database
Springweb
Spring Data Jpa



## API Reference

For create Account :
```
 POST /v1/account
 Content-Type: application/json
 { 
    "customerId":"b9ce5056-affe-4784-b493-9a1fdc4dfa3a", 
    "initialCredit":"100"
 }
```

For get Customer accounts and transaction:
```
 GET /v1/customer/{customerId}
 Content-Type: application/json
 { 
   "id": "4a09e8ad-78ce-4e28-b083-4279dcdf36b2",
    "balance": 100,
    "customer": {
        "id": "b9ce5056-affe-4784-b493-9a1fdc4dfa3a",
        "name": "y",
        "surname": "s"
    },
    "transactions": [
        {
            "id": "d6403c73-594f-425a-bd09-b1ddbc1777c5",
            "transactionType": "INITIAL",
            "amount": 100,
            "transactionDate": "2023-02-14T01:33:50.276076"
        }
    ]
 }
```
