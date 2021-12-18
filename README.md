# Upgrade log4j2 replacing log4j info

 + log4j2 maven version 2.17.0

````maven
	<dependency>
		<groupId>org.apache.logging.log4j</groupId>
		<artifactId>log4j-api</artifactId>
		<version>2.17.0</version>			
	</dependency>
	<dependency>
		<groupId>org.apache.logging.log4j</groupId>
		<artifactId>log4j-core</artifactId>
		<version>2.17.0</version>
	</dependency>	
	<dependency>
		<groupId>org.apache.logging.log4j</groupId>
		<artifactId>log4j-1.2-api</artifactId>
		<version>2.17.0</version>
	</dependency>
````

 + Maven check dependencies

````cmd
 mvn dependency:tree
 
[INFO] Scanning for projects...
[INFO] 
[INFO] ----------------------< hello-world:hello-world >-----------------------
[INFO] Building hello-world 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-dependency-plugin:2.8:tree (default-cli) @ hello-world ---
[INFO] hello-world:hello-world:jar:0.0.1-SNAPSHOT
[INFO] +- org.apache.logging.log4j:log4j-api:jar:2.17.0:compile
[INFO] +- org.apache.logging.log4j:log4j-core:jar:2.17.0:compile
[INFO] +- org.apache.logging.log4j:log4j-1.2-api:jar:2.17.0:compile
[INFO] +- org.apache.logging.log4j:log4j-slf4j-impl:jar:2.17.0:compile
[INFO] |  \- org.slf4j:slf4j-api:jar:1.7.25:compile
[INFO] +- commons-logging:commons-logging:jar:1.2:compile
[INFO] +- org.apache.logging.log4j:log4j-jcl:jar:2.17.0:compile
[INFO] \- org.apache.logging.log4j:log4j-jul:jar:2.17.0:compile
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 1.161 s
[INFO] Finished at: 2021-12-19T07:21:33+08:00
[INFO] ------------------------------------------------------------------------
````

 + Exclude conflicting dependencies

	| log4j Dependency | Dependencies to Exclude1 | Exclude2 | Exclude3 |
	| :--- | :--- | :--- | :--- |
	| [log4j-1.2-api](log4j-1.2-api) | log4j:log4j | org.slf4j:log4j-over-slf4j ||
	| [log4j-core](log4j-core) | log4j:log4j | ch.qos.logback:logback-core | org.apache.logging.log4j:log4j-to-slf4j |
	| [log4j-jcl](log4j-jcl) | org.slf4j:jcl-over-slf4j |||
	| [log4j-jul](log4j-jul) | org.slf4j:jul-to-slf4j |||
	| [log4j-slf4j-impl](log4j-slf4j-impl) | org.apache.logging.log4j:log4j-to-slf4j| ch.qos.logback:logback-core ||

 + Reference

[log4j2 FAQ](https://logging.apache.org/log4j/2.x/faq.html)

[log4j2 VS jul LOG level](https://logging.apache.org/log4j/2.x/log4j-jul/index.html)
	
[slf4j manual](http://www.slf4j.org/manual.html)

[java-util-logging Level.FINE no show](https://stackoverflow.com/questions/6315699/why-are-the-level-fine-logging-messages-not-showing)
	
	