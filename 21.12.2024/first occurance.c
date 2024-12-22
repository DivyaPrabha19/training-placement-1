int strStr(char* haystack, char* needle) {
  int count = 0;
  int ptr = 0;
  int n_len = strlen(needle);
  int h_len = strlen(haystack);
  for(int i = 0; i < h_len; i++){
    ptr = i;
    for(int j = 0; j < n_len; j++){
      if(haystack[i] == needle[j]){
        count++;
        i++;
      }
      else{
        count = 0;
      }
    }
    if(count == n_len){
      return ptr;
    }
    count = 0;
    i = ptr;
  }
  return -1;
}
