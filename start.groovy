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
                script(sh'hostname -' ,returnStdout: true)
            }
        }
    }
}