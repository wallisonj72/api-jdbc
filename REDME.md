# API COM JDBC, H2, SPRINGDOC

> URL para testar localmente a doc do Swagger
http://localhost:8080/swagger-ui/index.html

> URL para o metodo GET http://localhost:8080/clientes

> ### **Atenção:** Usar o RestClient para testar api!
### Techs Usadas:
> * Spring boot version: 3.4.4
> * Java version: 21
> * Banco H2
> * Spring JDBC
> * SrpingDoc OpenApi version: 2.5.0


### json enviado a api
```json
{
"id": 1,
"nome": "Wallison",
"email": "teste@gmail.com",
"cpf": "55566677788"
}
```
### Exemplo de uso do SringDoc (Swagger)
~~~java
public class ControllerCar {
    // Uso do Swagger aqui
    @Operation(sumary = "Metodo para listar carros", descripition = "Descrição")
    @GetMapping("/api")
    public void listar(Car car) {
        jdbcRepositoryImpl.list(car);
    }
}
~~~

### Git
> git init
> git config --global user.name ""
> git config --global user.email ""
Criando o repositorio remoto no github
> git add .
> git commit "Subindo o projeto"
> git branch -M main
> 

Teste de codigo

### Codigo java
```java
public void msg(String ms) {
    System.out.println(ms);
}
```

> Teste
> de testo