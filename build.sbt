

lazy val root = project
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "gsoc-project1",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "3.6.4",

    libraryDependencies ++= Seq(
    "com.raquo" %%% "laminar" % "0.14.2",
    "org.scala-js" %%% "scalajs-dom" % "2.6.0",
    "org.scala-js" %% "scalajs-env-jsdom-nodejs" % "1.1.0",
    "org.scalameta" %% "munit" % "1.0.0" % Test
    ),


    scalaJSUseMainModuleInitializer := true
  )

