SpringWiringAnnotations
=======================

sample application to show the usage of Spring wiring annotations for classes in src/groovy

This is simple sample that shows how to use @Scope, @Component and @Autowired Spring annotations in a Grails applications.

The key to making these work in is the Config.groovy file.  You need to add the following with the packages that Spring to scan to find annotated bean.


grails.spring.bean.packages = ['com.bls']

The idea was to keep the bean definitions out of resources.groovy or resources.xml and keep them only in the actual groovy files with the use of the Annotations.

