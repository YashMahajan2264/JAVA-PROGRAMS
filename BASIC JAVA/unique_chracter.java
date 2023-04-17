 class UniqueCharactersDemo {

    public static void main(String[] args) {
      System.out.println(hasUniqueCharacters("hello"));
      
    }
    
    private static boolean hasUniqueCharacters(String str){
      for(char ch : str.toCharArray()){
        if(str.indexOf(ch) == str.lastIndexOf(ch))
          continue;
        else
          return false;
      }
      return true;
    }
  
  }