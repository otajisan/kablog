name := "kablog"

version := "0.1"

scalaVersion := "2.12.4"

val springVersion = "1.5.9.RELEASE"

libraryDependencies ++= Seq(
  "org.springframework.boot" % "spring-boot-starter-web" % springVersion,
  "org.springframework.boot" % "spring-boot-starter-thymeleaf" % springVersion
//  "org.thymeleaf" % "thymeleaf-spring3" % "3.0.9.RELEASE"
)

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs@_*) => MergeStrategy.discard
  case x => MergeStrategy.first
}