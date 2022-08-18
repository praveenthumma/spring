package io.datajek.spring.basics.movierecommendersystem.lesson915;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
@Qualifier("CBF")
public class ContentBasedFilter implements Filter {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public String[] getRecommendations(String movie) {
		// logic of content based filter
		return new String[] { "Happy Feet", "Ice Age", "Shark Tale2" };
	}

	@PostConstruct
	private void postConstruct() {
		// load movies into cache
		logger.info("In ContentBasedFilter postConstruct methodmethod###############");
	}
	
    @PreDestroy
    private void preDestroy() {
        //clear movies from cache
        logger.info("In ContentBasedFilter preDestroy method>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

}