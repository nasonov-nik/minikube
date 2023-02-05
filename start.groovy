pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('test'){
            steps {
                def my_host String
                //sh 'kubectl get deployment'
                sh 'pwd'
                my_host = sh(script: 'pwd', returnStdout: true)
                //println("host: ${my_host}")
            }
        }
    }
}