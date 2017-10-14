import sbt.Keys._
import sbt._

organization := "test"
version := "0.0.1-SNAPSHOT"

//scalaVersion := "2.12.3"
scalaVersion := "2.11.11"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"