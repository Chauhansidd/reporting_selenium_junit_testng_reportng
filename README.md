Reporting with Selenum,JUnit, TestNG and ReportNG
==================================

This project basically provides an archetype/skeleton for working with Selenium,JUnit TestNG and ReportNG. You can use it for new projects or previous projects. 

This project can be run from command line or from an IDE,as per your choice.

### Running from command line:
If you want to run your proejct from command line you would need to setup one of the following build tools. This project currently supports [Maven](http://maven.apache.org) and [Gradle](http://www.gradle.org) for build and running. I presonally prefer gradle as it generate aesthetic reports for JUnit test cases.

##### Installing build tool:

Gradle : http://www.gradle.org/installation

Maven : http://maven.apache.org/download.cgi#Installation


##### Running from command line and Reports:
Follow the following steps to generatre repots of your test cases:

1. Place your scripts (old or new) in the following directory "src\test\java" with appropriate package structure.
2. Open shell and navigate to project root.
3. Run the test cases with following command. You can use Maven or Gradle as per your choice.
  * For Gradle : gradle test
  * For Maven : mvn test
4. After the test run is complete your reports would be present at the following location:
  * For Gradle : "build/reports/tests"
  * For Maven : "target"
5. Enjoy !  

#### Regarding IDEs:

You can convert this project to open it in IDE of your choice. For converting your maven project to IDE run the following command on project root folder.

* For IntelliJ IDEA use "mvn idea:idea".

* For Eclipse use "mvn eclipse:eclipse".

You would need maven for above task.

Author
======
Waleed Bin Dawood (waleed.dawood@confiz.com)
