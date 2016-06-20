
rm -rf $M2_REPO/net/beaconhillcott/moodle-rest/0.1.6/moodle-rest-0.1.6.jar
mvn install:install-file -DgroupId=net.beaconhillcott -DartifactId=moodle-rest -Dversion=0.1.6 -Dpackaging=jar -Dfile=dist/MoodleRest.jar
