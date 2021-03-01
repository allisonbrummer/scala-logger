package io.github.allisonbrummer

/**
 * @author ${user.name}
 */
object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    println( "Hello World!" )
    println("concat arguments = " + foo(args))

    var myLogger = new STDOutLogger
    testLogger(myLogger)

  }

  def testLogger(logger: Logger) = {
    val logMsg = "Test log message"
    
    logger.log(logMsg) match {
      case Some(result) => println("RESULT: It worked!")
      case None => println("RESULT: It's broke!")
    }
  }

}