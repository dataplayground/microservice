name := """frontend"""

version := "1.0-SNAPSHOT"

lazy val frontend = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.webjars" % "bootstrap" % "3.3.5",
  "org.webjars" % "angularjs" % "1.4.7",
  "org.webjars" % "angular-ui-bootstrap" % "0.14.3",
  "org.webjars.bower" % "angular-websocket" % "1.0.14",
  specs2 % Test
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

// TODO: fix this for multi service build
// maybe: https://groups.google.com/forum/#!topic/simple-build-tool/0VAVdWNho_4 and http://stackoverflow.com/questions/28521226/how-to-share-sbt-plugin-configuration-between-multiple-projects
//pipelineStages := Seq(uglify, digest, gzip)
//pipelineStages in Assets := Seq()
//pipelineStages := Seq(uglify, digest, gzip)
//DigestKeys.algorithms += "sha1"
//UglifyKeys.uglifyOps := { js =>
//  Seq((js.sortBy(_._2), "concat.min.js"))
//}

//scalariformSettings
