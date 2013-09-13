package com.bls

import org.codehaus.groovy.grails.commons.GrailsApplication

class MyTestService {

  // this bean is defined in src/groovy but is injectable because of the @Component annotation
  MyBean1 myBean1
  MyProtoBean myProtoBean
  GrailsApplication grailsApplication

    def serviceMethod() {

    }

  def printMyBean1() {
    myBean1.name = "MyBean1 from MyTestService"
    myBean1.printName()
  }


  def printProtoBean() {
    MyProtoBean myProtoBean = grailsApplication.mainContext.getBean("myProtoBean") as MyProtoBean
    myProtoBean.printName()
  }

  def printInjectedProtoBean() {
    println "Injected ProtoBean: "
    myProtoBean.printName()

  }
}
