pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                 bat "C:/Maven/apache-maven-3.9.5/bin/mvn clean package
"
            }
        }
        stage('Test') {
            steps {
                 bat "C:/Maven/apache-maven-3.9.5/bin/mvn test"
            }
        }
         
    }
}
