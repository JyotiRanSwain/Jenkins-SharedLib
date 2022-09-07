def call () {
sshagent(['8bc97ec4-b421-492e-83a1-be266d890f7c']) {
 sh "scp -o StrictHostKeyChecking=no **/*.war ec2-user@${params.staging_server}:/opt/tomcat/webapps/"
} 
}
