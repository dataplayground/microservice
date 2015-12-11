import sbt._

object Build extends Build with Settings with Dependencies {

  lazy val backend = project
    .in(file("."))
    .aggregate(api)

  lazy val api = project
    .in(file("modules/api"))
    .settings(projectSettings ++ commonDeps)

  //TODO: this does not work
  mainClass := Some("com.example.ApplicationMain")

}
