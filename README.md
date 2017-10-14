# simpleSbt
Simple SBT project to reproduce issue within IntelliJ

If I impose the scalaVersion and if it is different from sbt underlying scala version,
I observe an error inside IntelliJ when running the test with an error like:

Error: scala: No 'scala-library*.jar' in Scala compiler library as described [here](https://stackoverflow.com/questions/24019834/error-scala-no-scala-library-jar-in-scala-compiler-library)