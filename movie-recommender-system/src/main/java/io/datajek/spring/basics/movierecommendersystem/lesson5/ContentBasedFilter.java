package io.datajek.spring.basics.movierecommendersystem.lesson5;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;
@Component
@Primary
public class ContentBasedFilter implements Filter {
	
	@Override
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale2"};
    }


}