package io.datajek.spring.basics.movierecommendersystem.lesson902;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		System.out.println("Working");
		
		//ContentBasedFilter filter = new ContentBasedFilter();
		RecommenderImplementation recommender = context.getBean(RecommenderImplementation.class);
		
		//RecommenderImplementation recommender2 = new RecommenderImplementation(new CollaborativeFilter());
		
		
		String  [] result = recommender.recommendMovies("Finding Dory");
		
		System.out.println(Arrays.toString(result));
		
	    //Retrieving prototype bean from application context twice
	    Movie m1 = context.getBean(Movie.class);
	    System.out.println(m1);

	    Movie m2 = context.getBean(Movie.class);
	    System.out.println(m2);
		
		//String  [] result2 = recommender2.recommendMovies("Finding Dory");
		//System.out.println(Arrays.toString(result2));
	}

}
