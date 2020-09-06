package springbootstarter.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic
{

	// Primary Key
	@Id
	private String id;
	private String name;
	private String description;

	// Constructor
	public Topic(String id, String name, String description)
	{
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	// Easier to initialize
	// Non constructor
	public Topic()
	{
	}

	// Getters and setters

	@Id
	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public static Topic getOne(Topic topic){
		return new Topic (topic.getId(), topic.getName(), topic.getDescription());
	}


}
