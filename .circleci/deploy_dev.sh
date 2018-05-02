curl 
-F “status=2” 
-F “notify=1” 
-F “ipa=@APK FULL PATH(app/build/outputs/apk/app-debug.apk” 
-H “X-HockeyAppToken: 3df90e83bc724f998d40692fbe8eb908” 
https://rink.hockeyapp.net/api/2/apps/6bd491c3e9e24bdd879c22b1a55587ba/app_versions/upload
