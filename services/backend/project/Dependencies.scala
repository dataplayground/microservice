import sbt.Keys._
import sbt._

trait Dependencies extends Excludes {
  this: Build =>

  val akkaActor = "com.typesafe.akka" %% "akka-actor" % V.akka
  val akkaHttp = "com.typesafe.akka" %% "akka-http-experimental" % V.akkaStreams
  val akkaHttpCore = "com.typesafe.akka" %% "akka-http-core-experimental" % V.akkaStreams
  val akkaHttpJson = "com.typesafe.akka" %% "akka-http-spray-json-experimental" % V.akkaStreams
  val akkaHttpXml = "com.typesafe.akka" %% "akka-http-xml-experimental" % V.akkaStreams
  val akkaHttpTestkit = "com.typesafe.akka" %% "akka-http-testkit-experimental" % V.akkaStreams
  val akkaParsing = "com.typesafe.akka" %% "akka-parsing-experimental" % V.akkaStreams
  val akkaRemote = "com.typesafe.akka" %% "akka-remote" % V.akka
  val akkaSlf4j = "com.typesafe.akka" %% "akka-slf4j" % V.akka
  val akkaStreams = "com.typesafe.akka" %% "akka-stream-experimental" % V.akkaStreams
  val akkaTestkit = "com.typesafe.akka" %% "akka-testkit" % V.akka
  val config = "com.typesafe" % "config" % V.config
  val logback = "ch.qos.logback" % "logback-classic" % V.logback


  val commonDeps = Seq(libraryDependencies ++= Seq(config, logback))


  val apiDeps = Seq(libraryDependencies ++= Seq(
    akkaHttp,
    akkaHttpCore,
    akkaHttpJson,
    akkaStreams))
}
