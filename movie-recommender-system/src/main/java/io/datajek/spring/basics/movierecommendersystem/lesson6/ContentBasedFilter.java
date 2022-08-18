package io.datajek.spring.basics.movierecommendersystem.lesson6;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;
@Component
@Primary
@Qualifier("CBF")
public class ContentBasedFilter implements Filter {
	
	@Override
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale2"};
    }


}