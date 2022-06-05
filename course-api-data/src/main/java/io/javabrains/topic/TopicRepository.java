package io.javabrains.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String>{
	//getAllTopic();
	//getTopic(String id)
	//updateTopic(Topic t)
	//deleteTopic(String id)
}
