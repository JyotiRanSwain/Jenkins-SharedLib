def call () {
 sh "scp -o StrictHostKeyChecking=no **/*.war ec2-user@${params.staging_server}:/opt/tomcat/webapps/"
}
