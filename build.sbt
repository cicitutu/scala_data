//organization := "com.github.wangzaixiang"

name := "scala-sql"

version := "2.0.2"

scalaVersion := "2.12.4"

crossScalaVersions := Seq("2.11.11", "2.12.4")


libraryDependencies +=  "com.github.wangzaixiang" %% "scala-sql" % "2.0.2"
libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-api" % "1.7.9",
  "org.scala-lang" % "scala-reflect" % scalaVersion.value,

  "com.h2database" % "h2" % "1.4.184" ,
  "junit" % "junit" % "4.12" ,
  "ch.qos.logback" % "logback-classic" % "1.1.3"  ,
  "mysql" % "mysql-connector-java" % "5.1.38"
)
publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (version.value.endsWith("SNAPSHOT"))
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

/*
pomExtra := (
  <url>http://github.com/wangzaixiang/scala-sql</url>
    <licenses>
      <license>
        <name>BSD-style</name>
        <url>http://www.opensource.org/licenses/bsd-license.php</url>
        <distribution>repo</distribution>
      </license>
    </licenses>
    <developers>
      <developer>
        <id>wangzaixiang</id>
        <name>wangzaixiang</name>
        <url>http://wangzaixiang.github.io</url>
      </developer>
    </developers>)*/
