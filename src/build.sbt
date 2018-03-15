name := "spark-dbscan-fork-2.10-1.6.0"

organization := "org.alitouka"

version := "0.0.4"

libraryDependencies += "org.apache.spark" % "spark-core_2.10" % "1.6.0" % "provided"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.1.3" % "test"

libraryDependencies += "org.apache.commons" % "commons-math3" % "3.2"

libraryDependencies += "com.github.scopt" %% "scopt" % "3.2.0"

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"

resolvers += Resolver.sonatypeRepo("public")

publishTo := Some(Resolver.file("file",  new File(Path.userHome.absolutePath+"/.m2/repository")))