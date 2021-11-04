import java.util.*;

public class PRA3
{
    public static void main(String[] args)
    {
        Scanner sc;
        int T, numofSongs, maxSongs, time, beauty;
        int[][] songList;

        sc= new Scanner(System.in);

        T=sc.nextInt();
        for(int i=0;i<T;i++)
        {
            numofSongs=sc.nextInt();
            maxSongs=sc.nextInt();

            songList=new int[numofSongs][2];

            for(int k=0;k<numofSongs;k++)
            {
                time= sc.nextInt();
                songList[k][0]=time;

                beauty= sc.nextInt();
                songList[k][1]=beauty;
            }

            System.out.println(pleasureCalculate(songList, maxSongs));
        }

    }

    public static int pleasureCalculate(int songs[][], int maxSongs)
    {
        int result, smallest;

        result=0;

        sortHighToLow(songs);

        // finds the smallest pleasure
        smallest=0;
        for(int i=0;i<maxSongs;i++)
        {
            if(songs[i][1]<songs[smallest][1])
            {
                smallest=i;
            }
        }


        // add the song lengths
        for(int i=0;i<maxSongs;i++)
        {
            result+=songs[i][0];
        }

        //song length X smallest pleasure
        result*=songs[smallest][1];


        return result;
    }

    public static void sortHighToLow(int [][] songs)
    {
        int biggest;

        for(int i=0;i<songs.length;i++)
        {
          biggest=i;
          for(int j=i+1;j< songs.length;j++)
          {
              if(songs[j][1]>songs[biggest][1])
              {
                  swap(songs, i, j);
              }
          }

        }

    }

    public static void swap(int[][] songs, int index1, int index2)
    {
        int temp1, temp2;

        temp1=songs[index1][0];
        temp2=songs[index1][1];

        songs[index1][0]=songs[index2][0];
        songs[index1][1]=songs[index2][1];

        songs[index2][0]=temp1;
        songs[index2][1]=temp2;

    }

}
