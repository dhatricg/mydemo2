package com.cg.Abhijeet;

class Result {
	 
    public static int countTeams(int teamSize_1, int teamSize_2, int p) {
        int minTeams = Integer.MAX_VALUE;
        // Try to form as many teams of teamSize_2 as possible
        for (int teamsOf2 = 0; teamsOf2 * teamSize_2 <= p; teamsOf2++) {
            int remainingParticipants = p - (teamsOf2 * teamSize_2);
            // Check if remaining participants can form teams of teamSize_1
            if (remainingParticipants % teamSize_1 == 0) {
                int teamsOf1 = remainingParticipants / teamSize_1;
                int totalTeams = teamsOf1 + teamsOf2;
                // Update minTeams with the minimum number of teams found
                minTeams = Math.min(minTeams, totalTeams);
            }
        }
        // If no valid team combination found, return -1
        return (minTeams == Integer.MAX_VALUE) ? -1 : minTeams;
    }
}
