#!/bin/sh
pwd=`pwd`
cd ${0%/*}
java -Xmx128M -Dsun.io.useCanonCaches=false -cp libs/robocode.jar:libs/roborumble.jar:libs/codesize-1.1.jar roborumble.RoboRumbleAtHome ./roborumble/teamrumble.txt
cd $pwd
