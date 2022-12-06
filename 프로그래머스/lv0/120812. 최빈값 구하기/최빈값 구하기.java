class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int arr[] = new int[1001];
        int max = 0;
        int maxIndex = 0;
        int cnt = 0;
        
        for (int i = 0; i < array.length; i++) {
            arr[array[i]]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) cnt++;
        }
        
        if (cnt > 1) {
            return -1;
        } else {
            answer = maxIndex;
            return answer;
        }
    }
}