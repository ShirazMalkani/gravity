package gravity;

public class Game {
    private final int size = 5;;
    private int remaining = size * size;;
    private char[][] mat = new char[size][size];
    
    public boolean hasSpace(int i){
        
        for(int j = 0; j < size; ++j){
            if(mat[j][i] == 0)
                return true;
        }    
        return false;
    }
    
    int remainingEntries(){
        return remaining;
    }
 
    boolean isWinner(char choice){
        
        int count = 0;
        boolean flagWin = false;
        
        for(int i = 0; i < size; ++i){
            count = 0;
            for(int j = 0; j < size; ++j){
                if(mat[i][j] == choice){
                    ++count;
                    if(count == 4){
                        //System.out.println("a");
                        return true;
                    }
                }
                else{
                    count = 0;
                }
            }
        }
        count = 0;
        
        for(int i = 0; i < size; ++i){
            count = 0;
            for(int j = 0; j < size; ++j){
                if(mat[j][i] == choice){
                    ++count;
                    if(count == 4){
                        //System.out.println(i + " " + j + " b");
                        return true;
                    }
                }
                else{
                    count = 0;
                }
            }
        }
        count = 0;
        
        for(int i = 3, j = 0; i >= 0 && j <= 3; --i, ++j){
            
            if(mat[i][j] == choice){
                ++count;
                if(count == 4){
                        //System.out.println("c");
                    return true;
                }
            }
            else
                count = 0;
        }
        count = 0;
        
        for(int i = 4, j = 0; i >= 0 && j <= 4; --i, ++j){
            
            if(mat[i][j] == choice){
                ++count;
                if(count == 4){
                        //System.out.println("d");
                    return true;
                }
            }            
            else
                count = 0;
        }
        count = 0;
        
        for(int i = 4, j = 1; i >= 1 && j <= 4; --i, ++j){
            
            if(mat[i][j] == choice){
                ++count;
                if(count == 4){
                        //System.out.println("e");
                    return true;
                }
            }
            else
                count = 0;
        }
        count = 0;
        
        for(int i = 4, j = 3; i >= 1 && j >= 0; --i, --j){
            
            if(mat[i][j] == choice){
                ++count;
                if(count == 4){
                        //System.out.println("f");
                    return true;
                }
            }
            else
                count = 0;
        }
        count = 0;
        
        for(int i = 4, j = 4; i >= 0 && j >= 0; --i, --j){
            
            if(mat[i][j] == choice){
                ++count;
                if(count == 4){
                        //System.out.println("g");
                    return true;
                }
            }
            else
                count = 0;
        }
        count = 0;
        
        for(int i = 3, j = 4; i >= 0 && j >= 1; --i, --j){
            
            if(mat[i][j] == choice){
                ++count;
                if(count == 4){
                        //System.out.println("h");
                    return true;
                }
            }
            else
                count = 0;
        }
        return false;
    }
    
    void put(char choice, int col){
        
        int row = 0;
        
        for(int i = 0; i < size; ++i){
            if(mat[i][col] == 0){
                row = i;
                break;
            }
        }
        while(mat[row][col] == 0){
            ++row;
            if(row == size)
                break;
        }
        --row;
        --remaining;
        mat[row][col] = choice;
    }
    
    void putForceFully(char choice, int row, int col){
        mat[row][col] = choice;
    }
    
    void display(){
        
        for(int i = 0; i < size; ++i){
            for(int j = 0; j < size; ++j){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
    }

    void initialize() {
        
        for(int i = 0; i < size; ++i){
            for(int j = 0; j < size; ++j){
                mat[i][j] = 0;
            }
         }
    }
}
