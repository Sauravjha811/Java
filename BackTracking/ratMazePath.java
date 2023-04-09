package Recursion_3;
import java.io.*;
import java.util.*;
public class ratMazePath {
    public static void main(String[] args) {
        int maze[][] = {{1,1,0},{1,1,0},{1,1,1}};
        rMaze(maze,maze.length);
    }
    static void rMaze(int maze[][], int n)
    {
        int[][] path = new int[n][n];
        solveMaze(maze,path,0,0,n);
    }
    static void solveMaze(int[][] maze, int [][] path, int i, int j,int n)
    {
        if(i==n-1 && j==n-1){
            path[i][j]=1;
            printSol(path,n);
            System.out.println();
            return;
        }
        if(i>n-1 || i<0 || j>n-1 || j<0 || maze[i][j]==0 ||path[i][j]==1)
        {
            return;
        }
        path[i][j] = 1;
       
        solveMaze(maze, path, i-1, j, n);
        solveMaze(maze, path, i+1, j, n);
        solveMaze(maze, path, i, j-1, n);
        solveMaze(maze, path, i, j+1, n);
        path[i][j]=0;
    }
    static void printSol(int[][]path, int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(path[i][j]+" ");
            }
        }
    }
}
