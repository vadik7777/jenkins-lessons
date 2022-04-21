node('Node1') {
        stage('1-Build') {
                echo "Start of Stage Build"
                echo 'Building............'
                echo "End of Stage Build"
        }
         stage('2-Test') {
                echo "Start of Stage Test"
                echo 'Testing............'
                sh "ls -la"
                echo "End of Stage Test"
        }
        stage('3-Deploy') {
                echo "Start of Stage Deploy"
                echo 'Deploying............'
                sh '''
                echo "Line1"
                echo "Line2"
                '''
                echo "End of Stage Deploy"
        }
}