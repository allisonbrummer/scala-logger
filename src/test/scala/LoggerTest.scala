package io.github.allisonbrummer

import org.scalatest.FunSpec

class LoggerSpec extends FunSpec {
    describe("A STDOutLogger") {

        it("should print a string and return Some") {
            var testLogger = new STDOutLogger
            testLogger.log("Test Message") match {
                case Some(result) => assert(true)
                case None => assert(false)
            }
        }

    }
}