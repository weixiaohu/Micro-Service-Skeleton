@echo on
mvn clean -e -U package -Dmaven.test.skip=true & java -jar .\target\mss-foo-1.0.0.jar