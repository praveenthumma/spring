package io.datajek.spring.basics.movierecommendersystem.lesson903;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import io.datajek.spring.basics.movierecommendersystem.lesson901.Filter;

@Named
@Qualifier("CF")
public class CollaborativeFilter implements Filter {
	@Override
	public String[] getRecommendations(String movie) {
		// logic of collaborative filter
		return new String[] {};
	}
}
