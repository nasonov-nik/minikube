pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('test'){
            steps {
                def outputCommand String
                //sh 'kubectl get deployment'
                sh 'pwd'
                my_host = sh(script: 'pwd', returnStdout: true)
                //println("host: ${my_host}")
            }
        }
    }
}