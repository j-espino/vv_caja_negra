package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class EqualsTest {

	private static Stream<Arguments> generateArgumentsStream() {
		List<Arguments> listOfArguments = new LinkedList<>();

		listOfArguments.add(Arguments.of(new SingleLinkedListImpl<>(), new SingleLinkedListImpl<>(), true));
		listOfArguments.add(Arguments.of(new SingleLinkedListImpl<>("A", "B", "C"), new SingleLinkedListImpl<>("A", "B", "C"), true));
		listOfArguments.add(Arguments.of(new SingleLinkedListImpl<>("A", "B", "C"), new SingleLinkedListImpl<>("A", "C"), false));
		listOfArguments.add(Arguments.of(new SingleLinkedListImpl<>("A", "B"), new SingleLinkedListImpl<>(), false));


		return listOfArguments.stream();
	}


	@ParameterizedTest
	@MethodSource("generateArgumentsStream")
	void equalsTest(SingleLinkedListImpl<String> list, SingleLinkedListImpl<String> sameList, boolean expected) {
		if (expected)
			assertEquals(list, sameList);
		else
			assertNotEquals(list, sameList);
	}
}
