package com.agileware.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoClientURI;
@Configuration
public class MongoConfig extends AbstractMongoConfiguration {

	@Value(value = "${mongo.mongoAddress}")
    private String mongoAddress;
	@Value(value = "${mongo.mongoPort}")
    private int mongoPort;
	@Value(value = "${mongo.mongoClass}")
    private String mongoClass;
	@Value(value = "${mongo.mongoActiveDb}")
    private String mongoActiveDb;
	
	@Value(value = "${mongo.connection.uri}")
    private String mongoUri;
	

	@Value(value = "${mongo.max.connection.per.host:100}")
    private Integer maxConnectionPerHost;
	
	@Value(value = "${mongo.min.connection.per.host:10}")
    private Integer minConnectionPerHost;
	
	@Value(value = "${mongo.max.connection.idle.timeout:10000}")
    private Integer maxConnectionIdleTimeout;
	
	@Value(value = "${mongo.socket.keep.alive:true}")
    private Boolean socketKeepAlive;
	
	
	@Override
	protected String getDatabaseName() {
		return "agileware";
	}



	@Override
	protected String getMappingBasePackage() {
		return mongoClass;
	}

	@Bean(name = "mongoTemplate")
	public MongoTemplate mongoTemplate() throws Exception {
		return new MongoTemplate(mongoClient(), mongoActiveDb);
	}

	@Override
	public MongoClient mongoClient() {
	
		MongoClientOptions.Builder builder= MongoClientOptions.builder().maxConnectionIdleTime(maxConnectionIdleTimeout).socketKeepAlive(socketKeepAlive).connectionsPerHost(maxConnectionPerHost).minConnectionsPerHost(minConnectionPerHost);
		MongoClientURI uri = new MongoClientURI(mongoUri,builder);
			return new MongoClient(uri);
	}


}