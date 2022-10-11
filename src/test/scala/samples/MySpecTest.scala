package samples

import org.specs2.mutable.SpecWithJUnit

/**
 * Sample specification.
 *
 * This specification can be executed with: scala -cp <your classpath=""> ${package}.SpecsTest
 * Or using maven: mvn test
 *
 * For more information on how to write or run specifications, please visit: 
 * http://etorreborre.github.com/specs2/guide/org.specs2.guide.Runners.html
 *
 */
class MySpecTest extends SpecWithJUnit {
  "Single test" >> {
    ok
  }
}
