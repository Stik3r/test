FROM postgres:18

ENV POSTGRES_DB=mydatabase
ENV POSTGRES_PASSWORD=system
ENV POSTGRES_USER=postgres

COPY postgres/init.sql /docker-entrypoint-initdb.d/
EXPOSE 5432