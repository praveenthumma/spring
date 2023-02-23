# Spring Problems

## Cyclic Dependency
- Caused when we create 2 classes A and B , where A is delcared and Initilized in B and B in A
- Solve using __@Lazy__ Annotation

```java

@Service
public class FeedbackService {
	@Autowired
	@Lazy
	private ScheduleService scheduleService;	
}

```

or 
```java
@Service
public class FeedbackService {  
  private ScheduleService scheduleService;
	public FeedbackService(@Lazy ScheduleService scheduleService) {
		super();
		this.scheduleService = scheduleService;
	}	
}

```
