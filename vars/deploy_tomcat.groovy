def call () {
sh "scp -o StrictHostKeyChecking=no **/*.war ec2-user@3.111.198.203:/opt/tomcat/webapps/"
}
