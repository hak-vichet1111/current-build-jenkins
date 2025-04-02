/* groovylint-disable-next-line CompileStatic */
pipeline {
    agent any
    stages {
        stage('Hello') {
            step {
                sh 'echo Hello World'
                echo "Build number is ${currentBuild.number}"
            }
        }
    }
}
