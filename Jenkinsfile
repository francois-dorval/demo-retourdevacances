pipeline {
    agent any

    tools {
        jdk "jdk17-0-5"
    }

    stages {
        stage('Build') {
            steps {
               
               git 'https://github.com/francois-dorval/demo-retourdevacances'
                    sh "chmod +x ./gradlew"
                     sh "./gradlew build"
                
               
                
            }
        }
        
          stage('coucou') {
            steps {
               sh "echo 'coucou'"

            }
        }
    }
}
