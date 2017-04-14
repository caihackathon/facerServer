set PROJECT_NAME=facerServer
set CATALINA_HOME=C:\apache-tomcat-9.0.0.M18
set BUILD_TARGET=C:\Workspace\%PROJECT_NAME%\target\%PROJECT_NAME%.war

wmic process list | findstr /V findstr | findstr /I catalina
if %ERRORLEVEL%==1 goto :startit

:hotdeploy
REM Deploy .war file
copy %BUILD_TARGET% %CATALINA_HOME%\webapps

goto end

:startit
REM cleanup
del /S /F /Q %CATALINA_HOME%\temp\*.tmp

del /S /F /Q %CATALINA_HOME%\work
rmdir /s /q %CATALINA_HOME%\work

del /F /Q %CATALINA_HOME%\webapps\%PROJECT_NAME%.war
del /S /F /Q %CATALINA_HOME%\webapps\%PROJECT_NAME%
rmdir /s /q %CATALINA_HOME%\webapps\%PROJECT_NAME%

REM Deploy .war file
copy %BUILD_TARGET% %CATALINA_HOME%\webapps

REM Start Tomcat
%CATALINA_HOME%\bin\startup.bat

:end

dir %CATALINA_HOME%\webapps
