node {
    
    environment {
        PROJECT_NAME = "Neptun"
        OWNER_NAME = "Vadim Konovalov"
    }

    stages {
        stage('1-Build') {
            steps {
                echo "Start of Stage Build"
                echo 'Building............'
                echo "End of Stage Build"
            }
        }
         stage('2-Test') {
            steps {
                echo "Start of Stage Test"
                echo 'Testing............'
                sh "ls -la"
                echo "Hello ${OWNER_NAME}"
                echo "Project name is ${PROJECT_NAME}"
                echo "End of Stage Test"
            }
        }
        stage('3-Deploy') {
            steps {
                echo "Start of Stage Deploy"
                echo 'Deploying............'
                sh '''
                echo "Line1"
                echo "Line2"
                '''
                echo "End of Stage Deploy"
            }
        }
    }
}