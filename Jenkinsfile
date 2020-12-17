pipeline {
    agent any

    stages {
        stage('pull code') {
            steps {
                echo 'pull code'
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'c5014337-086f-4fd0-bd8f-409145f69712', url: 'https://github.com/randolphvip/myprice.git']]])
            }
        }
        stage('build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('code checking ') {
                    steps {

                             //Global Tool Configuration 配置 scaner
                       def  scannerHome = tool 'sonar-scaner' ;

                        withSonarQubeEnv('sonarQubeServers') {
                            sh '${scannerHome}/bin/sonar-scanner'
                        }

                    }
                }
         stage('package') {
            steps {
                echo 'package'
            }
        }
    }
}
