#!/usr/bin/env bash
DIR=`cd \`dirname ${BASH_SOURCE[0]}\`/.. && pwd`

mvn package

profile='dev'

while getopts "p:" OPT; do
    case $OPT in
        p)
            profile=$OPTARG
            ;;
    esac
done

##deploy
screen java -jar -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=$profile target/HouseKeeping-1.0-SNAPSHOT.jar