package com.cg.radhika;
/*
 * PROBLEM SOLVING QUES WITH SOLUTION 3/14 TEST CASES PASSED
 
 CACHE ENTRIES
implement a prototype of a simple cache query handler
 
there a n data entries stored in the cache. each entry if of the form{timestamp,key,value},where the timestamp
represents the time at which the entry was stored in the cache,
key represents the ID assigned to the cache entry, and value represents the data
value of entry, an integer represented as a string. The keys assigned to the cache
entries may not be unique.The cache query handler receives q query requests, where
each query is of the form{key,timestamp}, where key represents the ID of the cache entry to find,
and timestamp represents the time the entry was added
 
given two 2D arrays of strings, cache_entries, and queries of sizes n * 3
and q * 2 respectively , return an array of size q with the data values for each query.
 
 
example:
cache_entries = [["12:30:22","a2er5i80","125"],
["09:07:47","io09ju56","341"],
["01:23:09","a2er5i80","764"]]
queries = [["a2er5i80","01:23:09"],
           ["io09ju56","09:07:47"]
 
queries[0] corresponds to the data entry at index 2,
with value = "764"
 
queries[1] corresponds to the data entry at index 2,
with value = "341"
 
Return[764,341]
 */
import java.util.*;
import java.util.stream.*;
 
class Result {
    public static List<Integer> getQueryAnswers(List<List<String>> cache_entries, List<List<String>> queries) {
        List<Integer> results = new ArrayList<>();
        
        // Process each query
        for (List<String> query : queries) {
            String queryKey = query.get(0);
            String queryTimestamp = query.get(1);
            
            // Find the cache entry with the same key and the largest timestamp <= queryTimestamp
            Integer resultValue = null;
            for (List<String> entry : cache_entries) {
                String entryTimestamp = entry.get(0);
                String entryKey = entry.get(1);
                String entryValue = entry.get(2);
                
                // Check if the key matches and timestamp is <= queryTimestamp
                if (entryKey.equals(queryKey) && entryTimestamp.compareTo(queryTimestamp) <= 0) {
                    if (resultValue == null || entryTimestamp.compareTo(resultValue.toString()) > 0) {
                        // If it's the first valid entry or the timestamp is more recent
                        resultValue = Integer.valueOf(entryValue);
                    }
                }
            }
            
            // Add the found value to results
            results.add(resultValue);
        }
        
        return results;
    }
}
 
/*public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        
        int cache_entriesRows = Integer.parseInt(bufferedReader.readLine().trim());
        int cache_entriesColumns = Integer.parseInt(bufferedReader.readLine().trim());
        
        List<List<String>> cache_entries = new ArrayList<>();
        
        IntStream.range(0, cache_entriesRows).forEach(i -> {
            try {
                cache_entries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        int queriesRows = Integer.parseInt(bufferedReader.readLine().trim());
        int queriesColumns = Integer.parseInt(bufferedReader.readLine().trim());
        
        List<List<String>> queries = new ArrayList<>();
        
        IntStream.range(0, queriesRows).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        List<Integer> result = Result.getQueryAnswers(cache_entries, queries);
        
        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );
        
        bufferedReader.close();
        bufferedWriter.close();
    }
}*/
