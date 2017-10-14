# simpleSbt
Simple SBT project to reproduce issue within IntelliJ

If I impose the scalaVersion to 2.11.11 and if I use sbt version 1.0.2,
I observe an error inside IntelliJ when running the test with an error like:

Error: scala: No 'scala-library*.jar' in Scala compiler library as described [here](https://stackoverflow.com/questions/24019834/error-scala-no-scala-library-jar-in-scala-compiler-library)

The problem does not appear if I play with sbt version in 0.13.16 (build.properties)