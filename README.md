# WalletManager

### Примечание:
В требованиях было указано 'Spring 3'. Так как данная версия устарела (EOL), решение реализовано на актуальной версии Spring Boot 3 (3.5.11).

## Настройка инструментов
### Docker PostgreSQL (PS)
```yaml
docker run -d `
--name wallet_db `
-e POSTGRES_PASSWORD=root `
-e POSTGRES_USER=postgres `
-e POSTGRES_DB=postgres `
-p 5432:5432 `
-v pgdata:/var/lib/postgresql/data `
postgres:17
```

