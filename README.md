# Livraria API

## Como Rodar a API

### Passo a Passo

### Confira que você tem o java 21

1. **Baixar o Projeto**
   ```bash
   git clone https://github.com/seu-usuario/livraria.git
   cd livraria
   ```

2. **Configurar o Banco de Dados**
   ```sql
   CREATE DATABASE crud_bpk;
   ```
   Atualize `src/main/resources/application.properties` se necessário:
   ```ini
   spring.datasource.url=jdbc:postgresql://localhost:5432/crud_bpk
   spring.datasource.username= seu usuario no postgres
   spring.datasource.password= sua senha do banco de dados
   ```

3. **Rodar a Aplicação**
   ```bash
   ./mvnw spring-boot:run
   ```

## Funcionalidades do CRUD de Usuário

- **Criar Usuário**
  - `POST /usuarios`
  - Request Body:
    ```json
    {
      "nome": "João Silva"
    }
    ```

- **Buscar Usuário por ID**
  - `GET /usuarios/{id}`
  - Response:
    ```json
    {
      "id": 1,
      "nome": "João Silva"
    }
    ```

- **Buscar Todos os Usuários**
  - `GET /usuarios`
  - Response:
    ```json
    [
      {
        "id": 1,
        "nome": "João Silva"
      },
      {
        "id": 2,
        "nome": "Maria Oliveira"
      }
    ]
    ```

- **Atualizar Usuário**
  - `PUT /usuarios/{id}`
  - Request Body:
    ```json
    {
      "nome": "João Pedro Silva"
    }
    ```

- **Deletar Usuário**
  - `DELETE /usuarios/{id}`


## Fotos do Código em Funcionamento

*A seguir o fluxo demonstrando o funcionamento da api com os 5 metodos basicos e respostas com http apropriadas*
<img src="https://github.com/giovaniocan/CrudProvaBpk/blob/main/img/1.png" alt="Texto Alternativo">
<img src="https://github.com/giovaniocan/CrudProvaBpk/blob/main/img/2.png" alt="Texto Alternativo">
<img src="https://github.com/giovaniocan/CrudProvaBpk/blob/main/img/3.png" alt="Texto Alternativo">
<img src="https://github.com/giovaniocan/CrudProvaBpk/blob/main/img/4.png" alt="Texto Alternativo">
<img src="https://github.com/giovaniocan/CrudProvaBpk/blob/main/img/5.png" alt="Texto Alternativo">
<img src="https://github.com/giovaniocan/CrudProvaBpk/blob/main/img/6.png" alt="Texto Alternativo">
<img src="https://github.com/giovaniocan/CrudProvaBpk/blob/main/img/7.png" alt="Texto Alternativo">
