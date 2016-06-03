package br.com.spread.tarefa.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import br.com.spread.tarefa.infrastructure.SpringMongoConfig;


/**
 * @author Leandro.Marcos
 * Classe Abstrata para operações básicas de banco
 * @param <T>
 */
public abstract class AbastractDAO<T> implements DAO<T> {

	ApplicationContext ctx;
	MongoOperations mongoOperation;
	protected Class<T> entityClass;

	@SuppressWarnings("unchecked")
	public AbastractDAO() {
		ctx = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
		mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");

		ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
		this.entityClass = (Class<T>) genericSuperclass.getActualTypeArguments()[0];
	}

	public void create(T entity) {
		mongoOperation.save(entity);
	}

	public List<T> findAll() {
		return mongoOperation.findAll(entityClass);
	}

	public T findBy(String field, String query) {
		Query searchQuery = new Query(Criteria.where(field).is(query));

		return mongoOperation.findOne(searchQuery, entityClass);
	}
	
	public List<T> findByField(String field, String query){
		Query searchQuery = new Query(Criteria.where(field).is(query));
		
		return mongoOperation.find(searchQuery, entityClass);
	}
	
	

}
