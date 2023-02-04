pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage {
            steps('test') {
                sh 'oc get deployment'
            }
        }
    }
}