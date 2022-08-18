package io.datajek.spring.basics.movierecommendersystem.lesson3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;
@Component
@Primary
public class CollaborativeFilter implements Filter {
	@Override
	public String[] getRecommendations(String movie) {
		// logic of collaborative filter
		return new String[] {};
	}
}
