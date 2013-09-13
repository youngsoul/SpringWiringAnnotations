package com.bls

import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

/**
 * Created by IntelliJ IDEA.
 * User: youngsoul
 * Date: 9/13/13
 * Time: 11:35 AM
 */
@Component("myProtoBean")
@Scope("prototype")
class MyProtoBean {
  String id = java.util.UUID.randomUUID().toString()

  void printName() {
    println "MyProtoBean  with id = $id"
  }


}
