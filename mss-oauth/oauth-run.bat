@echo on
mvn clean -e -U package -Dmaven.test.skip=true & java -jar .\target\mss-oauth-1.0.0.jar