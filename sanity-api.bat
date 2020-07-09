set path=C:\Users\gcp111093\Downloads\apache-maven-3.6.3\bin;C:\Program Files\Java\jdk-13.0.2\bin;C:\Windows\System32;

mvn install -DDcucumber.options="--tags @sanity --plugin json:report/cucumber.json --plugin junit:target/junitreports.xml"