localPath=`pwd`;
mvn archetype:generate -DgroupId="$1" -DartifactId="$2" -DarchetypeArtifactId=maven-archetype-site-simple -DinteractiveMode=false -DarchetypeCatalog=local;
cd $localPath"/$2";rm -rf src;
