class Solution {
    public String reverseWords(String s) {
        String answer = "";
        String local_word = "";
        for(int i = 0;i<s.length();i++){
            char current_char = s.charAt(i);
            if( current_char == ' '){
                if(local_word == "") continue;
                answer = " "+ local_word + answer;
                local_word = "";
            }else{
                local_word += current_char+"";
            }
        }
        answer = local_word + answer;
        answer = answer.charAt(0) == ' ' ? answer.substring(1) : answer;
        return answer;
        

    }
}