pipeline {
    agent any

    environment {
        JAVA_HOME = 'C:/Program Files/Java/JDK/jdk-17.0.9'
    }

    stages {
        stage('Checkout') {
            steps {
                script {
                    // Récupérer le code depuis le système de contrôle de version (Git, par exemple)
                    checkout scm
                }
            }
        }

        stage('Build') {
            steps {
                script {
                    // Construire l'application Spring Boot avec Maven
                    bat 'C:/JEE/crud-etudiant/mvnw.cmd clean install'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    // Exécuter les tests
                    bat 'C:/JEE/crud-etudiant/mvnw.cmd test'
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    // Déployer l'application (le déploiement dépend de votre infrastructure)
                    // Exemple : Copie du fichier WAR vers un serveur Tomcat
                    bat 'copy C:/JEE/crud-etudiant/target/crud-etudiant.war C:/xampp/tomcat/webapps'
                }
            }
        }
    }

    post {
        success {
            echo 'Le pipeline a été exécuté avec succès! Félicitations!'
            // Ajoutez des étapes supplémentaires en cas de succès
        }
        failure {
            echo 'Le pipeline a échoué. Vérifiez les logs pour plus d\'informations.'
            // Ajoutez des étapes supplémentaires en cas d'échec
        }
    }
}
