package br.com.spread.tarefa.infrastructure;

import java.net.InetSocketAddress;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

import de.bwaldvogel.mongo.MongoServer;
import de.bwaldvogel.mongo.backend.memory.MemoryBackend;

@Configuration
public class SpringMongoConfig extends AbstractMongoConfiguration {

	private MongoServer server;
	private InetSocketAddress serverAddress;

	public SpringMongoConfig() {
		server = new MongoServer(new MemoryBackend());
		serverAddress = server.bind();
	}

	@Override
	public String getDatabaseName() {
		return "yourdb";
	}

	@Override
	@Bean
	public Mongo mongo() throws Exception {
		return new MongoClient(serverAddress.getHostName(), serverAddress.getPort());
	}
}