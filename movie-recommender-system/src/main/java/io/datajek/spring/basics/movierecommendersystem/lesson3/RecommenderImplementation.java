package io.datajek.spring.basics.movierecommendersystem.lesson3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;

@Component
public class RecommenderImplementation {
	@Autowired
	private Filter filter;

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
}
