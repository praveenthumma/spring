package io.datajek.spring.basics.movierecommendersystem.lesson9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;

@Component
public class RecommenderImplementation {
	@Autowired
	@Qualifier("CF")
	private Filter contentBasedFilter;

	RecommenderImplementation(Filter filter) {

		super();
		this.contentBasedFilter = filter;
	}

	public String[] recommendMovies(String movie) {
		// use content based filter to find similar movies
		// return the results

		// ContentBasedFilter filter = new ContentBasedFilter();
		String[] results = contentBasedFilter.getRecommendations(movie);
		return results;
	}
}
