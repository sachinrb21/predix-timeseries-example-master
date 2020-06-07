ADD Demo_Idp/target/BankAPP1-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps
EXPOSE 9090
copy Demo_Idp/tomcat-users.xml /usr/local/tomcat/conf
copy Demo_Idp/context.xml /usr/local/tomcat/webapps/manager/META-INF
#ENTRYPOINT ["java", "-jar", "BankAPP1-0.0.1-SNAPSHOT.war"]