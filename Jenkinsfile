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
		stage ('Unit Tests') {
			steps {
				sh 'ant -f test.xml -v '
				junit 'reports/result.xml'
			}
		}
	
	}
	post {
		always {
			archiveArtifacts artifacts:  'dist/*.jar', fingerprint: true
		}
	}
}

