scalaVersion := "2.13.8"
version := "1.0"
name := "hello-spark"

libraryDependencies ++= Seq(
    "org.apache.spark" %% "spark-core" % "3.4.0" % "provided",
    "org.apache.spark" %% "spark-streaming" % "3.4.0" % "provided",
    "org.apache.spark" %% "spark-hive" % "3.4.0" % "provided",
    "org.apache.spark" %% "spark-graphx" % "3.4.0" % "provided",
    "org.apache.spark" %% "spark-streaming-kafka-0-10" % "3.4.0" % "provided",
    "org.apache.spark" %% "spark-mllib" % "3.4.0" % "provided",
    "org.scalatest" %% "scalatest" % "3.2.16" % Test
)