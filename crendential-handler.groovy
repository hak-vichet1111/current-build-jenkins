pipeline {
    agent any
    environment {
        // Use double quotes when assigning environment variables
        MINIO_ACCESS_KEY = asdnfikhasdfkhadskuhsadfhsdf
        MINIO_SECRET_KEY = sdafkhi2973fi282913qih9q83ry9238
    }
    stages {
        stage('Show Credentials') {
            steps {
                script {
                    // Using single quotes inside script to prevent interpolation
                    sh """
                        echo 'Using stored credentials...'
                        echo 'Access Key: $MINIO_ACCESS_KEY'
                        echo 'Secret Key: ********'  # Don't print secrets!
                    """
                }
            }
        }
        stage('Connect to Minio') {
            steps {
                script {
                    sh """
                        mc alias set myminio http://192.168.100.51:9000 "$MINIO_ACCESS_KEY" "$MINIO_SECRET_KEY"
                        mc alias ls myminio
                    """
                }
            }
        }
    }
}