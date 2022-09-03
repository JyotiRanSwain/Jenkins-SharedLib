def call() {
  echo "Build success"
  sh 'mvn clean package'
  echo 'Archiving the artifacts'
  archiveArtifacts artifacts: '**/target/*.war'
}
