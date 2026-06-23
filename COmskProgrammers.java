import java.util.*;

class COmskProgrammers {

    private void dfs(long cur, long cost, long x,
            HashMap<Long, Long> map) {

        Long old = map.get(cur);
        if (old != null && old <= cost)
            return;

        map.put(cur, cost);

        if (cur == 0)
            return;

        long q = cur / x;
        long r = cur % x;

        // divide directly
        dfs(q, cost + 1, x, map);

        // increment to next multiple and divide
        long add = (r == 0 ? x : x - r);
        dfs(q + 1, cost + add + 1, x, map);
    }

    public long solve(long a, long b, long x) {

        HashMap<Long, Long> A = new HashMap<>();
        HashMap<Long, Long> B = new HashMap<>();

        dfs(a, 0, x, A);
        dfs(b, 0, x, B);

        long ans = Long.MAX_VALUE;

        for (Map.Entry<Long, Long> e1 : A.entrySet()) {
            long va = e1.getKey();
            long ca = e1.getValue();

            for (Map.Entry<Long, Long> e2 : B.entrySet()) {
                long vb = e2.getKey();
                long cb = e2.getValue();

                ans = Math.min(
                        ans,
                        ca + cb + Math.abs(va - vb));
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        COmskProgrammers sol = new COmskProgrammers();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long x = sc.nextLong();

            System.out.println(sol.solve(a, b, x));
        }
    }
}