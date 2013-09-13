package com.bls

import org.aspectj.weaver.ast.ITestVisitor

import static org.junit.Assert.*
import org.junit.*

class MyTestServiceIntegrationTests {

  MyTestService myTestService
  MyBean2 myBean2
    @Before
    void setUp() {
        // Setup logic here
    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testSomething() {
      myTestService.printMyBean1()
      myTestService.printMyBean1()
      myTestService.printMyBean1()
    }

  @Test
  void testMyBean2() {
    myBean2.name = "My bean2 in test"
    myBean2.printName()
    myBean2.printService()
  }

  @Test
  void testMyProtoBean() {
    myTestService.printProtoBean()
    myTestService.printProtoBean()
    myTestService.printProtoBean()

  }

  @Test
  void testInjectedMyProtoBean() {
    myTestService.printInjectedProtoBean()
    myTestService.printInjectedProtoBean()
    myTestService.printInjectedProtoBean()

  }

}
