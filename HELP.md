# Fundamentals of Spring Security

No business logic. It is simple.

## Endpoints

### Retrieve List of Pets

This endpoint returns a list of pets.

#### HTTP Request

`GET /pet`

#### Response

The response is a list of `PetResponseDto` objects, each containing the following fields:

- `name` (String): The name of the pet.

#### Example Response

```json
[
    {
        "name": "Orejas"
    },
    {
        "name": "Puppy"
    }
]
```

#### cURL Example

You can test this endpoint using `cURL` as follows:

```bash
curl -X GET http://localhost:8080/pet -H "Accept: application/json"
```
