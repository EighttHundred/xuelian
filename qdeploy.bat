@echo off
set TARGET="%CATALINA_HOME%\webapps\xuelian_requirement\WEB-INF\jsp"
set SOURCE="src\main\webapp\WEB-INF\jsp"
if exist %TARGET% (
    echo '文件夹已存在'
) else (
md %TARGET%
)
xcopy %SOURCE% %TARGET% /s /e /c /y /h /r