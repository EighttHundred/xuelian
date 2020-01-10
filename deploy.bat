@echo off
set TARGET="%CATALINA_HOME%\webapps\xuelian_requirement"
if exist %TARGET% (
    echo '文件夹已存在'
) else (
md %TARGET%
)
xcopy target\xuelian_requirement %TARGET% /s /e /c /y /h /r