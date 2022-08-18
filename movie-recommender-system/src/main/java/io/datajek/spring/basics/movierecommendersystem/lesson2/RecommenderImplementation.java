package io.datajek.spring.basics.movierecommendersystem.lesson2;

public class RecommenderImplementation {
	
	private Filter filter;
	
	RecommenderImplementation(Filter filter) {
		
		super();
		this.filter = filter;
	}

    public String[] recommendMovies (String movie) {
        //use content based filter to find similar movies
        //return the results
    	
    	//ContentBasedFilter filter = new ContentBasedFilter();
    	 String[] results = filter.getRecommendations(movie);
        return results;
    }
}
