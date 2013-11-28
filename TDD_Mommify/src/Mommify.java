/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-11-4
 * Time: 下午8:28
 * To change this template use File | Settings | File Templates.
 */
public class Mommify {

    public String convertMethod(String str) {
       int vowelnum = getVowelnum(str);
       if(vowelnum < (str.length() * 0.3)){
           return noMommifyConvert(str);
       }
       else{
           return mommifyConvert(str);
       }
    }

    private int getVowelnum(String str) {
        int vowelnum = 0;
        for(int i = 0; i < str.length(); i++){
            if (isVowel(str.charAt(i))) {
                vowelnum ++;
            }
        }
        return vowelnum;  //To change body of created methods use File | Settings | File Templates.
    }

    private boolean isVowel(char c) {
        if((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')){
            return true;
        }
        else{
            return false;
        }

    }
    // more than 30% , should  get mommified
    private String mommifyConvert(String str){
        String res = "";
        for(int i = 0; i < str.length(); i++){
            if(isVowel(str.charAt(i)) && !isPrefixVowel(str,i)){
                res = res + "mommy";
            }
            else if(isVowel(str.charAt(i)) && isPrefixVowel(str,i)){
                continue;
            }
            else{
                res = res + str.charAt(i);
            }
        }
        return res;  //To change body of created methods use File | Settings | File Templates.
    }

    private boolean isPrefixVowel(String str, int i) {
        if((i-1 >= 0) && (isVowel(str.charAt(i-1)))){
            return true;
        }
        else{
            return false;
        }
    }

    //less than 30%, should not get mommified
    private String noMommifyConvert(String str) {
        return str;
    }
}
