package springbootstarter.Topic;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

// Business server

@Service
public class TopicService
{
		private List<Topic> topics = Arrays.asList(
			new Topic("Spring", "Spring framework", "Spring tutorial"),
			new Topic("Spring2", "Spring framework 2", "Spring tutorial 2"),
			new Topic("Spring3", "Spring framework 3", "Spring tutorial 3"),
			new Topic("Spring4", "Spring framework 4", "Spring tutorial 4")
		);

		public List<Topic> getAllTopics(){
			return topics;
		}
}
