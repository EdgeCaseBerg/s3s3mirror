

organization := "org.cobbzilla"

name := "s3s3mirror"
 
// http://semver.org/ for versioning. We'll reach 1.0.0 when we have a working mvp

version := "1.2.6-SNAPSHOT"
 
scalaVersion := "2.11.7"

javacOptions ++= Seq("-source", "1.6")

val slf4jVersion = "1.6.4"

val junitVersion = "4.8"

libraryDependencies ++= Seq(
	// Logging
	"org.slf4j" % "slf4j-api" % slf4jVersion,
	"org.slf4j" % "jcl-over-slf4j" % slf4jVersion,
	"org.slf4j" % "slf4j-log4j12"	 % slf4jVersion,
	"log4j" % "log4j" % "1.2.16" % "runtime",
	"junit" % "junit" % junitVersion % "test",
	"commons-io" % "commons-io" % "2.4" % "test",
	"commons-lang" % "commons-lang" % "2.6" % "test",
	"args4j" % "args4j" % "2.0.23",
	"joda-time" % "joda-time" % "2.9.4",
	"com.amazonaws" % "aws-java-sdk" % "1.11.48",
	"org.projectlombok" % "lombok" % "1.16.10" % "compile"

)