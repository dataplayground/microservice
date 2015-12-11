name := """spark-microservices"""

organization := "de.geoheil"

version := "0.1"

lazy val `spark-microservices` = (project in file(".")).aggregate(frontend, backend)

lazy val frontend = (project in file("services/frontend")).enablePlugins(PlayScala)
lazy val  backend = (project in file("services/backend"))

//TODO there must be a better way to fix this
//mainClass in `spark-microservices` := (mainClass in "services/frontend" in Compile).value

//val runAll = inputKey[Unit]("Runs all subprojects")

//runAll := {
//  (run in Compile in frontend).evaluated
//  (run in Compile in backend).evaluated
//}

//fork in run := true

// enables unlimited amount of resources to be used :-o just for runAll convenience
//concurrentRestrictions in Global := Seq(
//  Tags.customLimit( _ => true)
//)
