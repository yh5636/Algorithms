package programmers.Level2;

import java.util.*;

public class 캐시 {

	static int cache_hit = 1;
	static int cache_miss = 5;

	public static void main(String[] args) {

		int answer = 0;

		int cacheSize = 3;
		String[] cities = { "Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA" };

		// 캐시사이즈가 0인경우
		if (cacheSize == 0)
			System.out.println(cities.length * cache_miss);
//		return cities.length * cache_miss;

		LinkedList<String> cache = new LinkedList<>();

		for (int i = 0; i < cities.length; i++) {
			String city = cities[i].toUpperCase();

			// 캐시 히트
			if (cache.remove(city)) {
				cache.addFirst(city);
				answer += cache_hit;
			} else {
				// 캐시 미스
				if (cacheSize == cache.size()) {
					cache.removeLast();
				}
				cache.addFirst(city);
				answer += cache_miss;
			}
		}
		System.out.println(answer);
//		return answer;
	}
}
