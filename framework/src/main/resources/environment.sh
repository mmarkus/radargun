#!/bin/sh

export JAVA_HOME=/home/mmarkus/jdk1.6.0_23
PATH=$JAVA_HOME/bin:$PATH

BIND_ADDRESS=`/sbin/ifconfig eth1 | grep -v inet6 | grep inet | cut -d':' -f2 | cut -d' ' -f1`
JG_FLAGS="-Dresolve.dns=false -Djgroups.timer.num_threads=4"
JVM_OPTS="-server -Xmx1024M -Xms1024M"
JVM_OPTS="$JVM_OPTS $JG_FLAGS"

