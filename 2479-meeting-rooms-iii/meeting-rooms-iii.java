class Solution {
    public int mostBooked(int n, int[][] meetings) {
        // n: The number of meeting rooms in the conference center.
        // meetings: A 2D array where each row represents a meeting [start_time, end_time].

        // Step 1: Sort the meetings by start time.
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);

        // Step 2: Initialize data structures.
        int[] roomCounts = new int[n]; // Array to count how many meetings each room has hosted.
        long[] freeTimes = new long[n]; // Array to track when each room becomes free.  'long' is used to prevent overflow with large numbers

        PriorityQueue<Integer> pq = new PriorityQueue<>(); // Priority queue to store available room numbers (lower numbers have higher priority).

        // Step 3: Initially, all rooms are available.
        for (int i = 0; i < n; i++) {
            pq.add(i); // Add room numbers to the priority queue.
        }

        // Step 4: Iterate through each meeting.
        for (int[] meeting : meetings) {
            int start = meeting[0]; // Extract meeting start time.
            int end = meeting[1]; // Extract meeting end time.

            // Step 5: Clean up pq - make sure only AVAILABLE rooms are in it.
            pq = new PriorityQueue<>(); // Reset PQ, start clean.
            for (int i = 0; i < n; i++) {
                if (freeTimes[i] <= start) {
                    pq.add(i);  //If this room is free now, add it to available list
                }
            }

            // Step 6: If there are available rooms, assign the room, else delay
            if (!pq.isEmpty()) {
                int room = pq.poll(); // Get the room number that has the earliest index
                roomCounts[room]++; // Increment meeting count for this room.
                freeTimes[room] = end; // This room will be available at this time.
            } else {
                // All rooms are booked, delay the meeting
                long minFreeTime = Long.MAX_VALUE; //Find min free time to know how long to delay
                int minFreeRoom = -1; //Store the index/room that's free at that time

                for (int j = 0; j < n; j++) {
                    if (freeTimes[j] < minFreeTime) {
                        minFreeTime = freeTimes[j];
                        minFreeRoom = j;
                    }
                }

                roomCounts[minFreeRoom]++; //Increment counter
                freeTimes[minFreeRoom] = Math.max(freeTimes[minFreeRoom], start) + (end - start); //If they were delayed, then they take that time
            }
        }

        // Step 7: Find the room that hosted the most meetings.
        int maxMeetings = 0;
        int mostUsedRoom = 0;

        for (int i = 0; i < n; i++) {
            if (roomCounts[i] > maxMeetings) {
                maxMeetings = roomCounts[i];
                mostUsedRoom = i; // The room index where the most meetings occurred.
            }
        }

        return mostUsedRoom; // Return the room number with the most meetings.
    }
}