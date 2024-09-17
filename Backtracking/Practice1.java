public class Practice1 {
    public static void printSolution(int sol[][]){
        for(int i=0;i<sol.length;i++){
            for(int j=0;j<sol.length;j++){
                System.out.println(sol[i][j]+" ");

            }
            System.out.println();

        }
    }
    public static boolean isSafe(int maze[][],int x,int y){
        //if x,y outside maze return false
        return(x>=0 && x<maze.length && y>=0 && y<maze.length && maze[x][y]==1);

    }
    public static boolean solve(int maze[][]){
        int n=maze.length;
        int sol[][]=new int [N][N];
        if(solveMazeUtil(maze,0,0,sol)==false){
            
        } 
    }
}
