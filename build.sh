#!/bin/sh
./gradlew clean :app:fatJar -x test
cat ./compile.sh ./app/build/libs/app-1.0-SNAPSHOT-all.jar > ./dist/unix/keva-server
echo "Done"
