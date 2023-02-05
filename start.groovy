pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('test'){
            steps {
                //sh 'kubectl get deployment'
                sh 'ls -la'
                sh 'pwd'
                def host = sh (script: "hostname -i", returnStdout: true)
                println("host: ${host}")
            }
        }
    }
}