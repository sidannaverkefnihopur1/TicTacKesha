@echo off


call mvn test-compile failsafe:integration-test
