package io.datajek.spring.basics.movierecommendersystem.lesson9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;
@Component
@Primary
@Qualifier("CBF")
public class ContentBasedFilter implements Filter {
	
	private static int instances =0;
	
    @Autowired
    private Movie movie;
	
	ContentBasedFilter() {
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$CREATED$$$$$$$$$$ CBF");
		instances++;
		System.out.println("######################## Instances = " + instances);
	}
	
	@Override
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale2"};
    }
	
    public Movie getMovie() {
        return movie;
    }

    public static int getInstances(){
        return ContentBasedFilter.instances;
    }


}