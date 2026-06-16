class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet <String>  seen = new HashSet<>();
        for(int r=0; r<9 ; r++){
          for(int c=0; c<9 ; c++){
            char C = board[r][c];
            if(C == '.'){
              continue;
            }
            String row = C +" in row"+ r;
            String col = C + "in col"+ c;
            String sqa = C +"in square"+r/3+"-"+c/3;
            if(seen.contains(row)||seen.contains(col)||seen.contains(sqa)){
              return false;
            }
            seen.add(row);
            seen.add(col);
            seen.add(sqa);
          }
        }
        return true;
     }
}
