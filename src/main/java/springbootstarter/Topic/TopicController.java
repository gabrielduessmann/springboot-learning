package springbootstarter.Topic;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic){
		topicService.addTopic(topic);
	}

	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
		topicService.updateTopic(topic, id);
	}

	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable String id){
		topicService.deleteTopic(id);
	}
}
