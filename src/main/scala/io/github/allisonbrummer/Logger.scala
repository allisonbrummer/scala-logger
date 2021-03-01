package io.github.allisonbrummer

/**
  * Provides classes to write logs to various systems
  * 
  * @author Allison Brummer
  * @version 0.1.0
  */
package object logger {

}

/** 
  * Defines an interface for logging classes
  */
abstract class Logger {
    def log(msg: String): Option[Unit]
}

/**
  * A class for writing logs to standard out
  *
  */
class STDOutLogger extends Logger {
    
    /**
      * Logs message to standard out
      *
      * @param msg The log message
      * @return Some when successful, none on error
      */
    def log(msg: String): Option[Unit] = {
        try {
            Some(println(msg))
            
        } catch {
            case e: Exception => None
        }
    }
}