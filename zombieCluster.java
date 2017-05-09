.//some code

static int zombieCluster(String[] arr) {

        int visited[] = new int[arr.length];
        int count = 0 ;
        while(true){
            int start = -1;
            for(int i=0;i<visited.length;i++){
                if(visited[i]==0){
                    start = i;
                    break;
                }
            }
            if(start==-1){
                break;
            }
            count++;
            bfs(arr,start,visited);
        }
        return count;
    
    }
    static void bfs(String [] graph,int start,int visited[]){
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(start);
        while(!queue.isEmpty()){
            int item = queue.pop();
            visited[item] = 1;
            for(int i=0;i<graph.length;i++){
                if(graph[item].charAt(i)=='1' && visited[i]==0){
                    queue.add(i);
                }
            }
        }
    }
    //some code
