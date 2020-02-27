package org.steinko.spektutorial
import org.steinko.spektutorial.Person
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature
import org.junit.jupiter.api.Assertions.assertEquals

class PersonTest: Spek ({
    
       Feature("Person Tests ") {
          Scenario("Should display firstname Stein") {

           val person = Person("Stein","Korsveien")
           Then("Should Display first name Stein") {
              val firstName = person.firstName()  
              assertEquals("Stein",firstName)
           }
          }
          
          Scenario("Should display firstname Oddmund") {

           val person = Person("Oddmund","Korsveien")
           Then("Should Display first name Oddmund") {
              val firstName = person.firstName()  
              assertEquals("Oddmund",firstName)
           }
          }
       }
})
