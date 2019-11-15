@echo off
cls &echo                                               

set /p key=Press enter key to start
netsh wlan show profile
@echo off
set /p SSID=Enter any network SSID from the above ones: 
netsh wlan show profile %SSID% key=clear
echo Thanks for using this tool. Press any key for closing this window.
pause >nul