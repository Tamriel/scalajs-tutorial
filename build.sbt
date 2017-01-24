enablePlugins(ScalaJSPlugin)

name := "Scala.js Tutorial"

scalaVersion := "2.12.1"

libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.9.1"

skip in packageJSDependencies := false
jsDependencies +=
  "org.webjars" % "jquery" % "2.1.4" / "2.1.4/jquery.js"

jsDependencies += RuntimeDOM

// uTest settings
libraryDependencies += "com.lihaoyi" %%% "utest" % "0.4.4" % "test"
testFrameworks += new TestFramework("utest.runner.Framework")

persistLauncher := true

resolvers += "amateras-repo" at "http://amateras.sourceforge.jp/mvn/"

libraryDependencies += "com.scalawarrior" %%% "scalajs-ace" % "0.0.4"