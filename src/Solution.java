class Solution {
    public String removeStars(String s) {

        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (Character c : chars) {
            if (sb == null) {
                return null;
            }
            if (c.equals('*')) {
                sb.deleteCharAt(sb.length() - 1);
            } else sb.append(c);
        }
        return sb.toString();
    }
}
