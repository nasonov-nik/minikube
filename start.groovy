pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('test'){
            steps {
                //sh 'kubectl get deployment'
                sh 'pwd'
                def my_host = sh(script: "ls -l", returnStdout: true)
                println("host: ${host}")
            }
        }
    }
}