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

*Adicione aqui as capturas de tela mostrando a API em funcionamento.*
