def call () {
sh 'aws configure set region ap-south-1'
sh 'aws s3 cp ./target/*.war s3://fudzeo'
}
