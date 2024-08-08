## Spring Boot + Spring Security + Keycloak

### Exemplo de uso do Keycloak para realizar a autenticação e autorização para acessar os endpoints da aplicação.

### Configurar Keycloak via Docker

```
docker run -p 8080:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:25.0.2 start-dev
```

### Acessar o consoel do Keycloak
```
http://localhost:8080/admin
```

### Exemplo de requisição para gerar o token via Keycloak

```
curl --request POST \
  --url http://localhost:8080/realms/myrealm/protocol/openid-connect/token \
  --header 'Content-Type: application/x-www-form-urlencoded' \
  --data grant_type=password \
  --data client_id=meuclient \
  --data username=renanlessa \
  --data password=renan123
```
