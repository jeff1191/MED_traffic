name := "MED_traffic"

version := "0.1"

scalaVersion := "2.12.2"

val sparkVersion = "2.4.3"
val tess4jVersion = "4.3.1"

// https://mvnrepository.com/artifact/org.apache.spark/spark-core
libraryDependencies += "org.apache.spark" %% "spark-core" % sparkVersion
// https://mvnrepository.com/artifact/org.apache.spark/spark-streaming
libraryDependencies += "org.apache.spark" %% "spark-streaming" % sparkVersion 
// https://mvnrepository.com/artifact/org.apache.spark/spark-sql-kafka-0-10
libraryDependencies += "org.apache.spark" %% "spark-sql-kafka-0-10" % sparkVersion 
libraryDependencies += "org.apache.spark" %% "spark-sql" % sparkVersion
// https://mvnrepository.com/artifact/net.sourceforge.tess4j/tess4j
libraryDependencies += "net.sourceforge.tess4j" % "tess4j" % tess4jVersion




