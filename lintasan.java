package pacman;

public class lintasan {

    public char arr[][] = {{'#', '#', '#', '#', '#', '#', '#', '#', '#', '#',},
    {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
    {'#', '#', ' ', '@', ' ', '#', '#', '#', '#', '#'},
    {'#', ' ', ' ', ' ', ' ', '@', ' ', ' ', ' ', '#'},
    {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
    {'#', '#', '@', ' ', ' ', '#', ' ', ' ', ' ', '#'},
    {'#', ' ', '@', ' ', ' ', '#', '#', '#', '#', '#'},
    {'#', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', '#'},
    {'#', '@', ' ', '#', '#', ' ', ' ', ' ', ' ', '#'},
    {'#', ' ', ' ', ' ', '#', '#', ' ', ' ', ' ', '#'},
    {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}};

    
    int pindah = 20;
    int x;
    int y; 
    int score;

    public void koord(int x, int y) {
        this.x=x;
        this.y=y;
        arr[x][y] = '>';
        
    }
    public boolean play(){
        if(pindah>0&&score!=50){
            return true;
        }
        else{
            return false;
        }
    }

    public void w() {
        if (arr[x - 1][y]==(' ')){
            arr[x][y]=' ';
            arr[x - 1][y] = 'v';
            x=x-1;
            pindah=pindah-1;
        }
        else if (arr[x - 1][y]==('@')){
            arr[x][y]=' ';
            arr[x - 1][y] = 'v';
            x=x-1;
            score=score+10;
            pindah=pindah-1;
        }
        else if (arr[x - 1][y]==('#')){
            pindah=pindah-1;
        }
    }

    public void s() {
         if (arr[x + 1][y]==(' ')){
            arr[x][y]=' ';
            arr[x + 1][y] = '^';
            x=x+1;
            pindah=pindah-1;
        }
        else if (arr[x + 1][y]==('@')){
            arr[x][y]=' ';
            arr[x + 1][y] = '^';
            x=x+1;
            score=score+10;
            pindah=pindah-1;
        }
        else if (arr[x + 1][y]==('#')){
            pindah=pindah-1;
        }
    }

    public void d() {
         if (arr[x][y+1]==(' ')){
            arr[x][y]=' ';
            arr[x][y+1] = '<';
            y = y+1;
            pindah=pindah-1;
        }
        else if (arr[x][y+1]==('@')){
            arr[x][y]=' ';
            arr[x][y+1] = '<';
            y = y+1;
            score=score+10;
            pindah=pindah-1;
        }
        else if (arr[x][y+1]==('#')){
            pindah=pindah-1;
        }
    }

    public void a() {
         if (arr[x][y-1]==(' ')){
            arr[x][y]=' ';
            arr[x][y-1] = '>';
            y = y-1;
            pindah=pindah-1;
        }
        else if (arr[x][y-1]==('@')){
            arr[x][y]=' ';
            arr[x][y-1] = '>';
            y = y-1;
            score=score+10;
            pindah=pindah-1;
        }
        else if (arr[x][y-1]==('#')){
            pindah=pindah-1;
        }
    }
    public void display() {
        
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("Score = "+score);
        System.out.println("Sisa langkah = "+pindah);
        if (score == 50){
            System.out.println("You Win..");
        }
    }

}
