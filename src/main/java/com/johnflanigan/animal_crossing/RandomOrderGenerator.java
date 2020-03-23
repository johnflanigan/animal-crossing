package com.johnflanigan.animal_crossing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RandomOrderGenerator {

	public static final int WHITE_FLOWERS = 10;
	public static final int RED_FLOWERS = 5;
	public static final int YELLOW_FLOWERS = 5;
	public static final Logger LOGGER = LoggerFactory.getLogger(RandomOrderGenerator.class);

	public static void main(String[] args) {

		Map<Integer, Color> flowers = new HashMap<>();

		int totalFlowers = 0;
		for (int i = totalFlowers; i < WHITE_FLOWERS; i++) {
			flowers.put(i, Color.WHITE);
		}
		totalFlowers += WHITE_FLOWERS;

		for (int i = totalFlowers; i < totalFlowers + RED_FLOWERS; i++) {
			flowers.put(i, Color.RED);
		}
		totalFlowers += RED_FLOWERS;

		for (int i = totalFlowers; i < totalFlowers + YELLOW_FLOWERS; i++) {
			flowers.put(i, Color.YELLOW);
		}

		LOGGER.info("Size: {}", flowers.size());
		List<Integer> keys = new ArrayList<>(flowers.keySet());
		Collections.shuffle(keys);

		for (int key : keys) {
			LOGGER.info("Color: {}", flowers.get(key));
		}
	}
}
