package com.bls

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

/**
 * Created by IntelliJ IDEA.
 * User: youngsoul
 * Date: 9/13/13
 * Time: 11:05 AM
 */
@Component("myBean2")
class MyBean2 {
  String name
  String id = java.util.UUID.randomUUID().toString()

  @Autowired
  MyTestService2Service myTestService2Service

  String printName() {
    println "MyBean2 name is $name with id = $id"
  }

  String printService() {
    println "MyBean2 calling MyTestService2Service"
    myTestService2Service.serviceMethod()
  }

}
