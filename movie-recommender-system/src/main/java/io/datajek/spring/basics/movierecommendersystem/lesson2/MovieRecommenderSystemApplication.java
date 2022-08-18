package io.datajek.spring.basics.movierecommendersystem.lesson2;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		System.out.println("Working");
		
		ContentBasedFilter filter = new ContentBasedFilter();
		RecommenderImplementation recommender = new RecommenderImplementation(filter);
		
		RecommenderImplementation recommender2 = new RecommenderImplementation(new CollaborativeFilter());
		
		
		String  [] result = recommender.recommendMovies("Finding Dory");
		
		System.out.println(Arrays.toString(result));
		String  [] result2 = recommender2.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(result2));
	}

}
