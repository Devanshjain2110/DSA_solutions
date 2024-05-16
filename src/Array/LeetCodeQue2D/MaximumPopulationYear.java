package Array.LeetCodeQue2D;

// https://leetcode.com/problems/maximum-population-year/
// Redid max year
public class MaximumPopulationYear {
    public static void main(String[] args) {
        int[][] logs = {{1993,1999},{2000,2010}};
        System.out.println(maximumPopulation(logs));
    }
    static int maximumPopulation(int[][] logs) {
        int[] years = new int[101];

        for(int[] log : logs) {
            years[log[0] - 1950]++;
            years[log[1] - 1950]--;
        }

        int maxNum = years[0];
        int maxYear = 1950;

        for(int i = 1 ; i < years.length; i++) {
            years[i] += years[i-1];
            if(years[i] > maxNum) {
                maxNum = years[i];
                maxYear = 1950 + i;
            }
        }
        return maxYear;
    }
}
