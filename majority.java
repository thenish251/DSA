    class Majority {

    public int majorityWins(int arr[], int n, int x, int y) {
        int count_x = 0;
        int count_y = 0;

      
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) count_x++;
            if (arr[i] == y) count_y++;
        }

        if (count_x > count_y)
            return x;

        else if (count_y > count_x)
        
            return y;

        else if (x < y)
            return x;
        else
            return y;
    }
}

