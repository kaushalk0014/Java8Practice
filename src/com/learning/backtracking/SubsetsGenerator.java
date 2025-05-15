package com.learning.backtracking;

import java.util.ArrayList;
import java.util.List;

public class SubsetsGenerator {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		List<List<Integer>> result = new ArrayList<>();

		backtrack(0, nums, new ArrayList<>(), result);
		System.out.println(result);
	}

	private static void backtrack(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {

		result.add(new ArrayList<>(current)); // Add current subset to result

		for (int i = index; i < nums.length; i++) {
			current.add(nums[i]); // Choose
			backtrack(i + 1, nums, current, result); // Explore
			current.remove(current.size() - 1); // Un-choose (backtrack)
		}
		//[[], [1], [1, 2], [1, 2, 3], [1, 3], [2], [2, 3], [3]]
	}
}
