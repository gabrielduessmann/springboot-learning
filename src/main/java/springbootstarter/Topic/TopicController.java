package springbootstarter.Topic;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController
{

	// dependency injection
	@Autowired
	private TopicService topicService;

	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return topicService.getAllTopics();
	}

	@RequestMapping("/topics/{topicId}")
	public Topic getOneTopic(@PathVariable("topicId") String id){
		return topicService.getOneTopic(id);
	}
}
