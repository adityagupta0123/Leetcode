class Solution {
    public boolean isBipartite(int[][] graph) {
        int col[] = new int[graph.length];
        Arrays.fill(col, -1);
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int i =0; i<graph.length; i++){
            if(col[i] == -1){
                q.add(i);
                col[i] = 0;
                while(!q.isEmpty()){
                    int cur = q.remove();
                    for(int j =0; j< graph[cur].length; j++){
                        int e = graph[cur][j];
                        
                        if(col[e] == -1){
                            int nextCol = col[cur] == 0 ? 1: 0;
                            col[e] = nextCol;
                            q.add(e);
                        } else if ( col[e] == col[cur])
                            return false;
                    }
                }
            }
        }
        return true;
    }
    
}