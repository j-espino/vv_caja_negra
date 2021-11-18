package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class IsSubListTest {


	private static Stream<Arguments> generateArgumentsStream() {
		List<Arguments> listOfArguments = new LinkedList<>();

		listOfArguments.add(Arguments.of(new SingleLinkedListImpl<>(), new SingleLinkedListImpl<>(), 0)); //CP1
		listOfArguments.add(Arguments.of(new SingleLinkedListImpl<>(), new SingleLinkedListImpl<>("E", "F"), -1)); //CP2
		listOfArguments.add(Arguments.of(new SingleLinkedListImpl<>(), new SingleLinkedListImpl<>(), 0)); //CP3
		listOfArguments.add(Arguments.of(new SingleLinkedListImpl<>("A", "B", "C", "D"), new SingleLinkedListImpl<>("B", "C"), 2)); //CP4
		listOfArguments.add(Arguments.of(new SingleLinkedListImpl<>("A", "B", "C", "D"), new SingleLinkedListImpl<>("E", "F"), -1)); //CP5
		listOfArguments.add(Arguments.of(new SingleLinkedListImpl<>("A", "B", "C", "D"), new SingleLinkedListImpl<>(), 0)); //CP6

		return listOfArguments.stream();
	}

	@ParameterizedTest
	@MethodSource("generateArgumentsStream")
	void isSubListTest(SingleLinkedListImpl<String> list, SingleLinkedListImpl<String> part, int expected) {
		assert (expected == list.isSubList(part));
	}
}
