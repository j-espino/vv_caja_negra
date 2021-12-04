package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseTest {

	private static Stream<Arguments> generateArgumentsStream() {
		List<Arguments> listOfArguments = new LinkedList<>();

		listOfArguments.add(Arguments.of(new SingleLinkedListImpl<>(), new SingleLinkedListImpl<>()));
		listOfArguments.add(Arguments.of(new SingleLinkedListImpl<>("A", "B", "C"), new SingleLinkedListImpl<>("C", "B", "A")));

		return listOfArguments.stream();
	}


	@ParameterizedTest
	@MethodSource("generateArgumentsStream")
	void reverseTest(SingleLinkedListImpl<String> list, SingleLinkedListImpl<String> reverseList) {
		assertEquals(list.reverse().toString(), reverseList.toString());
	}
}
