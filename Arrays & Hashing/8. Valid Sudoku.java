//https://leetcode.com/problems/valid-sudoku/
class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set set=new HashSet();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char ch=board[i][j];
                if(ch!='.'){
                    if(!set.add(ch+"row"+i) || !set.add(ch+"col"+j) || !set.add(ch+"row"+i/3+"col"+j/3)) return false;
                }
            }
        }
        return true;
    }
}
/*
9 × 9 Grid
   ↓
Visit every cell
   ↓
Ignore '.'
   ↓
Check 3 places
   ↓
ROW + COLUMN + BOX
   ↓
Set.add()
   ↓
Duplicate? → false
Otherwise → true
*/
