package io.datajek.spring.basics.movierecommendersystem.lesson915;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Qualifier("CF")
public class CollaborativeFilter implements Filter {
	@Override
	public String[] getRecommendations(String movie) {
		// logic of collaborative filter
		return new String[] {};
	}
}
