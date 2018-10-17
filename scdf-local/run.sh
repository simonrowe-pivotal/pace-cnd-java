java -jar bin/spring-cloud-dataflow-server-local-1.6.3.RELEASE.jar \
--spring.datasource.url=jdbc:mysql://localhost:3306/dataflow \
--spring.datasource.username=root \
--spring.datasource.password=root \
--spring.datasource.driver-class-name=org.mariadb.jdbc.Driver \
--spring.cloud.dataflow.applicationProperties.stream.spring.rabbitmq.host=rabbitmq \
--maven.remote-repositories.repo3.url=http://repo.spring.io/test-libs-snapshot-local
