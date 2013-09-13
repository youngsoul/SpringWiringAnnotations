package com.bls

import org.springframework.stereotype.Component

/**
 * Created by IntelliJ IDEA.
 * User: youngsoul
 * Date: 9/13/13
 * Time: 11:04 AM
 */
@Component("myBean1")
class MyBean1 {
  String name
  String id = java.util.UUID.randomUUID().toString()

  String printName() {
    println "MyBean1 name is $name with id = $id"
  }
}
