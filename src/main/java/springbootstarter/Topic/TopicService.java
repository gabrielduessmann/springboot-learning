package springbootstarter.Topic;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Business server

@Service
public class TopicService
{
	@Autowired
	private TopicRepository topicRepository;

		public List<Topic> getAllTopics(){
			List<Topic> topics = new ArrayList<>();
			topicRepository.findAll()
			.forEach(topics::add);
			return topics;
		}
		public Topic getOneTopic(String id){
			return topicRepository.findById(id).orElse(null);
		}

		public void addTopic(Topic topic){
			topicRepository.save(topic);
		}

		public void updateTopic(Topic topic, String id){
			topicRepository.save(topic);
		}

		public void deleteTopic(String id){
			topicRepository.deleteById(id);
		}
}
