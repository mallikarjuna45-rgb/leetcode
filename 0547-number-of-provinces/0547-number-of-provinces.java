class Solution {
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<isConnected.length;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[0].length;j++){
                if(isConnected[i][j] == 1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int count=0;
        boolean visited[] = new boolean[isConnected.length];
        for(int i =0;i<isConnected.length;i++){
            if(!visited[i]){
                count++;
                dfs(i,adj,visited);
            }
        }
    return count;
    }
    public void dfs(int i,ArrayList<ArrayList<Integer>> adj ,boolean[] visited){
        visited[i]=true;
        for(Integer n : adj.get(i)){
            if (!visited[n]) 
            dfs(n,adj,visited);
        }
    }
}