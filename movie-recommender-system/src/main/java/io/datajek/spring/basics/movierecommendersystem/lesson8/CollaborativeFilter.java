package io.datajek.spring.basics.movierecommendersystem.lesson8;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;

@Component
@Qualifier("CF")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CollaborativeFilter implements Filter {
	
	
	
	CollaborativeFilter() {
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$CREATED$$$$$$$$$$ CF");
	}
	
	@Override
	public String[] getRecommendations(String movie) {
		// logic of collaborative filter
		return new String[] {};
	}
}
