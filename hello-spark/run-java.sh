rm -rf ./testresult
spark-submit --class org.example.App target/hello-spark-1.0-SNAPSHOT.jar 'local[*]' ./pom.xml ./testresult
