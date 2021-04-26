# InventoryManager

## Curl Commands
### curl localhost:8080/api/vehicles

### curl -X POST localhost:8080/api/vehicles -d "{\"id\": 3, \"color\": \"Red\", \"crew\": 1, \"passengers\": 2, \"name\": \"Pickup\", \"price\": 25000, \"engineSize\": \"5.0L\", \"numWheels\": 4, \"doors\": 4, \"type\": 1}" -H "Content-Type:application/json"