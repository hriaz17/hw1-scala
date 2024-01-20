name := "hw1-scala"

version := "1.0-SNAPSHOT"

organization := "edu.arizona.cs"

scalaVersion := "2.12.8"

scalacOptions ++= Seq("-feature", "-unchecked", "-deprecation")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.1" % "test",
  "ch.qos.logback" % "logback-classic" % "1.0.10",
  "org.slf4j" % "slf4j-api" % "1.7.10"
)
