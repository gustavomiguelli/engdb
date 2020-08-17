package teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueryProcessorUtils {
	
	public static List<Integer> processQuery(List<Integer> a, List<Integer> b, List<List<Integer>> queries) {
		List<Integer> results = new ArrayList<>();
		for (List<Integer> query : queries) {
			if (query.get(0) == 1) {
				Integer result = 0;
				for (int i = 0; i < a.size(); i++) {
					for (int j = 0; j < b.size(); j++) {
						if (a.get(i) + b.get(j) == query.get(1)) {
							result++;
						}
					}
				}
				results.add(result);
			} else {
				b.set(query.get(1), query.get(2));
			}
		}
		return results;
    }
	
	public static void main(String[] args) {
		// parâmetros teste 1
		List<Integer> a1 = Arrays.asList(1,2,3);
		List<Integer> b1 = Arrays.asList(3, 4);
		List<List<Integer>> queries1 = Arrays.asList(Arrays.asList(1,5), Arrays.asList(0,0,1), Arrays.asList(1,5));
		
		// parâmetros teste 2
		List<Integer> a2 = Arrays.asList(1,2,2);
		List<Integer> b2 = Arrays.asList(2, 3);
		List<List<Integer>> queries2 = Arrays.asList(Arrays.asList(1,4), Arrays.asList(0,0,3), Arrays.asList(1,5));
		
		// parâmetros teste 3
		List<Integer> a3 = Arrays.asList(1);
		List<Integer> b3 = Arrays.asList(2);
		List<List<Integer>> queries3 = Arrays.asList(Arrays.asList(1,2));
		
		// parâmetros teste 4
		List<Integer> a4 = Arrays.asList(1,1);
		List<Integer> b4 = Arrays.asList(3,3,3);
		List<List<Integer>> queries4 = Arrays.asList(Arrays.asList(0,1,1), Arrays.asList(1,0), Arrays.asList(1,2), Arrays.asList(1,1));
		
		// parâmetros teste 5
		List<Integer> a5 = Arrays.asList(5,6,4,4,10,6);
		List<Integer> b5 = Arrays.asList(8,3,0);
		List<List<Integer>> queries5 = Arrays.asList(Arrays.asList(1,12), Arrays.asList(1,2), Arrays.asList(1,4), Arrays.asList(1,1), Arrays.asList(1,12));
		
		
		long tempoInicio = System.currentTimeMillis();
		System.out.println("Resultado Teste 1: " + processQuery(a1, b1, queries1));
		System.out.println("Resultado Teste 2: " + processQuery(a2, b2, queries2));
		System.out.println("Resultado Teste 3: " + processQuery(a3, b3, queries3));
		System.out.println("Resultado Teste 4: " + processQuery(a4, b4, queries4));
		System.out.println("Resultado Teste 5: " + processQuery(a5, b5, queries5));
		System.out.println("Tempo total de execução: "+(System.currentTimeMillis()-tempoInicio)/1000.0 + "s");
	}

}
