pipeline {
    agent any

    stages{
        stage('Source') {
            steps {
                git 'https://github.com/datafriend0/Project4.git'

                sh "npm install"

                echo 'Source Stage Finished'
            }
        }

    stage('Test') {
        steps {
            sh "ng test --browsers ChromeHeadless watch=false"
            echo 'Test Stage Finished'
        }
    }

    stage('Build') {
        steps {
            sh "ng build"
            echo 'Build Stage Finished'
            }
        }
    
    stage('Containerize') {
        steps {
            sh "ng containerize"
            echo 'Containerize Stage Finished'
        }
    }
    
    stage('Deploy') {
        steps {
            sh "ng deploy"
            echo 'Deploy Stage Finished'
        }
    }
    }
}

    