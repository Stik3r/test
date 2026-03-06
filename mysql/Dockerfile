# Используем официальный образ MySQL
FROM mysql:8.0

# Устанавливаем переменные окружения для создания БД
ENV MYSQL_DATABASE=mydatabase
ENV MYSQL_ROOT_PASSWORD=root_password

# Копируем скрипт инициализации в спец. папку
COPY init.sql /docker-entrypoint-initdb.d/