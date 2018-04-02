name := """StudentInfoSystem"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.4"

crossScalaVersions := Seq("2.11.12", "2.12.4")

libraryDependencies += guice

// Database
libraryDependencies += javaJpa
libraryDependencies += javaJdbc
libraryDependencies += "org.hibernate" % "hibernate-core" % "5.2.14.Final"
libraryDependencies += "org.mariadb.jdbc" % "mariadb-java-client" % "2.2.2"

// GUI
libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.6.3",
  "org.webjars" % "bootstrap" % "4.0.0-2" exclude("org.webjars", "jquery"),
  "org.webjars" % "jquery" % "3.2.1"
)

libraryDependencies += "org.webjars" % "chartjs" % "2.7.0"
libraryDependencies += "org.webjars.npm" % "bootstrap-table" % "1.12.1"
libraryDependencies += "org.webjars.bower" % "popper.js" % "1.14.1"
libraryDependencies += "org.webjars" % "font-awesome" % "5.0.8"
libraryDependencies += "com.amazonaws" % "aws-java-sdk" % "1.11.301"


// Testing libraries for dealing with CompletionStage...
libraryDependencies += "org.assertj" % "assertj-core" % "3.6.2" % Test
libraryDependencies += "org.awaitility" % "awaitility" % "2.0.0" % Test

// Make verbose tests
testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a", "-v"))
