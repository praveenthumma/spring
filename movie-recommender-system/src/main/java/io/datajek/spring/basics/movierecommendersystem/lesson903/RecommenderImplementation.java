package io.datajek.spring.basics.movierecommendersystem.lesson903;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Named
public class RecommenderImplementation {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Inject
	@Qualifier("CF")
	private Filter filter;

	public Filter getFilter() {
		return filter;
	}

	public void setFilter(Filter filter) {
		logger.info("In RecommenderImplementation setter method..dependency injection");
		this.filter = filter;
	}

	RecommenderImplementation(Filter filter) {

		super();
		this.filter = filter;
	}

	public String[] recommendMovies(String movie) {
		// use content based filter to find similar movies
		// return the results

		// ContentBasedFilter filter = new ContentBasedFilter();
		String[] results = filter.getRecommendations(movie);
		return results;
	}

	@PostConstruct
	public void postConstruct() {
		// initialization code goes here
		logger.info("In RecommenderImplementation postConstruct method################");
	}

    @PreDestroy
    public void preDestroy() {
        //cleanup code
        logger.info("In RecommenderImplementation preDestroy method>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }	
	
}
