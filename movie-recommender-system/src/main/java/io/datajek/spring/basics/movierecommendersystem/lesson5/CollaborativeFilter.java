package io.datajek.spring.basics.movierecommendersystem.lesson5;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;
@Component
public class CollaborativeFilter implements Filter {
	@Override
	public String[] getRecommendations(String movie) {
		// logic of collaborative filter
		return new String[] {};
	}
}
