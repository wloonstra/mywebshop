mvn clean package -Dmaven.test.skip=true
$CATALINA_HOME/bin/shutdown.sh
rm $CATALINA_HOME/webapps/mywebshop.war
rm -rf $CATALINA_HOME/webapps/mywebshop
cp target/*.war $CATALINA_HOME/webapps/mywebshop.war
$CATALINA_HOME/bin/startup.sh 
