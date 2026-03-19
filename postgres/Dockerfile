FROM postgres:15

ENV POSTGRES_DB=mydatabase
ENV POSTGRES_PASSWORD=system
ENV POSTGRES_USER=postgres

COPY init.sql /docker-entrypoint-initdb.d/
EXPOSE 5432