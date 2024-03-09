# Utilisez une image OpenJDK 17 comme base
FROM openjdk:17-jdk-slim

# Définissez le répertoire de travail dans le conteneur
WORKDIR /app

# Copiez le fichier JAR de votre application dans le conteneur
COPY target/crud-etudiant-0.0.1-SNAPSHOT.jar /app/crud-etudiant-0.0.1-SNAPSHOT.jar

# Exposez le port sur lequel votre application s'exécute
EXPOSE 8082

# Commande pour démarrer votre application Spring Boot
CMD ["java", "-jar", "crud-etudiant-0.0.1-SNAPSHOT.jar"]
