pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                 bat "C:/PROGRA~1/Maven/apache-maven-3.9.5/bin/mvn clean package
"
            }
        }
        stage('Test') {
            steps {
                 bat "C:/PROGRA~1//Maven/apache-maven-3.9.5/bin/mvn test"
            }
        }
         stage('Deploy') {
            steps {
                 bat 'C:/PROGRA~1//Docker/Docker/resources/bin/docker-compose up -d --build'
            }
        }
    }
}