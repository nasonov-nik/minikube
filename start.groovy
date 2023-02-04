pipeline {
    agent any
    options {
        ansiColor('xterm')
    }
    stages {
        stage {
            steps('test') {
                sh 'oc get deployment'
            }
        }
    }
}