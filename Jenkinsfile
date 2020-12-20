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
            echo 'building......'
              sh 'mvn clean '
            }
        }
        stage('code checking ') {
                    steps {

                             //Global Tool Configuration 配置 scaner
                        script{
                            scannerHome = tool name:  'SonarScanner' , type: 'hudson.plugins.sonar.SonarRunnerInstallation'
                        }


                        withSonarQubeEnv('sonarQubeServers') {
                            echo "check code ? ......  ${CodeCheck}"
                            //temporary cancel code scan. the reason is that scanning need energy.
                             //   sh  "${scannerHome}/bin/sonar-scanner"

                        }
                    }
                }
         stage('package docker file') {
            steps {
                echo '  '

                 sh "mvn package"

            }
        }
    }
}
