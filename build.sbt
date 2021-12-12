ThisBuild / resolvers += "Artima Maven Repository".at("https://repo.artima.com/releases")

// zzzzzzzzzzzzzzzzzzzz Common Modules zzzzzzzzzzzzzzzzzzzz

lazy val reactivemongoBsonJodaTime = project
  .in(file("base/reactivemongo/bson-joda-time"))
  .configure(BaseModules.reactivemongoBsonJodaTimeProfile)

// zzzzzzzzzzzzzzzzzzzz Implicits Modules zzzzzzzzzzzzzzzzzzzz

lazy val implicitsBoolean = project
  .in(file("implicits/boolean"))
  .configure(ImplicitsModules.booleanProfile)

lazy val implicitsCollection = project
  .in(file("implicits/collection"))
  .configure(ImplicitsModules.collectionProfile)

// zzzzzzzzzzzzzzzzzzzz Wrappers Modules zzzzzzzzzzzzzzzzzzzz

lazy val wrappersBaseLogging = project
  .in(file("wrappers/base/logging"))
  .configure(WrappersModules.baseLoggingProfile)

// zzzzzzzzzzzzzzzzzzzz ZIO Modules zzzzzzzzzzzzzzzzzzzz

lazy val zioMonitoringPrometheus = project
  .in(file("zio/monitoring/prometheus"))
  .configure(ZioModules.monitoringPrometheusProfile)

lazy val zioReactivemongo = project
  .in(file("zio/reactivemongo"))
  .configure(ZioModules.reactivemongoProfile)

// format: off
inThisBuild(
  List(
    organization := "io.kinoplan",
    homepage := Some(url("https://github.com/kinoplan/utils")),
    licenses := Seq("Apache-2.0" -> url("https://opensource.org/licenses/Apache-2.0")),
    developers := List(Developer("kinoplan", "Kinoplan", "job@kinoplan.ru", url("https://kinoplan.tech"))),
    scmInfo := Some(
      ScmInfo(
        url("https://github.com/kinoplan/utils"),
        "scm:git:git@github.com:kinoplan/utils.git"
      )
    )
  )
)

onChangedBuildSource in Global := ReloadOnSourceChanges
// format: on
