import java.util.HashMap;

public class floodfill {
    public static void main(String[] args) {
        char ch[][]={{'X', 'X', 'X', 'X'}, 
       {'X', 'O', 'X', 'X'}, 
       {'X', 'O', 'O', 'X'}, 
       {'X', 'O', 'X', 'X'}, 
       {'X', 'X', 'O', 'O'}};
       
       

        for (int i = 1; i < ch.length-1; i++) {

            for (int j = 1; j < ch[i].length-1; j++) {
                HashMap<Character,Integer> map=new HashMap<>();
                if(ch[i][j]=='O')
                {


                    if(map.get(ch[i-1][j])==null )
                    {
                        map.put(ch[i-1][j],1);
                    }
                    else{
                    map.put(ch[i-1][j],map.get(ch[i-1][j])+1);
                    }

                    if(map.get(ch[i+1][j])==null )
                    {
                        map.put(ch[i+1][j],1);
                    }
                    else{
                    map.put(ch[i+1][j],map.get(ch[i+1][j])+1);
                    }

                    if(map.get(ch[i][j-1])==null )
                    {
                        map.put(ch[i][j-1],1);
                    }
                    else{
                    map.put(ch[i][j-1],map.get(ch[i][j-1])+1);
                    }

                    if(map.get(ch[i][j+1])==null )
                    {
                        map.put(ch[i][j+1],1);
                    }
                    else{
                    map.put(ch[i][j+1],map.get(ch[i][j+1])+1);
                    }


                    int x=map.getOrDefault('X',0);
                    int o=map.getOrDefault('O',0);

                   

                    if(o>=x)
                    {
                        ch[i][j]='X';

                    }



                }

            }
        }   




        for (int i = 1; i < ch.length-1; i++) {

            for (int j = 1; j < ch[i].length-1; j++) {
                HashMap<Character,Integer> map=new HashMap<>();
                if(ch[i][j]=='O')
                {


                    if(map.get(ch[i-1][j])==null )
                    {
                        map.put(ch[i-1][j],1);
                    }
                    else{
                    map.put(ch[i-1][j],map.get(ch[i-1][j])+1);
                    }

                    if(map.get(ch[i+1][j])==null )
                    {
                        map.put(ch[i+1][j],1);
                    }
                    else{
                    map.put(ch[i+1][j],map.get(ch[i+1][j])+1);
                    }

                    if(map.get(ch[i][j-1])==null )
                    {
                        map.put(ch[i][j-1],1);
                    }
                    else{
                    map.put(ch[i][j-1],map.get(ch[i][j-1])+1);
                    }

                    if(map.get(ch[i][j+1])==null )
                    {
                        map.put(ch[i][j+1],1);
                    }
                    else{
                    map.put(ch[i][j+1],map.get(ch[i][j+1])+1);
                    }


                    int x=map.getOrDefault('X',0);
                    int o=map.getOrDefault('O',0);

                   

                    if(x==4)
                    {
                        ch[i][j]='X';
                        


                    }



                }

            }
        }   



        for (int k = 0; k < ch.length; k++) {
            for (int index = 0; index < ch[k].length; index++) {
                System.out.print(ch[k][index]);
            }
            System.out.println();
        }

    }
}
