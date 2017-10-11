pipeline {
	agent any
	
	stages {
	   stage ('build') {
			environment {
				MAJOR_VERSION = "1.0"
				}
			steps {
				sh 'ant -f build.xml -v'
			}
		}
	}
	post {
		always {
			archiveArtifacts artifacts:  'dist/*.jar', fingerprint: true
		}
	}
}

